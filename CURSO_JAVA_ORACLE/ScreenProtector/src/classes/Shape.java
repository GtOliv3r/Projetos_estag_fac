package classes;


import java.awt.*;
import java.util.Random;
public abstract class Shape {

	//Atributos
	
	
	private Color color;
	private int posX;
	private int posY;
	private int speedX;
	private int speedY;
	
	//Construtores
	public Shape(Color color, int posX, int posY){
		
		this.color = color;
		this.posX = posX;
		this.posY = posY;
		this.speedX = 1;
		this.speedY = 1;
	}
	
	//Metodos especificos
	
	public void move()	{
		this.posX+= this.speedX; // Nesse metodo, se não passar nenhum valor int speed, ele vai usar o  valor que esta salvo e vai continuar se movendo
		this.posY+= this.speedY;
	}
	
	public void move(int speed) {
		this.setSpeedX(speed); //Nesse metodo, se eu passar um novo int speed, ele salvará o novo valor em speed e usará ele para incrementar
		this.setSpeedY(speed);
		this.move();
		
	}
	
	public void move(int speedX,int speedY) {
		this.setSpeedX(speedX); //Nesse metodo, se eu passar um novo int speedX e um speedY, ele salvará o novos valores e usará eles para incrementar em suas coordenadas
		this.setSpeedY(speedY);
		this.move();
		
	}
	
	public void moveMaisX()	{
		this.posX+= (this.speedX); 
		}
	public void moveMenX()	{
		this.posX-= (this.speedX); 
		}
	public void moveMaisY()	{
		this.posY-= (this.speedY); 
		}
	public void moveMenY()	{
		this.posY+= (this.speedY); 
		}
	
	public abstract void draw(Graphics g);
	public abstract void changeDir(int limXmin,int limXmax,int limYmin,int limYmax);

	public Color colorGenerate() {
		int r,g,b;
		Random random = new Random();
		
		r = random.nextInt(255);
		g = random.nextInt(255);
		b = random.nextInt(255);
		
		return new Color(r,g,b);
	}
	
	//Metodos de acesso
		

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	
}
