package classes;

import java.awt.*;
public class Ellipse extends Rectangle{
	
	public Ellipse (Color color, int posX,int posY, int width, int heigth) {
		super(color,posX,posY,width,heigth);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		g.fillOval(super.getPosX(), super.getPosY(), super.getWidth(), super.getHeight());
	}

}
