package customCompositesAndJPanels;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class ReusablePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel;
	private JButton button;

	/**
	 * Create the panel.
	 */
	public ReusablePanel() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setLayout(null);
		add(panel);
		
		JLabel label = new JLabel("First Field");
		label.setBounds(6, 6, 73, 16);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(71, 1, 290, 26);
		panel.add(textField);
		
		button = new JButton("Browse");
		button.setBounds(354, 1, 80, 29);
		panel.add(button);
		
		JLabel label_1 = new JLabel("Second Field");
		label_1.setBounds(6, 34, 86, 16);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 29, 342, 26);
		panel.add(textField_1);

	}

	public JPanel getPanel() {
		return panel;
	}
	public Color getTextField1Background() {
		return textField.getBackground();
	}
	public void setTextField1Background(Color background) {
		textField.setBackground(background);
	}
	public String getButtonBrowseText() {
		return button.getText();
	}
	public void setButtonBrowseText(String text) {
		button.setText(text);
	}
	public Color getTextFieldForeground() {
		return textField.getForeground();
	}
	public void setTextFieldForeground(Color foreground) {
		textField.setForeground(foreground);
	}
	public JTextField getTextField() {
		return textField;
	}
	public Color getButtonForeground() {
		return button.getForeground();
	}
	public void setButtonForeground(Color foreground_1) {
		button.setForeground(foreground_1);
	}
}
