package factories;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public final class BotonRojo {
	/**
	 * @wbp.factory
	 */
	public static JButton createJButtonReset() {
		JButton button = new JButton("Reset");
		button.setForeground(Color.RED);
		return button;
	}
	/**
	 * @wbp.factory
	 */
	public static JTextField createJTextField() {
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setText("HOLa mundo");
		textField.setForeground(Color.RED);
		return textField;
	}
	/**
	 * @wbp.factory
	 */
	public static JRadioButton createJRadioButton() {
		JRadioButton radioButton = new JRadioButton("Control");
		radioButton.setForeground(Color.RED);
		return radioButton;
	}
}