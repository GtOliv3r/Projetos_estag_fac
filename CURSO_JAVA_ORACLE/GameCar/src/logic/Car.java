package logic;

public class Car {
	
	
	
	
	
	//toString
	
	//Atributos do Car
	private String color;
	private int speed;
	private int posX;
	private int posY;
	private int health;
	
	
	
	
	//################# Construtores ####################
	
	
	//Contrutor vazio, ou seja,se nenhum valor for passado como paramatro na classe
	//CarTester, o construtor irá instanciar o carro com valores numericos = 0 e Strings = null 
public Car () {
	
	}
	
//Contrutor com atributo color somente, ou seja, no caso se eu passar na classe CarTester somente a color
//Ele irá prencher somente o color, os outros atributos que eu não passei será = 0.
public Car (String color) {
	this.color = color;
}

//Contrutor com atributo color, posX e posY, ou seja, no caso se eu passar na classe CarTester esses valores
//Ele irá prencher com color, posY e posX, o health e speed será = 0.
public Car (String color,int posX, int posY) {
	this.color = color;
	this.posX = posX;
	this.posY = posY;
}

//Contrutor com todos os atributos, ele irá alocar todos os atributos com os valores que eu passei.
public Car (String color,int speed, int posX, int posY, int health) {
	this.color = color;   //Pegando o atributo passado na classe CarTester e alocando essa String ao atributo color;
	this.speed = speed;   //Pegando o atributo passado na classe CarTester e alocando esse Int ao atributo speed;
	this.posX = posX;     //Pegando o atributo passado na classe CarTester e alocando esse Int ao atributo posX;
	this.posY = posY;     //Pegando o atributo passado na classe CarTester e alocando esse Int ao atributo posY;
	this.health = health; ////Pegando o atributo passado na classe CarTester e alocando esse Int ao atributo health;
}

// ######################### FIM DOS CONSTRUTORES #############################################

	
	// #################### Metodos funcionais ##########################
	
	
	public void accelerate(){
		this.speed+=1;
	}
	
	public void accelerate(int speed){
		this.speed+=speed;
		if(this.speed<0)
			this.speed = 0;
	}
	
	//
	
	//Metodos de Acesso
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", posX=" + posX + ", posY=" + posY + ", health=" + health
				+ "]";
	}
	
	
	
}
