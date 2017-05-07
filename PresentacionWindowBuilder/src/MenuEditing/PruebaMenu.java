package MenuEditing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaMenu frame = new PruebaMenu();
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
	public PruebaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSpain = new JMenu("Spain");
		menuBar.add(mnSpain);
		
		JMenuItem mntmCapital = new JMenuItem("Capital");
		mnSpain.add(mntmCapital);
		
		JMenu mnComida = new JMenu("Comida");
		mnSpain.add(mnComida);
		
		JMenuItem mntmTorilla = new JMenuItem("Torilla");
		mntmTorilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog tortillaDialog = new JDialog();
				JLabel tortillaLable = new JLabel("la tortilla esta hecha con huevos y papas");
				tortillaDialog.setSize(new Dimension(300, 300));
				tortillaDialog.add(tortillaLable);
				tortillaDialog.setVisible(true);
			}
		});
		mnComida.add(mntmTorilla);
		
		JMenu mnFrance = new JMenu("France");
		menuBar.add(mnFrance);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
