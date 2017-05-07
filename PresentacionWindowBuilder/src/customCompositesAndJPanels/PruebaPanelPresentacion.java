package customCompositesAndJPanels;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;

public class PruebaPanelPresentacion extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public PruebaPanelPresentacion() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

	}

	public Color getBtnNewButtonForeground() {
		return btnNewButton.getForeground();
	}
	public void setBtnNewButtonForeground(Color foreground) {
		btnNewButton.setForeground(foreground);
	}
	public JPanel getPanel() {
		return panel;
	}
	public Color getBotonColor() {
		return btnNewButton.getForeground();
	}
	public void setBotonColor(Color foreground_1) {
		btnNewButton.setForeground(foreground_1);
	}
}
