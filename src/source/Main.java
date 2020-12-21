package source;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Main extends Canvas implements Runnable
{
	private static final long serialVersionUID = 1L;
	public static STATE GAME_STATE = STATE.MENU;
	private boolean run;
	private Frame frame;
	private Menu menu;
	private Images images;
	private GameRoom playComputerRoom;
	private Thread thread;
	
	public Main()
	{
		run = false;
		frame = new Frame(this);
		menu = new Menu();
		images = new Images();
		playComputerRoom = new GameRoom();
		addMouseListener(menu);
	}
	public enum STATE
	{
		MENU,
		PLAY_COMPUTER_MODE,
		PLAY_ONLINE_MODE,
		SETTINGS_MODE,
	}
	public synchronized void start()
	{
		if(run)
			return;
		run = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop()
	{
		if(!run)
			return;
		run = false;
		try
		{
			thread.join();
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.exit(1);
	}
	public void run()
	{
		long lastTime = System.nanoTime();
        double amountOfUpdates = 60.0;
        double ns = 1000000000 / amountOfUpdates;
        double catchUp = 0;
        int updates = 0;
        int FPS = 0;
        long timerCheck = System.currentTimeMillis();
        while (run) 
        {
            long now = System.nanoTime();
            catchUp += (now - lastTime) / ns;
            lastTime = now;
            while (catchUp >= 1) 
            {
                update();
                updates++;
                catchUp--;
            }
            draw();
            FPS++;
            if (System.currentTimeMillis() - timerCheck > 1000) 
            {
                timerCheck += 1000;
                System.out.println("Updates: " + updates + ", FPS: " + FPS);
                FPS = 0;
                updates = 0;
            }
        }
        stop();
	}
	public void update() 
	{
		playComputerRoom.update();
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
		g.setColor(new Color(247, 247, 248));
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		if(GAME_STATE == STATE.MENU)
		{
			// menu screen
			menu.draw(g);
		}
		else if(GAME_STATE == STATE.PLAY_COMPUTER_MODE)
		{
			// play computer screen
			playComputerRoom.draw(g);
		}
		else if(GAME_STATE == STATE.PLAY_ONLINE_MODE)
		{
			// play online screen
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		}
		else if(GAME_STATE == STATE.SETTINGS_MODE)
		{
			// setting screen
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		}
		bs.show();
		g.dispose();
	}
	public static void main(String [] args)
	{
		new Main();
	}
}
