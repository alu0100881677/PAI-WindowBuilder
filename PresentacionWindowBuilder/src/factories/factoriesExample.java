package factories;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class factoriesExample extends JPanel {
	private JTextField txtHolaMundo;

	/**
	 * Create the panel.
	 */
	public factoriesExample() {
		setForeground(Color.ORANGE);
		
		JRadioButton rdbtnControl = BotonRojo.createJRadioButton();
		add(rdbtnControl);
		
		txtHolaMundo = BotonRojo.createJTextField();
		add(txtHolaMundo);
		
		JButton btnOk_1 = BotonOk.createJButton();
		add(btnOk_1);
		
		JButton btnOk = BotonOk.createJButton();
		add(btnOk);
		
		JLabel lblEtiquetaFactorizada = LabelVerde.createJLabel();
		add(lblEtiquetaFactorizada);
		
		JButton btnOk_2 = BotonOk.createJButton();
		add(btnOk_2);
		
		
		JRadioButton rdbtnNewRadioButton = BotonRojo.createJRadioButton();
		add(rdbtnNewRadioButton);

	}

}
