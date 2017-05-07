package tipsAndTricksParte2;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JCheckBox;

public class PropiertyExample {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropiertyExample window = new PropiertyExample();
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
	public PropiertyExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		// $hide>>$
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox);
		// $hide<<$
	}

}
