package ejemplo3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BolaMovil extends JPanel {

		private static final long serialVersionUID = 5530896578737069488L;
		private int xCoord;
		private int yCoord;
		private int desplazamiento;
		private int radio;

		/**
		 * Create the panel.
		 */
		public BolaMovil() {
			this.xCoord = -1;
			this.yCoord = -1;
			this.desplazamiento = 5;
			this.radio = 20;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        
	        if(getXCoord()<0 || getY()<0) {
	            setXCoord(getWidth()/2-getRadio());
	            setYCoord(getHeight()/2-getRadio());
	        }
	        g.setColor(Color.RED);
	        g.fillOval(getXCoord(), getYCoord(), 2*radio, 2*radio);
		}
		
		
		
	    public void moverArriba() {
	        if(getYCoord()-getDesplazamiento() >= 0){
	        	setYCoord(getYCoord() - getDesplazamiento());
	        	repaint();
	        }
	    }
	    
	    public void moverAbajo() {
	    	if(getYCoord()+getDesplazamiento()+2*radio <= this.getHeight()){
	    		setYCoord(getYCoord() + getDesplazamiento());
	        	repaint();
	        }
	    }

	    public void moverDerecha() {
	        if(getXCoord() + getDesplazamiento()+2*radio <= this.getWidth()){
	      	  	setXCoord(getXCoord() + getDesplazamiento());
	      	  	repaint();
	        }
	    }
	    
	    public void moverIzquierda() {
	    	if(getXCoord() - getDesplazamiento() >= 0){
	    		setXCoord(getXCoord() - getDesplazamiento());
	    		repaint();
	      }
	    }
	    
	    public void centrar() {
	    	setXCoord(getWidth()/2-getRadio());
	        setYCoord(getHeight()/2-getRadio());
	    	repaint();
	      
	    }
	    
		public int getXCoord() {
			return xCoord;
		}

		public void setXCoord(int x) {
			if(x<= this.getWidth()-2*getRadio() && x >= 0)
				this.xCoord = x;
		}

		public int getYCoord() {
			return yCoord;
		}

		public void setYCoord(int y) {
			if(y<= this.getHeight()-2*getRadio() && y >= 0)
				this.yCoord = y;
		}

		public int getDesplazamiento() {
			return desplazamiento;
		}

		public void setDesplazamiento(int desplazamiento) {
			this.desplazamiento = desplazamiento;
		}
		
	    public int getRadio() {
			return radio;
		}

		public void setRadio(int radio) {
			this.radio = radio;
		}

	}

