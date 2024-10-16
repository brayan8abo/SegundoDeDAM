package Actividad3;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;

public class TPVview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TPVview frame = new TPVview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void initGridBagLayout(GridBagConstraints gblc, int x, int y, int w, int h, double wx, double wh) {

		gblc.gridx = x;
		gblc.gridy = y;
		gblc.gridwidth = w;
		gblc.gridheight = h;
		gblc.weightx = wx;
		gblc.weighty = wh;
		gblc.fill = GridBagConstraints.BOTH;//
	}

	public TPVview() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
	
		GridBagConstraints gblc1 = new GridBagConstraints();
		initGridBagLayout(gblc1, 0, 0, 2, 1, 0.5, 0.2); // la primera es la x y la segunda y
		GridBagConstraints gblc2 = new GridBagConstraints();
		initGridBagLayout(gblc2, 2, 0, 2, 1, 0.2, 0.5);
		//GridBagConstraints gblc3 = new GridBagConstraints();
		//initGridBagLayout(gblc3, 0, 1, 1, 1, 0.25, 0.2);
		GridBagConstraints gblc3 = new GridBagConstraints();
		initGridBagLayout(gblc3, 0, 2, 2, 3, 0.5, 0.6);
		GridBagConstraints gblc4 = new GridBagConstraints();
		initGridBagLayout(gblc4, 2, 2, 2, 2, 0.4, 0.5);
		

		JButton buttton1 = new JButton("Boton 1");
		JButton buttton2 = new JButton("Boton 2");
		JButton buttton3 = new JButton("Boton 3");
		JButton buttton4 = new JButton("Boton 4");


		

		contentPane.add(buttton1, gblc1);
		contentPane.add(buttton2, gblc2);
		contentPane.add(buttton3, gblc3);
		contentPane.add(buttton4, gblc4);}

}
