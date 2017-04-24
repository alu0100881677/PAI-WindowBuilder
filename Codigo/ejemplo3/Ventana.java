package ejemplo3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 6086448755699935870L;
	private JPanel contentPane;
	private BolaMovil bolaMovil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnArriba = new JButton("Arriba");
		btnArriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBolaMovil().moverArriba();
				getBolaMovil().repaint();
			}
		});
		panel.add(btnArriba, BorderLayout.NORTH);
		
		JButton btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBolaMovil().moverIzquierda();
				getBolaMovil().repaint();
			}
		});
		panel.add(btnIzquierda, BorderLayout.WEST);
		
		JButton btnAbajo = new JButton("Abajo");
		btnAbajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBolaMovil().moverAbajo();
				getBolaMovil().repaint();
			}
		});
		panel.add(btnAbajo, BorderLayout.SOUTH);
		
		JButton btnCentrar = new JButton("Centrar");
		btnCentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBolaMovil().centrar();
				getBolaMovil().repaint();
			}
		});
		panel.add(btnCentrar, BorderLayout.CENTER);
		
		JButton btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getBolaMovil().moverDerecha();
				getBolaMovil().repaint();
			}
		});
		panel.add(btnDerecha, BorderLayout.EAST);
		
		bolaMovil = new BolaMovil();
		contentPane.add(bolaMovil, BorderLayout.CENTER);
	}

	/**
	 * @return the bolaMovil
	 */
	public BolaMovil getBolaMovil() {
		return bolaMovil;
	}

	/**
	 * @param bolaMovil the bolaMovil to set
	 */
	public void setBolaMovil(BolaMovil bolaMovil) {
		this.bolaMovil = bolaMovil;
	}

}
