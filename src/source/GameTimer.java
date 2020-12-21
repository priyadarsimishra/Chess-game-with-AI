package source;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameTimer implements Component
{
	private int hours;
	private int minutes;
	private int seconds;
	private int counter;
	private String location;
	
	public GameTimer(int hours,int minutes,int seconds, String location) 
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.location = location;
	}
	/**
	 * 
	 */
	public void update()
	{
		if(seconds >= 0)
		{
			if(counter%60 == 0)
			{
				seconds--;
			}
			counter++;
		}
	}
	/**
	 * 
	 * @param g
	 * @param location
	 */
	public void draw(Graphics g)
	{
		if(location.equalsIgnoreCase("top"))
		{
			drawTime(g,1028, 135, "top");
		}
		else if(location.equalsIgnoreCase("bottom"))
		{
			drawTime(g,1028, Frame.HEIGHT-85, "bottom");
		}
	}
	
	public void drawTime(Graphics g, int x, int y, String location)
	{
		g.setFont(new Font("Arial",Font.BOLD,80));
		g.setColor(Color.WHITE);
		formatTime();
		if(seconds < 10)
		{
			g.drawString(hours+":"+minutes+":0"+seconds, x, y);
		}
		else
		{
			g.drawString(hours+":"+minutes+":"+seconds, x, y);
		}
	}
	
	private void formatTime()
	{
		if(seconds < 0)
		{
			seconds = 59;
			minutes--;
		}
		if(minutes < 0)
		{
			minutes = 59;
			hours--;
		}
		if(hours == 0 && minutes == 0 && seconds == 0)
		{
			// end game
		}
	}
}
