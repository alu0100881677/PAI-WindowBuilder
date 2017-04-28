package ejemplo5;

import javax.swing.JApplet;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;

public class AppletDemo extends JApplet {

	private static final long serialVersionUID = 2169424494278315188L;

	ArrayList<JPanel> paneles;

	private final int FACTOR_RGB = 255;	
	/**
	 * Create the applet.
	 */
	public AppletDemo() {
		getContentPane().setSize(new Dimension(400, 400));
		setSize(new Dimension(450, 300));
		getContentPane().setLayout(null);
		this.paneles = new ArrayList<JPanel>();
		for(int i=0; i<25; i++)
			paneles.add(new JPanel());
		
		JPanel panel = new JPanel();
		panel.setBounds(136, 12, 302, 276);
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		//JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(getPanel(0), gbc_panel_1);
		
		//JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel.add(getPanel(1), gbc_panel_2);
		
		//JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		panel.add(getPanel(2), gbc_panel_3);
		
		//JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 3;
		gbc_panel_4.gridy = 0;
		panel.add(getPanel(3), gbc_panel_4);
		
		//JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 4;
		gbc_panel_5.gridy = 0;
		panel.add(getPanel(4), gbc_panel_5);
		
		//JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 1;
		panel.add(getPanel(5), gbc_panel_6);
		
		//JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 1;
		gbc_panel_7.gridy = 1;
		panel.add(getPanel(6), gbc_panel_7);
		
		//JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 2;
		gbc_panel_8.gridy = 1;
		panel.add(getPanel(7), gbc_panel_8);
		
		//JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 3;
		gbc_panel_9.gridy = 1;
		panel.add(getPanel(8), gbc_panel_9);
		
		//JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 4;
		gbc_panel_10.gridy = 1;
		panel.add(getPanel(9), gbc_panel_10);
		
		//JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 2;
		panel.add(getPanel(10), gbc_panel_11);
		
		//JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 1;
		gbc_panel_12.gridy = 2;
		panel.add(getPanel(11), gbc_panel_12);
		
		//JPanel panel_13 = new JPanel();
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.gridx = 2;
		gbc_panel_13.gridy = 2;
		panel.add(getPanel(12), gbc_panel_13);
		
		//JPanel panel_14 = new JPanel();
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 3;
		gbc_panel_14.gridy = 2;
		panel.add(getPanel(13), gbc_panel_14);
		
		//JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 0);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 4;
		gbc_panel_15.gridy = 2;
		panel.add(getPanel(14), gbc_panel_15);
		
		//JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 5);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 3;
		panel.add(getPanel(15), gbc_panel_16);
		
		//JPanel panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 5);
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 1;
		gbc_panel_17.gridy = 3;
		panel.add(getPanel(16), gbc_panel_17);
		
		//JPanel panel_18 = new JPanel();
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 5);
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 2;
		gbc_panel_18.gridy = 3;
		panel.add(getPanel(17), gbc_panel_18);
		
		//JPanel panel_19 = new JPanel();
		GridBagConstraints gbc_panel_19 = new GridBagConstraints();
		gbc_panel_19.insets = new Insets(0, 0, 5, 5);
		gbc_panel_19.fill = GridBagConstraints.BOTH;
		gbc_panel_19.gridx = 3;
		gbc_panel_19.gridy = 3;
		panel.add(getPanel(18), gbc_panel_19);
		
		//JPanel panel_20 = new JPanel();
		GridBagConstraints gbc_panel_20 = new GridBagConstraints();
		gbc_panel_20.insets = new Insets(0, 0, 5, 0);
		gbc_panel_20.fill = GridBagConstraints.BOTH;
		gbc_panel_20.gridx = 4;
		gbc_panel_20.gridy = 3;
		panel.add(getPanel(19), gbc_panel_20);
		
		//JPanel panel_21 = new JPanel();
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.insets = new Insets(0, 0, 0, 5);
		gbc_panel_21.fill = GridBagConstraints.BOTH;
		gbc_panel_21.gridx = 0;
		gbc_panel_21.gridy = 4;
		panel.add(getPanel(20), gbc_panel_21);
		
		//JPanel panel_22 = new JPanel();
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.insets = new Insets(0, 0, 0, 5);
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 1;
		gbc_panel_22.gridy = 4;
		panel.add(getPanel(21), gbc_panel_22);
		
		//JPanel panel_23 = new JPanel();
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.insets = new Insets(0, 0, 0, 5);
		gbc_panel_23.fill = GridBagConstraints.BOTH;
		gbc_panel_23.gridx = 2;
		gbc_panel_23.gridy = 4;
		panel.add(getPanel(22), gbc_panel_23);
		
		//JPanel panel_24 = new JPanel();
		GridBagConstraints gbc_panel_24 = new GridBagConstraints();
		gbc_panel_24.insets = new Insets(0, 0, 0, 5);
		gbc_panel_24.fill = GridBagConstraints.BOTH;
		gbc_panel_24.gridx = 3;
		gbc_panel_24.gridy = 4;
		panel.add(getPanel(23), gbc_panel_24);
		
		//JPanel panel_25 = new JPanel();
		GridBagConstraints gbc_panel_25 = new GridBagConstraints();
		gbc_panel_25.fill = GridBagConstraints.BOTH;
		gbc_panel_25.gridx = 4;
		gbc_panel_25.gridy = 4;
		panel.add(getPanel(24), gbc_panel_25);

		
		JButton btnNewButton = new JButton("Random Color");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<25 ; i++)
					getPanel(i).setBackground(colorAleatorio());
			}
		});
		btnNewButton.setBounds(0, 133, 132, 25);
		getContentPane().add(btnNewButton);

	}
	
	public JPanel getPanel(int index){
		return paneles.get(index);
	}
	
	public Color colorAleatorio(){
		int r = (int) Math.round(Math.random() * getFACTOR_RGB());
		int g = (int) Math.round(Math.random() * getFACTOR_RGB());
		int b = (int) Math.round(Math.random() * getFACTOR_RGB());

		return new Color(r, g, b);
	}
	
	public int getFACTOR_RGB(){
		return FACTOR_RGB;
	}
}
