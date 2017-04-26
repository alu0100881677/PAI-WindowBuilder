package ejemplo4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Clase que extiende hereda de JPanel, y crea una cara a partir des tres círculos, un polígono y una
 * línea colocadas en posiciones determinadas por el ancho de la ventana
 * @Asignatura Programación de Aplicaciones Interacitvas
 * @author Nicolás Hernández González
 * @Fecha 29.03.2017
 * @Email alu0100898293@ull.edu.es
 * @Universidad Universidad de La Laguna (ULL)
 * @Practica Practica 8
 *
 **/
@SuppressWarnings("serial")
public class Cara extends JPanel{

	private int x;
	private int y;
	private Ojo ojoIzquierdo;
	private Ojo ojoDerecho;
	private Nariz nariz;
	private Boca boca;
	private String tipoBoca;
	
	public Cara(){
		this.x = 5;
		this.y = 5;
		this.ojoDerecho = new Ojo(Color.BLUE);
		this.ojoIzquierdo = new Ojo(Color.BLUE);
		this.nariz = new Nariz(Color.ORANGE);
		this.boca = new Boca(Color.RED);
		this.tipoBoca = "neutra";
	}
	
	public Cara(String[] args){
		this.x = Integer.parseInt(args[0]);
		this.y = Integer.parseInt(args[1]);
		this.ojoDerecho = new Ojo(Color.BLUE);
		this.ojoIzquierdo = new Ojo(Color.BLUE);
		this.nariz = new Nariz(Color.ORANGE);
		this.boca = new Boca(Color.RED);
		this.tipoBoca = "neutra";
	}
	
	public Cara(String tipo){
		this.x = 5;
		this.y = 5;
		this.ojoDerecho = new Ojo(Color.BLUE);
		this.ojoIzquierdo = new Ojo(Color.BLUE);
		this.nariz = new Nariz(Color.ORANGE);
		this.boca = new Boca(Color.RED);
		this.tipoBoca = tipo;
	}
	
	/**
	 * A partir del ancho de la ventana, crea un círculo vacìo de un ancho ligeramente inferior 
	 * al tamaño de la ventana, seguidamente dos circulos rellenos en torno al primer tercio de la ventana;
	 * un triangulo, que corresponde a un polígono de tres puntos, y una línea en en el ultimo tercio.
	 */
	  protected void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    
		    int diametro = min(getWidth(),getHeight())-max(x,y)-10;		    
		    
		    //Contorno de la cara
		    g.drawOval(getX(), getY(), diametro-getX(), diametro-getY());
		    
		    //Ojos
		    getOjoIzquierdo().setCoordenadas((getX()+diametro)/3-10, (getY()+diametro)/3);
		    getOjoDerecho().setCoordenadas(2*((getX()+diametro)/3-10), (getY()+diametro)/3);
		    getOjoIzquierdo().setTipo("circular");
		    getOjoDerecho().setTipo("circular");
		    ojoIzquierdo.pintar(g);
		    ojoDerecho.pintar(g);
		    
		    //Boca
		    getBoca().setCoordenadas((getX()+diametro)/3, 2*((getY()+diametro)/3));
		    getBoca().setColor(Color.RED);
		    getBoca().setGrosor(diametro/30);
		    getBoca().setTipo(getTipoBoca());
		    boca.pintar(g);
		    
		    //Nariz
		    getNariz().setCoordenadas((getX()+diametro)/2, (getY()+diametro)/2);
		    nariz.pintar(g);
		    
		    
		    
	  }
	  
		/**
		 * Función privada, que retorna el máximo de dos enteros
		 * @param a valor a comparar
		 * @param b valor a comparar
		 * @return El valor de a si es mayor que b, si no, el valor de b
		 */
		private int min(int a, int b){
			return a < b ? a : b;
		}
		
		private int max(int a, int b){
			return a > b ? a : b;
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

		public Ojo getOjoIzquierdo() {
			return ojoIzquierdo;
		}

		public void setOjoIzquierdo(Ojo ojoIzquierdo) {
			this.ojoIzquierdo = ojoIzquierdo;
		}

		public Ojo getOjoDerecho() {
			return ojoDerecho;
		}

		public void setOjoDerecho(Ojo ojoDerecho) {
			this.ojoDerecho = ojoDerecho;
		}

		public Nariz getNariz() {
			return nariz;
		}

		public void setNariz(Nariz nariz) {
			this.nariz = nariz;
		}

		public Boca getBoca() {
			return boca;
		}

		public void setBoca(Boca boca) {
			this.boca = boca;
		}

		/**
		 * @return the tipoBoca
		 */
		public String getTipoBoca() {
			return tipoBoca;
		}

		/**
		 * @param tipoBoca the tipoBoca to set
		 */
		public void setTipoBoca(String tipoBoca) {
			this.tipoBoca = tipoBoca;
		}

}
