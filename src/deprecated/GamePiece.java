package deprecated;

import java.awt.Graphics;

public interface GamePiece 
{	
	public abstract void update();
	public abstract void draw(Graphics g);
	public abstract String toString();
	public abstract boolean validMove();
	public abstract int getX();
	public abstract int getY();
	public abstract void setX(int x);
	public abstract void setY(int y);
}
