package ejemplo4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Boca {

	private int x;
	private int y;
	private Color color;
	private int grosor;
	private String tipo;
	
	public Boca() {
		 this.x=0;
		 this.y=0;
		 this.color = Color.RED;
		 this.grosor = 1;
		 this.tipo = "neutra";
	}
	
	public Boca(Color color) {
		 this.x=0;
		 this.y=0;
		 this.color = color;
		 this.grosor = 1;
		 this.tipo = "neutra";
	}
	
	public Boca(String tipo) {
		 this.x=0;
		 this.y=0;
		 this.color = Color.RED;;
		 this.grosor = 1;
		 this.tipo = tipo;
	}

	public Boca(int x, int y){
		 this.x=x;
		 this.y=y;
		 this.color = Color.RED;
		 this.grosor = 1;
		 this.tipo = "neutra";
	}

	public void pintar(Graphics g){
		g.setColor(color);
		
		Graphics2D g2 = (Graphics2D) g;
	    g2.setStroke(new BasicStroke(grosor));
	    switch(tipo){
	    case "neutra" :
	    	neutra(g2);
	    	break;
	    case "feliz" :
	    	feliz(g2);
	    	break;
	    case "triste" :
	    	triste(g2);
	    	break;
	    case "sorprendido" :
	    	sorprendido(g2);
	    	break;
	    default:
	    	neutra(g2);
	    }
	    
	}
	
	public void neutra(Graphics2D g2){
		g2.drawLine(getX(), getY(), 2*getX(), getY());
	}
	
	public void feliz(Graphics2D g2){
		g2.drawArc(getX(), getY(), getX(), (int) (getY()*0.2), 180, 180);
	}
	
	public void triste(Graphics2D g2){
		g2.drawArc(getX(), getY(), getX(), (int) (getY()*0.2), 0, 180);
	}
	
	public void sorprendido(Graphics2D g2){
		g2.drawArc(getX(), getY(), getX(), (int) (getY()*0.2), 0, 360);
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

	public int getGrosor() {
		return grosor;
	}

	public void setGrosor(int grosor) {
		this.grosor = grosor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
