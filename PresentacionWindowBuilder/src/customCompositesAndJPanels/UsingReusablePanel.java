package customCompositesAndJPanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class UsingReusablePanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsingReusablePanel frame = new UsingReusablePanel();
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
	public UsingReusablePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ReusablePanel reusablePanel = new ReusablePanel();
		reusablePanel.setButtonForeground(Color.ORANGE);
		//Using the exported properties
		//Changing the properties through the accesors.
		
		//reusablePanel.setButtonBrowseText("Hola");
		reusablePanel.setTextField1Background(new Color(200, 10, 30));
		contentPane.add(reusablePanel, BorderLayout.CENTER);
		
		SecondReusablePanel secondReusablePanel = new SecondReusablePanel();
		//secondReusablePanel.getBtnMostrarDialogo().setText("Mostrar Nota");
		contentPane.add(secondReusablePanel, BorderLayout.SOUTH);
	}
}
