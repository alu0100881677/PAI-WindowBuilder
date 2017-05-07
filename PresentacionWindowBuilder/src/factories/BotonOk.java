package factories;
import javax.swing.JButton;
import java.awt.Color;

public final class BotonOk {
	/**
	 * @wbp.factory
	 */
	public static JButton createJButton() {
		JButton button = new JButton("Ok");
		button.setForeground(Color.MAGENTA);
		return button;
	}
}