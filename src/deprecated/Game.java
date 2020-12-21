package deprecated;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable
{
	private static final long serialVersionUID = 1L;
	private final int FPS = 60;
    private final long NS_PER_UPDATE = (long)((1.0d/FPS) * 1000000000);
	private Frame frame;
	private Board board; 
	private ImageLoader imageLoader;
	private Thread chessThread;
	private boolean gameRunning;
	
	public Game()
	{
		gameRunning = false;
		imageLoader = new ImageLoader();
		frame = new Frame(this);
		board = new Board(imageLoader);
	}
	public static void main(String [] args)
	{
		new Game();
	}
	public synchronized void start()
	{
		if(gameRunning)
			return;
		gameRunning = true;
		chessThread = new Thread(this);
		chessThread.start();
	}
	public synchronized void stop()
	{
		if(!gameRunning)
			return;
		gameRunning = false;
		try
		{
			chessThread.join();
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.exit(1);
	}
	public void run()
	{
		getImages();
		long lastTime = System.nanoTime();
		double amountOfUpdates = 60.0;
		double ns = 1000000000/amountOfUpdates;
		double catchUp  = 0;
		int updates = 0;
		int FPS = 0;
		long timerCheck = System.currentTimeMillis();
		while(gameRunning)
		{
			long now = System.nanoTime();
			catchUp += (now-lastTime)/ns;
			lastTime = now;
			while(catchUp>=1)
			{
				update();
				updates++;
				catchUp--;
			}
			draw();
			FPS++;
			if(System.currentTimeMillis() - timerCheck>1000)
			{
				timerCheck+=1000;
//				System.out.println("Updates: "+updates+", FPS: "+FPS);			
				FPS = 0;
				updates = 0;
			}
		}		
		stop();	
	}
	public void getImages()
	{
		requestFocus();
		addMouseListener(board);
		addMouseMotionListener(board);
		imageLoader.loadImages();
	}
	public void update()
	{
		board.update();
	}
	public void draw()
	{
		BufferStrategy bs = this.getBufferStrategy();		
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		// board drawing
		board.draw(g);
		
		bs.show();
		g.dispose();
	}
}
