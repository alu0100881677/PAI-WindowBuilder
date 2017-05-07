package visualInheritance;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class visualInheritanceExample extends JPanel {
	private JTextField txtHola;
	private JTextField textField_1;
	private JPanel panel;
	private JButton btnBrowse;

	/**
	 * Create the panel.
	 */
	public visualInheritanceExample() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstField = new JLabel("First Field");
		lblFirstField.setBounds(6, 11, 62, 16);
		panel.add(lblFirstField);
		
		txtHola = new JTextField();
		txtHola.setText("hola");
		txtHola.setBounds(80, 6, 264, 26);
		panel.add(txtHola);
		txtHola.setColumns(10);
		
		btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(356, 6, 88, 29);
		panel.add(btnBrowse);
		
		JLabel lblSecondField = new JLabel("Second Field");
		lblSecondField.setBounds(6, 39, 79, 16);
		panel.add(lblSecondField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 34, 354, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);

	}
	public JPanel getPanelVisualInheritance() {
		return panel;
	}
	public JButton getBtnBrowse() {
		return btnBrowse;
	}
	public Color getTextFieldForeground() {
		return txtHola.getForeground();
	}
	public void setTextFieldForeground(Color foreground) {
		txtHola.setForeground(foreground);
	}
}
