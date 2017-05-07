package factories;
import javax.swing.JLabel;
import java.awt.Color;

public final class LabelVerde {
	/**
	 * @wbp.factory
	 */
	public static JLabel createJLabel() {
		JLabel label = new JLabel("Etiqueta Factorizada");
		label.setForeground(Color.GREEN);
		label.setBackground(Color.RED);
		return label;
	}
}