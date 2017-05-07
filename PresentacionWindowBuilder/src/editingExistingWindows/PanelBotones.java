package editingExistingWindows;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelBotones extends JPanel {

	private static final long serialVersionUID = 1L;
	private Cuadricula cuadricula;
	
	public PanelBotones(Cuadricula cuadricula){
		this.cuadricula = cuadricula;
		annadirBotones();
		
	}

	public void annadirBotones(){
		JButton empezar = new JButton("Empezar");
		JButton finalizar = new JButton("Finalizar");
		JButton pausar = new JButton("Pausar");
		JButton reanudar = new JButton("Reanudar");
		JButton color = new JButton("Color");																						// Botón que va a cambiar el color del camino a uno aleatorio
		JLabel etiqueta = new JLabel(" Introduzca Densidad:");																						// Etiqueta para saber que se va a modificar con el cuadro de texto
		JTextField densidad = new JTextField();	
		
		densidad.setColumns(5);
		setLayout(new GridLayout(1, 2));
		
		empezar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						getCuadricula().calcularCamino();
						getCuadricula().setNivel(0);
						getCuadricula().setPintarCamino(true);
						getCuadricula().empezar();
						getCuadricula().repaint();
					}
				}
		);
		
		finalizar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						getCuadricula().setPintarCamino(false);
						getCuadricula().borrar();
						getCuadricula().repaint();	
					}
				}
		);
		
		pausar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						getCuadricula().pausar();
						getCuadricula().repaint();
					}
				}
		);
		
		reanudar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						getCuadricula().reanudar();
						getCuadricula().repaint();
					}
				}
		);		
		
		color.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						getCuadricula().colorAleatorio();
						getCuadricula().repaint();
					}
				}
		);
		
		densidad.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(Integer.parseInt(densidad.getText()) > 1){
							getCuadricula().setDensidad(Integer.parseInt(densidad.getText()));
							getCuadricula().borrar();
							getCuadricula().setPintarCamino(false);
							getCuadricula().repaint();
						}
					}
				}
		);
		

		

		JPanel izq = new JPanel();
		izq.setLayout(new GridLayout(2, 2, 5,2));
		JPanel der = new JPanel();
		der.setLayout(new BorderLayout());

		izq.add(empezar);
		izq.add(finalizar);
		izq.add(pausar);
		izq.add(reanudar);
		
		der.add(color, BorderLayout.NORTH);
		der.add(etiqueta, BorderLayout.CENTER);
		der.add(densidad, BorderLayout.SOUTH);

		add(izq);
		add(der);
	}


	/**
	 * @return the cuadricula
	 */
	public Cuadricula getCuadricula() {
		return cuadricula;
	}

	/**
	 * @param cuadricula the cuadricula to set
	 */
	public void setCuadricula(Cuadricula cuadricula) {
		this.cuadricula = cuadricula;
	}


}
