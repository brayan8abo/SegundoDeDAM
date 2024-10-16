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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.CardLayout;

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
	}

	public TPVview() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ClassLoader classloader = getClass().getClassLoader();

		setContentPane(contentPane);
		CardLayout cardLayout = new CardLayout(0, 0);
		contentPane.setLayout(cardLayout);

		// MESA 1
		ImageIcon iconoMesa = new ImageIcon(classloader.getResource("mesa.png"));
		iconoMesa.setImage(iconoMesa.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
		
//	TODO ESTO TE SOBRA
//		// MESA 2
//		ImageIcon mesa2 = new ImageIcon(classloader.getResource("mesa.png"));
//		mesa2.setImage(mesa2.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
//
//		// MESA 3
//		ImageIcon mesa3 = new ImageIcon(classloader.getResource("mesa.png"));
//		mesa3.setImage(iconoMesa.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
//		
//		// MESA 4
//		ImageIcon mesa4 = new ImageIcon(classloader.getResource("mesa.png"));
//		mesa4.setImage(mesa4.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
//
//		// MESA 5
//		ImageIcon mesa5 = new ImageIcon(classloader.getResource("mesa.png"));
//		mesa5.setImage(mesa5.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
//		
//		// MESA 6
//		ImageIcon mesa6 = new ImageIcon(classloader.getResource("mesa.png"));
//		mesa6.setImage(mesa6.getImage().getScaledInstance(80, 80, java.awt.Image.SCALE_SMOOTH));
//		
		JPanel panel = new JPanel();
		contentPane.add(panel, "principal");
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		//ayer vi una cosa de arrays de botones, para poner lo de los entrantes, primeros, segundos y esas cosas
		//yo lo hice con un bucle de botones jajaj
		//ahora si toco el boton 1 como hago o que hago para que me salga lo otro 
		
		JButton button1 = new JButton("MESA 1");
		
		button1.setVerticalTextPosition(SwingConstants.BOTTOM);
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button1.setIcon(iconoMesa);
		panel.add(button1);
		
		JButton button2 = new JButton("MESA 2");
		button2.setVerticalTextPosition(SwingConstants.BOTTOM);
		button2.setHorizontalTextPosition(SwingConstants.CENTER);
		button2.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button2.setIcon(iconoMesa);
		panel.add(button2);
		
		JButton button3 = new JButton("MESA 3");
		button3.setVerticalTextPosition(SwingConstants.BOTTOM);
		button3.setHorizontalTextPosition(SwingConstants.CENTER);
		button3.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button3.setIcon(iconoMesa);
		panel.add(button3);
		
		JButton button4 = new JButton("MESA 4");
		button4.setVerticalTextPosition(SwingConstants.BOTTOM);
		button4.setHorizontalTextPosition(SwingConstants.CENTER);
		button4.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button4.setIcon(iconoMesa);
		panel.add(button4);
		
		JButton button5 = new JButton("MESA 5");
		button5.setVerticalTextPosition(SwingConstants.BOTTOM);
		button5.setHorizontalTextPosition(SwingConstants.CENTER);
		button5.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button5.setIcon(iconoMesa);
		panel.add(button5);
		
		JButton button6 = new JButton("MESA 6");
		button6.setVerticalTextPosition(SwingConstants.BOTTOM);
		button6.setHorizontalTextPosition(SwingConstants.CENTER);
		button6.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button6.setIcon(iconoMesa);
		panel.add(button6);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "ejemplo");
		panel_1.setLayout(null);
		setLocationRelativeTo(null);
		
		String botonesComanda[] = {"ENTRANTES","PRIMEROS","ENTRANTES","SEGUNDOS","POSTRES","BEBIDAS"};
		JButton botones[] = new JButton[botonesComanda.length];
		for (int i = 0; i < botones.length; i++) {
			
			botones[i]=new JButton(botonesComanda[i]);
			botones[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			botones[i].setHorizontalTextPosition(SwingConstants.CENTER);
			botones[i].setFont(new Font("Linux Libertine G", Font.BOLD, 18));
			botones[i].setIcon(iconoMesa);
			panel_1.add(botones[i]);
			
		}
		
		
		//LISTENNERS DE BOTONES DE MESAS
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cardLayout.show(contentPane, "ejemplo");
				
			}
		});
	}


}
