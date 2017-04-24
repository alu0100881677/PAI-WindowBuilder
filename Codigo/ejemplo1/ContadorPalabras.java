package ejemplo1;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;

public class ContadorPalabras extends JScrollPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4016464325456420052L;
	private Vocabulario analizador;
	private String fichero;
	private JTextArea textArea;
	
	/**
	 * Create the panel.
	 */
	public ContadorPalabras() {
		setLayout(new ScrollPaneLayout());
		
		textArea = new JTextArea();
		setViewportView(textArea);
		analizador = new Vocabulario();
		fichero = "";
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(!fichero.isEmpty())
			try {
				textArea.setText(analizador.analizar(fichero));
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			textArea.setText("");
	}

	/**
	 * @return the fichero
	 */
	public String getFichero() {
		return fichero;
	}

	/**
	 * @param fichero the fichero to set
	 */
	public void setFichero(String fichero) {
		this.fichero = fichero;
	}
}
