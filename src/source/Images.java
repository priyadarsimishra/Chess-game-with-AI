package source;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Images 
{
	/**
	 * ImageIcons and Image fields
	 */
	private ImageIcon option1BoxIcon;
	public static Image option1BoxImage;
	private ImageIcon option2BoxIcon;
	public static Image option2BoxImage;
	private ImageIcon option3BoxIcon;
	public static Image option3BoxImage;
	/***
	 * Constructor for Images class, this class is responsible for
	 * holding static constants for all the images in this application
	 */
	public Images()
	{
		//option 1 box
		option1BoxIcon = new ImageIcon(this.getClass().getResource("/res/option1box.png"));
		option1BoxImage = option1BoxIcon.getImage();
		//option 2 box
		option2BoxIcon = new ImageIcon(this.getClass().getResource("/res/option2box.png"));
		option2BoxImage = option2BoxIcon.getImage();
		//option 3 box
		option3BoxIcon = new ImageIcon(this.getClass().getResource("/res/option3box.png"));
		option3BoxImage = option3BoxIcon.getImage();
	}
}
