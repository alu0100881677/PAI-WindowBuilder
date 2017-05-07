package MenuEditing;

import java.awt.Dimension;

import javax.swing.JFrame;

public class TestMenu {
	private final static int DIM = 800;
	
	public static void main(String[] args) {
		PanelMenuEditing menuEditing = new PanelMenuEditing();
		menuEditing.setSize(new Dimension(DIM, DIM));
		menuEditing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuEditing.setLocationRelativeTo(null);
		menuEditing.setVisible(true);

	}

}
