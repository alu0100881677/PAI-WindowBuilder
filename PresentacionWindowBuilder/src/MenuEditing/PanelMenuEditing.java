package MenuEditing;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class PanelMenuEditing extends JFrame {

	/**
	 * Create the panel.
	 */
	public PanelMenuEditing() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mntmSpain = new JMenu("Spain");
		menuBar.add(mntmSpain);
		
		JMenu mnNewMenu = new JMenu("Typical Food");
		mntmSpain.add(mnNewMenu);
		
		JMenuItem mntmTortilla = new JMenuItem("Tortilla ");
		mntmTortilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				dialogo.setLocation(100, 100);
				dialogo.setSize(new Dimension(300, 300));
				JLabel tag = new JLabel("La tortilla es un plato típico español hecho a base de huevos y patatas.");
				dialogo.getContentPane().setLayout(new BorderLayout());
				dialogo.getContentPane().add(tag, BorderLayout.SOUTH);
				dialogo.setVisible(true);
			}
		});
		
		
		mnNewMenu.add(mntmTortilla);
		
		JMenuItem mntmJamonSerrano = new JMenuItem("Jamon Serrano");
		mnNewMenu.add(mntmJamonSerrano);
		
		JMenuItem mntmCocido = new JMenuItem("Cocido");
		mnNewMenu.add(mntmCocido);
		
		JMenuItem mntmPaella = new JMenuItem("Paella");
		mnNewMenu.add(mntmPaella);
		
		JMenuItem mntmMonuments = new JMenuItem("Monuments");
		mntmSpain.add(mntmMonuments);
		
		JMenuItem mntmTypical = new JMenuItem("Typical Parties");
		mntmSpain.add(mntmTypical);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("France");
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmMexico = new JMenuItem("Mexico");
		menuBar.add(mntmMexico);
		
		JMenuItem mntmUnitedStates = new JMenuItem("United States");
		menuBar.add(mntmUnitedStates);
		
		JMenuItem mntmItaly = new JMenuItem("Italy");
		menuBar.add(mntmItaly);


	}

}
