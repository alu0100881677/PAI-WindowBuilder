package ejemplo1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4833585151333027210L;
	private JPanel contentPane;
	private ContadorPalabras contadorPalabras;
	private JFileChooser fileChooser;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		fileChooser = new JFileChooser();
		
		contadorPalabras = new ContadorPalabras();
		
		JButton btnContarpalabras = new JButton("ContarPalabras");
		btnContarpalabras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = "";
				if(fileChooser.getSelectedFile() != null)
					cadena = fileChooser.getSelectedFile().getPath();
				contadorPalabras.setFichero(cadena);
				contadorPalabras.repaint();
				
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(fileChooser, GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(contadorPalabras, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
							.addGap(112)
							.addComponent(btnContarpalabras, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
							.addGap(64)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addComponent(fileChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
							.addComponent(btnContarpalabras)
							.addGap(56))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(contadorPalabras, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * @return the contador
	 */
	public ContadorPalabras getContador() {
		return contadorPalabras;
	}

	/**
	 * @param contador the contador to set
	 */
	public void setContador(ContadorPalabras contador) {
		this.contadorPalabras = contador;
	}
}
