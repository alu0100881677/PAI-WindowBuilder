package editingExistingWindows;
import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * Frame con la Cuadrícula del camino y los diferentes botones para su manejo.
 * Consta de diferentes opciones para mostrarla
 * @Asignatura Programación de Applicaciones Interactivas
 * @author Nicolás Hernández González
 * @Fecha 19.04.2017
 * @Email alu0100898293@ull.edu.es
 * @Universidad Universidad de La Laguna (ULL)
 * @Practica Practica 10 Camino Aleatorio
 *
 **/
public class Vista extends JFrame{

	private static final long serialVersionUID = 1L;
	private final int ALTO_VENTANA = 500;
	private final int ANCHO_VENTANA = 800;
	private final String TITULO_VENTANA = "Caminos Aleatorios";
	private PanelBotones botonPanel;
	private Cuadricula cuadriculaPanel;

	
	public Vista(Cuadricula cuadricula){
		this.cuadriculaPanel = cuadricula;
		botonPanel = new PanelBotones(getCuadriculaPanel());

		setSize(getANCHO_VENTANA(), getALTO_VENTANA());
		setTitle(getTITULO_VENTANA());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        this.add(getCuadriculaPanel());
        this.add(getBotonPanel(), BorderLayout.SOUTH);

		setVisible(true);
	}


	public int getALTO_VENTANA() {
		return ALTO_VENTANA;
	}

	public int getANCHO_VENTANA() {
		return ANCHO_VENTANA;
	}

	public String getTITULO_VENTANA() {
		return TITULO_VENTANA;
	}

	/**
	 * @return the botonPanel
	 */
	public PanelBotones getBotonPanel() {
		return botonPanel;
	}

	/**
	 * @param botonPanel the botonPanel to set
	 */
	public void setBotonPanel(PanelBotones botonPanel) {
		this.botonPanel = botonPanel;
	}

	/**
	 * @return the cuadriculaPanel
	 */
	public Cuadricula getCuadriculaPanel() {
		return cuadriculaPanel;
	}

	/**
	 * @param cuadriculaPanel the cuadriculaPanel to set
	 */
	public void setCuadriculaPanel(Cuadricula cuadriculaPanel) {
		this.cuadriculaPanel = cuadriculaPanel;
	}


}
