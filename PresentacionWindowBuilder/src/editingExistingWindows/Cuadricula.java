package editingExistingWindows;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.*;



class Cuadricula extends JPanel {

	private static final long serialVersionUID = 1L;
	private int densidad;													// numero de celdas que tiene la cuadricula
	private int nLineas;													// numero de lineas, sin contar los bordes, que tiene la cuadricula
	private int nivel;
	private Color color;													// color del camino
	private boolean pintarCamino;								// variable que nos va a indicar si debemos pintar el camino o no
	private boolean cambiarColor;								// variable que nos va a indicar si debemos cambiar el color del camino

	private Line2D linea;
	private BasicStroke stroke;
	private final int DELAY = 200;
	private Timer timer = new Timer(DELAY, new Listener());

	private int distanciaX;
	private int distanciaY;
	private ArrayList<Point> vectorPuntos;

	private final int FACTOR_RGB = 255;									// valor maximo que se puede alcanzar para obtener un color en rgb

	public Cuadricula(){
		new JPanel();
		color = Color.RED;
		densidad = 10;
		nLineas = densidad - 1;
		nivel = 0;
		distanciaX = 0;
		distanciaY = 0;
		pintarCamino = false;
		cambiarColor = false;
		
		vectorPuntos = new ArrayList<Point>();
		linea = new Line2D.Double();
		stroke = new BasicStroke(4f);
	}

	protected void paintComponent(Graphics g){

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		pintarCuadricula(g);

		g.setColor(getColor());
		
		if(isCambiarColor()){
			g.setColor(color);
			setCambiarColor(false);
		}

		if(isPintarCamino()){
			pintar(g2d);
		}

	}

	/**
	 * Metodo que se encarga de dibujar la cuadricula. Calcula el tamaño de los rectángulos según la densidad
	 * y tamaño de la vetana, tras lo cual, los pinta todos
	 * @param g
	 */
	private void pintarCuadricula(Graphics g){

	  int distanciaX = getWidth() / getDensidad();
	  int distanciaY = getHeight() / getDensidad();
	  if(getWidth() % getDensidad() >= 5)
			distanciaX++;
	  if(getHeight() % getDensidad() >= 5)
		  distanciaY++;

	  setDistanciaX(distanciaX);
	  setDistanciaY(distanciaY);

	  int x = distanciaX;
	  int y = distanciaY;
	  g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		
	  for (int i = 0; i < getnLineas(); i++){
		  g.drawLine(x, 0, x, getHeight());
		  g.drawLine(0, y, getWidth(), y);
		  x += getDistanciaX();
		  y += getDistanciaY();
	  }

	}
  
	/**
	 * Calcula la ruta desde el punto central a uno de los extremos, sin pasar dos veces por el mismo punto;
	 * por ello, se tiene en cuenta el haber llegado a un camino sin salida, que tras un número de iteraciones
	 *  determinado, se detiene
	 */
	public void calcularCamino(){									// numero de pixeles que se va a desplazar en el eje y
		borrar();
		int x;														// coordenada x a introducir en el vector de coordenadas x
		int y;														// coordenada y a introducir en el vector de coordenadas y
		Point puntoInicial;
	
		x = getDistanciaX() * (getDensidad() / 2);
		y = getDistanciaY() * (getDensidad() / 2);
	
		puntoInicial = new Point(x, y);
		getVectorPuntos().add(puntoInicial);
		
		int xAux = x;											// variable auxiliar para el punto x, para no perder el valor de x
		                                                         // en caso de que ya exista el punto
		int yAux = y;
		int signo;												// variable que nos va a decir el signo de la operacion a realizar,
																// si es un 1 es un mas y si es un 2 es un menos
		int coordenada;											// variable que nos va a indicar en que eje nos vamos a desplazar
																// si es un 1 nos desplazaremos por el eje x y si es un 2 nos desplazaremos por el eje y

		int iteracion = 0;
		Point punto;
		while(x > 0 && x <= getWidth() && y >  0 && y <= getHeight()){
			xAux = x;
			yAux = y;
	
			signo = (int) (Math.random() * 2 + 1);
			coordenada = (int) (Math.random() * 2 + 1);
	
			if(coordenada == 1){
				if (signo == 1)
					xAux += distanciaX;
				else if ( signo == 2)
					xAux -= distanciaX;
			}
			else if(coordenada == 2){
				if(signo == 1)
					yAux += distanciaY;
				else if(signo == 2)
					yAux -= distanciaY;
			}
			Point puntoAux = new Point(xAux, yAux);
			
			if(!getVectorPuntos().contains(puntoAux)){
				x = xAux;
				y = yAux;
				punto = new Point(x, y);
				getVectorPuntos().add(punto);
			}
			else
				iteracion++;
			
			if(iteracion > 2 * getDensidad()){
				borrar();
				x = (int) puntoInicial.getX();
				y = (int) puntoInicial.getY();
				getVectorPuntos().add(puntoInicial);
				iteracion = 0;
			}
		}

	}

	/**
	 * Metodo que pinta el camino, para la ruta ya calculada, mostrando el número de tramos
	 * que viene delimitado por el valor del atributo nivel, o el número de puntos del ruta
	 * @param g2d
	 */
	public void pintar(Graphics2D g2d){
		int x, y, x1, y1;
		for(int j = 0; j < getVectorPuntos().size() - 1 && j <= getNivel(); j++){
			x = (int) getVectorPuntos().get(j).getX();
			y = (int) getVectorPuntos().get(j).getY();
			x1 = (int) getVectorPuntos().get(j + 1).getX();
			y1 = (int) getVectorPuntos().get(j + 1).getY();
			linea.setLine(x, y, x1, y1);
			g2d.setStroke(stroke);
			g2d.draw(linea);

		}
	}

	/**
	 * Metodo que borra los vectores de coordenadas, para poder pintar un nuevo camino
	 */
	public void borrar(){
		getVectorPuntos().clear();
	}
	
	/**
	 * Calcula tres valores aleatorios para el color del tramo, según el modelo RGB
	 */
	public void colorAleatorio(){
		int r = (int) Math.round(Math.random() * getFACTOR_RGB());
		int g = (int) Math.round(Math.random() * getFACTOR_RGB());
		int b = (int) Math.round(Math.random() * getFACTOR_RGB());

		setColor(new Color(r, g, b));
	}

	public void empezar(){
		getTimer().start();
	}
	public void pausar(){
		getTimer().stop();
	}
	public void reanudar(){
		getTimer().restart();
	}

	/**
	 * Clase interna, que implementa un actionListener para el timer, que incrementa el valord del
	 * atributo nivel, y vuelve a pintar el camino
	 * @author Nicolás Hernández González
	 *
	 */
	class Listener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	setNivel(getNivel() + 1);
	    	repaint();
	    }
	}	

	public boolean isPintarCamino() {
		return pintarCamino;
	}

	public void setPintarCamino(boolean pintarCamino) {
		this.pintarCamino = pintarCamino;
	}
	public boolean isCambiarColor() {
		return cambiarColor;
	}

	public void setCambiarColor(boolean cambiarColor) {
		this.cambiarColor = cambiarColor;
	}

	public Color getColor() {
	return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getDensidad() {
		return densidad;
	}

	public void setDensidad(int densidad) {
		this.densidad = densidad;
		setnLineas(densidad - 1);
	}

	public int getnLineas() {
		return nLineas;
	}

	public void setnLineas(int nLineas) {
		this.nLineas = nLineas;
	}
	 
	public int getFACTOR_RGB() {
	  return FACTOR_RGB;
	}
	
	public ArrayList<Point> getVectorPuntos() {
	  return vectorPuntos;
	}
	
	public void setVectorPuntos(ArrayList<Point> vectorPuntos) {
	  this.vectorPuntos = vectorPuntos;
	}

	
	public int getNivel() {
	  return nivel;
	}
	
	public void setNivel(int nivel) {
	  this.nivel = nivel;
	}

	public int getDistanciaX() {
		return distanciaX;
	}

	public void setDistanciaX(int distanciaX) {
		this.distanciaX = distanciaX;
	}

	public int getDistanciaY() {
		return distanciaY;
	}

	public void setDistanciaY(int distanciaY) {
		this.distanciaY = distanciaY;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public Line2D getLinea() {
		return linea;
	}

	public void setLinea(Line2D linea) {
		this.linea = linea;
	}
	public BasicStroke getStroke() {
  		return stroke;
  	}

  	public void setStroke(BasicStroke stroke) {
  		this.stroke = stroke;
  	}

  	public int getDELAY() {
  		return DELAY;
  	}


  }
