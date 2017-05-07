package customCompositesAndJPanels;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;

public class Prueba extends JPanel {
	private JPanel panel;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public Prueba() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Texto");
		btnNewButton.setBounds(133, 5, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(255, 11, 61, 16);
		panel.add(lblNewLabel);

	}

	public JPanel getPanelPruebaPresentacion() {
		return panel;
	}
	public Color getBtnNewButtonForeground() {
		return btnNewButton.getForeground();
	}
	public void setBtnNewButtonForeground(Color foreground) {
		btnNewButton.setForeground(foreground);
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
}
