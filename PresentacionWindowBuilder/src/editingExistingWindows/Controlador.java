package editingExistingWindows;


public class Controlador{

	private Cuadricula cuadricula;							//cuadricula y camino
	private Vista vista;

	public Controlador(){
		cuadricula = new Cuadricula();
		vista = new Vista(getCuadricula());

	}


	public Cuadricula getCuadricula() {
		return cuadricula;
	}

	public void setCuadricula(Cuadricula cuadricula) {
		this.cuadricula = cuadricula;
	}


	/**
	 * @return the vista
	 */
	public Vista getVista() {
		return vista;
	}


	/**
	 * @param vista the vista to set
	 */
	public void setVista(Vista vista) {
		this.vista = vista;
	}
}
