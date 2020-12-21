package source;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Menu extends MouseAdapter implements Component
{
	private int optionBoxWidth;
	private int optionBoxHeight;
	
	
	public Menu()
	{
		optionBoxWidth = 251;
		optionBoxHeight = 351;
	}
	
	public void update() {}
	
	/***
	 * This method is responsible for drawing all the 
	 * UI elements on the Menu, by calling methods that draw
	 * specific portions.
	 * 
	 * @param g graphics parameter used for drawing
	 */
	public void draw(Graphics g)
	{
		drawMainMenuDetails(g);
		
	}
	/***
	 * This method draws the Title, description of Chess
	 * and it also draws the two player options. 
	 * 
	 * @param g graphics parameter used for drawing
	 */
	public void drawMainMenuDetails(Graphics g)
	{
		// Chess Title
		g.setColor(new Color(85, 179, 243));
		g.setFont(new Font("Arial",Font.BOLD,120));
		g.drawString("Chess",Frame.WIDTH/2-190,Frame.HEIGHT/2-350);
		g.setFont(new Font("Arial",Font.BOLD,36));
		// Chess Description 
		g.setColor(Color.BLACK);
		g.fill3DRect(Frame.WIDTH/3-355,Frame.HEIGHT/2+100,3*(Frame.WIDTH/3)-370+155,300,true);
		
		// ---------------- User Options ---------------- // 
		// -- Play the Computer		
		g.setColor(new Color(226, 0, 73));
		g.fill3DRect(Frame.WIDTH/3-355,Frame.HEIGHT/2-321,optionBoxWidth,optionBoxHeight,true);
		g.setColor(Color.WHITE);
		g.drawString("PLAY THE", Frame.WIDTH/3-318, Frame.HEIGHT/2-20);
		g.drawString("COMPUTER", Frame.WIDTH/3-332, Frame.HEIGHT/2+15);
		g.drawImage(Images.option1BoxImage,Frame.WIDTH/3-352,Frame.HEIGHT/2-315,260,260,null);
		
		// -- Play another person(online)
		g.setColor(new Color(15, 10, 60));
		g.fill3DRect(2*(Frame.WIDTH/3)-355,Frame.HEIGHT/2-321,optionBoxWidth,optionBoxHeight,true);
		g.setColor(Color.WHITE);
		g.drawString("PLAY", 2*(Frame.WIDTH/3)-280, Frame.HEIGHT/2-20);
		g.drawString("ONLINE", 2*(Frame.WIDTH/3)-300, Frame.HEIGHT/2+15);
		g.drawImage(Images.option2BoxImage,2*(Frame.WIDTH/3)-358,Frame.HEIGHT/2-290,257,240,null);
		
		// -- Settings
		g.setColor(new Color(0, 159, 157));
        g.fill3DRect(3*(Frame.WIDTH/3)-355,Frame.HEIGHT/2-321,optionBoxWidth,optionBoxHeight,true);
        g.setColor(Color.WHITE);
		g.drawString("SETTINGS", 3*(Frame.WIDTH/3)-320, Frame.HEIGHT/2+5);
		g.drawImage(Images.option3BoxImage,3*(Frame.WIDTH/3)-365,Frame.HEIGHT/2-280,260,260,null);
	}
	
	/**
	 * This method handles all the mousePressed events, and is
	 * automatically fired, when mouse is clicked on the menu
	 * 
	 * @param e variable to access any mouse interaction
	 */
	public void mousePressed(MouseEvent e)
	{
		int mx = e.getX();
		int my = e.getY();
		String boxClicked = determineBoxClicked(mx,my);
		if(boxClicked.equals("OPTION 1"))
		{
			Main.GAME_STATE = Main.STATE.PLAY_COMPUTER_MODE;
		}
		else if(boxClicked.equals("OPTION 2"))
		{
			Main.GAME_STATE = Main.STATE.PLAY_ONLINE_MODE;
		}
		else if(boxClicked.equals("OPTION 3"))
		{
			Main.GAME_STATE = Main.STATE.SETTINGS_MODE;
		}
			
	}
	
	/***
	 * This method determines which option box was clicked
	 * and depending on the option box it returns a String, which
	 * specifies which box was clicked. This is done by comparing the (mx)
	 * and (my) values with the boxes dimensions.
	 * 
	 * @param mx the mouse click's x position
	 * @param my the mouse click's y position
	 * @return a String just specifies which option number was clicked
	 */
	public String determineBoxClicked(int mx, int my)
	{
		if(mx >= Frame.WIDTH/3-355 && mx <= Frame.WIDTH/3-355 + optionBoxWidth)
		{
			if(my >= Frame.HEIGHT/2-321 && my <= Frame.HEIGHT/2-321 + optionBoxHeight)
			{
				return "OPTION 1";
			}
		}
		else if(mx >= 2*(Frame.WIDTH/3)-355 && mx <= 2*(Frame.WIDTH/3)-355 + optionBoxWidth)
		{
			if(my >= Frame.HEIGHT/2-321 && my <= Frame.HEIGHT/2-321 + optionBoxHeight)
			{
				return "OPTION 2";

			}
		}
		else if(mx >= 3*(Frame.WIDTH/3)-355 && mx <= 3*(Frame.WIDTH/3)-355 + optionBoxWidth)
		{
			if(my >= Frame.HEIGHT/2-321 && my <= Frame.HEIGHT/2-321 + optionBoxHeight)
			{
				return "OPTION 3";

			}
		}
		return "";
	}
}
