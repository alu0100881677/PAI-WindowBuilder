package visualInheritance;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class Inheritance extends visualInheritanceExample {
	public Inheritance() {
		setTextFieldForeground(Color.RED);
		getPanelVisualInheritance().setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getBtnBrowse().setText("Ok");
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnSubmit = new JButton("Submit");
		panel.add(btnSubmit);
	}

}
