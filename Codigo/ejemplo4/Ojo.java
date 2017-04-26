package ejemplo4;

import java.awt.Color;
import java.awt.Graphics;

public class Ojo {

	private int x;
	private int y;
	private Color color;
	private String tipo;
	
	public Ojo() {
		 this.x=0;
		 this.y=0;
		 this.color = Color.BLUE;
		 this.tipo = "circular";
	}

	public Ojo(int x, int y){
		 this.x=x;
		 this.y=y;
		 this.color = Color.BLUE;
		 this.tipo = "circular";
	}
	
	public Ojo(Color color){
		 this.x=0;
		 this.y=0;
		 this.color = color;
	}
	
	public void pintar(Graphics g){
		g.setColor(color);
		switch(getTipo())
		{
		case "circular":
			g.fillOval(getX(), getY(), 25, 25);
			break;
		case "ovalado":
			g.fillOval(getX(), getY(), 20, 35);
			break;
		default:
			g.fillOval(getX(), getY(), 25, 25);
		}
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setCoordenadas(int x, int y){
		setX(x);
		setY(y);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
