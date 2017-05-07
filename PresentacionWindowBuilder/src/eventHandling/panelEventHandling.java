package eventHandling;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelEventHandling extends JPanel {
	private final int RADIO = 10;

	/**
	 * Create the panel.
	 */
	public panelEventHandling() {
		addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("Deslizando el ratón");
			}
		});
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				dialogo.setLocation(100, 100);
				dialogo.setSize(new Dimension(300, 300));
				JLabel tag = new JLabel("Etiqueta");
				dialogo.getContentPane().setLayout(new BorderLayout());
				dialogo.getContentPane().add(tag, BorderLayout.SOUTH);
				dialogo.setVisible(true);
			}
		});
		add(btnNewButton);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getGraphics().drawOval(e.getX(), e.getY(), RADIO, RADIO);
			}
		});

	}
	
	public static void main(String args[]){
		JFrame marco = new JFrame("Frame EventHandling");
		marco.getContentPane().add(new panelEventHandling());
		marco.setSize(700, 900);
		marco.setVisible(true);
	}

}
