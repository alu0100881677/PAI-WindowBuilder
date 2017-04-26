package ejemplo4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Nariz {

	private int x;
	private int y;
	private Color color;
	
	public Nariz() {
		 this.x=0;
		 this.y=0;
		 this.color = Color.CYAN;
	}

	public Nariz(int x, int y){
		 this.x=x;
		 this.y=y;
		 this.color = Color.CYAN;
	}
	
	public Nariz(Color color){
		 this.x=0;
		 this.y=0;
		 this.color = color;
	}

	public void pintar(Graphics g){
		g.setColor(getColor());
		
	    Polygon pol = new Polygon();
	    pol.addPoint(getX(), getY()-15);
	    pol.addPoint(getX()+15, getY()+15);
	    pol.addPoint(getX()-15,getY()+15);
	    g.fillPolygon(pol);
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

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
