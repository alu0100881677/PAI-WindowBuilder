package ejemplo4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGenerarCara = new JMenu("Generar Cara");
		menuBar.add(mnGenerarCara);
		
		JMenuItem mntmRandom = new JMenuItem("Random");
		mntmRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntFrameCara ventana = new IntFrameCara();
				desktopPane.add(ventana);
				ventana.show();
			}
		});
		mnGenerarCara.add(mntmRandom);
		
		JMenuItem mntmCaraNeutra = new JMenuItem("Cara Neutra");
		mntmCaraNeutra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntFrameCara ventana = new IntFrameCara("neutra");
				desktopPane.add(ventana);
				ventana.show();
			}
		});
		mnGenerarCara.add(mntmCaraNeutra);
		
		JMenuItem mntmCaraFeliz = new JMenuItem("Cara Feliz");
		mntmCaraFeliz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntFrameCara ventana = new IntFrameCara("feliz");
				desktopPane.add(ventana);
				ventana.show();
			}
		});
		mnGenerarCara.add(mntmCaraFeliz);
		
		JMenuItem mntmCaraTriste = new JMenuItem("Cara Triste");
		mntmCaraTriste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntFrameCara ventana = new IntFrameCara("triste");
				desktopPane.add(ventana);
				ventana.show();
			}
		});
		mnGenerarCara.add(mntmCaraTriste);
		
	}
}
