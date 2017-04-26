package ejemplo4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class IntFrameCara extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntFrameCara frame = new IntFrameCara();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntFrameCara() {
		super("Cara random",true, true, true, true);
		setPreferredSize(new Dimension(100, 100));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		String[] tipo = {"neutra", "feliz", "triste"};
		int indice = (int) Math.round(Math.random() * 2);
		
		Cara cara = new Cara(tipo[indice]);
		getContentPane().add(cara, BorderLayout.CENTER);

	}
	
	public IntFrameCara(String tipo) {
		super("Cara ",true, true, true, true);
		setPreferredSize(new Dimension(100, 100));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		Cara cara = new Cara(tipo);
		getContentPane().add(cara, BorderLayout.CENTER);

	}

}
