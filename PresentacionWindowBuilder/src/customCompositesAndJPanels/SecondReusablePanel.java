package customCompositesAndJPanels;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class SecondReusablePanel extends JPanel {
	private JTextField txtHolaMundo;
	private JButton btnMostrarDialogo;

	/**
	 * Create the panel.
	 */
	public SecondReusablePanel() {
		
		btnMostrarDialogo = new JButton("Show Dialog");
		add(btnMostrarDialogo);
		
		txtHolaMundo = new JTextField();
		txtHolaMundo.setText("hello world");
		add(txtHolaMundo);
		txtHolaMundo.setColumns(10);

	}

	/*public JButton getBtnMostrarDialogo() {
		return btnMostrarDialogo;
	}*/
}
