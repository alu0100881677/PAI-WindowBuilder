package InternalFrame;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;

public class InternalFrameExample extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFrameExample frame = new InternalFrameExample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InternalFrameExample() {
		setBounds(100, 100, 450, 300);

	}

}
