package morphing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MorphingExample {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblColorSelected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorphingExample window = new MorphingExample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MorphingExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxBlue = new JCheckBox("Blue");
		chckbxBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColorSelected.setText("The selected Color is Blue");
			}
		});
		buttonGroup.add(chckbxBlue);
		chckbxBlue.setBounds(58, 53, 129, 23);
		frame.getContentPane().add(chckbxBlue);
		
		JCheckBox chckbxRed = new JCheckBox("Red");
		chckbxRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColorSelected.setText("The selected Color is Red");
			}
		});
		buttonGroup.add(chckbxRed);
		chckbxRed.setBounds(58, 106, 129, 23);
		frame.getContentPane().add(chckbxRed);
		
		JCheckBox chckbxGreen = new JCheckBox("Green");
		chckbxGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColorSelected.setText("The selected Color is Green");
			}
		});
		buttonGroup.add(chckbxGreen);
		chckbxGreen.setBounds(58, 166, 129, 23);
		frame.getContentPane().add(chckbxGreen);
		
		lblColorSelected = new JLabel("Color Selected");
		lblColorSelected.setBounds(201, 128, 196, 15);
		frame.getContentPane().add(lblColorSelected);
	}
}
