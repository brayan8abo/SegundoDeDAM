package Actividad3;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

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
		ClassLoader classloader = getClass().getClassLoader();

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints gblc1 = new GridBagConstraints();
		initGridBagLayout(gblc1, 0, 0, 2, 1, 0.2, 0.5);
		GridBagConstraints gblc2 = new GridBagConstraints();
		initGridBagLayout(gblc2, 2, 0, 2, 1, 0.2, 0.5);
		GridBagConstraints gblc3 = new GridBagConstraints();
		initGridBagLayout(gblc3, 0, 1, 1, 1, 0.25, 0.5);
		GridBagConstraints gblc4 = new GridBagConstraints();
		initGridBagLayout(gblc4, 0, 2, 2, 3, 0.5, 0.6);
		GridBagConstraints gblc5 = new GridBagConstraints();
		initGridBagLayout(gblc5, 2, 2, 2, 2, 0.5, 0.4);
		GridBagConstraints gblc6 = new GridBagConstraints();
		initGridBagLayout(gblc6, 2, 1, 2, 2, 0.25, 0.2);

		JButton button1 = new JButton("MESA 1");
		JButton button2 = new JButton("MESA 2");
		JButton button3 = new JButton("MESA 3");
		JButton button4 = new JButton("MESA 4");
		JButton button5 = new JButton("MESA 5");
		JButton button6 = new JButton("MESA 6");
		button1.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button2.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button3.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button4.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button5.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button6.setFont(new Font("Linux Libertine G", Font.BOLD, 18));

		contentPane.add(button1, gblc1);
		contentPane.add(button2, gblc2);
		contentPane.add(button3, gblc3);
		contentPane.add(button4, gblc4);
		contentPane.add(button5, gblc5);
		contentPane.add(button6, gblc6);

		// MESA 1
		ImageIcon mesa1 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa1.setImage(mesa1.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button1.setIcon(mesa1);
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.setVerticalTextPosition(SwingConstants.BOTTOM);

		// MESA 2
		ImageIcon mesa2 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa2.setImage(mesa2.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button2.setIcon(mesa2);
		button2.setHorizontalTextPosition(SwingConstants.CENTER);
		button2.setVerticalTextPosition(SwingConstants.BOTTOM);

		// MESA 3
		ImageIcon mesa3 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa3.setImage(mesa1.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button3.setIcon(mesa3);
		button3.setHorizontalTextPosition(SwingConstants.CENTER);
		button3.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		// MESA 4
		ImageIcon mesa4 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa4.setImage(mesa4.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button4.setIcon(mesa4);
		button4.setHorizontalTextPosition(SwingConstants.CENTER);
		button4.setVerticalTextPosition(SwingConstants.BOTTOM);

		// MESA 5
		ImageIcon mesa5 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa5.setImage(mesa5.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button5.setIcon(mesa5);
		button5.setHorizontalTextPosition(SwingConstants.CENTER);
		button5.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		// MESA 6
		ImageIcon mesa6 = new ImageIcon(classloader.getResource("mesa.png"));
		mesa6.setImage(mesa6.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		button6.setIcon(mesa6);
		button6.setHorizontalTextPosition(SwingConstants.CENTER);
		button6.setVerticalTextPosition(SwingConstants.BOTTOM);
	}

}
