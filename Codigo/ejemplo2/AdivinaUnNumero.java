package ejemplo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

/**
 * Programa para jugar a adivinar un numero entre 0 y 100, se introduce en el textfield, y se presiona jugar, 
 * caunto más cerca, más se llena la barra de progreso. Pulsar nuevo número cambia el número a adivinar.
 * @author yo
 *
 */
public class AdivinaUnNumero extends JFrame {

	private static final long serialVersionUID = 2857764826327299887L;
	private JPanel contentPane;
	private JTextField textField;
	private int numero;
	private JLabel etiqueta;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdivinaUnNumero frame = new AdivinaUnNumero();
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
	public AdivinaUnNumero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		numero = (int) Math.round(Math.random() * 100);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		etiqueta = new JLabel("Adivina el número");
		etiqueta.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
		
		progressBar = new JProgressBar(0,100);
		
		JButton button = new JButton("Jugar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena = textField.getText();
				if(!cadena.isEmpty()){
					int aux = Integer.parseInt(cadena);
					aux = Math.abs(numero-aux);
					if(aux<0 || aux >100)
						etiqueta.setText("Numero fuera de rango");
					else
						if(aux==0){
							etiqueta.setText("Feliciadades, ganaste");
							progressBar.setValue(100);
						}
						else{
							etiqueta.setText("Fallaste, vuelve a intentarlo");
							progressBar.setValue(100-aux);
						}
				}
			}
		});
		
		JButton btnNuevoNumero = new JButton("Nuevo Numero");
		btnNuevoNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = (int) Math.round(Math.random() * 100);
				etiqueta.setText("Número actualizado");
				progressBar.setValue(0);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addComponent(btnNuevoNumero)
					.addGap(39)
					.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(111))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(152, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(126))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(153, Short.MAX_VALUE)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(139))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(94)
					.addComponent(etiqueta, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(34, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(button)
						.addComponent(btnNuevoNumero))
					.addGap(45)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(etiqueta, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
