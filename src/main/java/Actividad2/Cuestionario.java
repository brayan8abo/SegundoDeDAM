package Actividad2;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class Cuestionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuestionario frame = new Cuestionario();
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
	public Cuestionario() {

		setTitle("CUESTIONARIO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ClassLoader classloader = getClass().getClassLoader();

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel pregunta1 = new JPanel();
		contentPane.add(pregunta1, "panelPregunta1");
		pregunta1.setLayout(null);

		

		JButton btnHamburguesa = new JButton();
		btnHamburguesa.setBounds(33, 72, 153, 188);
		pregunta1.add(btnHamburguesa);
		ImageIcon imagenIcon = new ImageIcon(classloader.getResource("hamburguesa.png"));
		imagenIcon.setImage(imagenIcon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnHamburguesa.setIcon(imagenIcon);
		
		
		JButton btnPasta = new JButton();
		btnPasta.setBounds(555, 5, 545, 521);
		pregunta1.add(btnPasta);
		ImageIcon imagenIcon1 = new ImageIcon(classloader.getResource("pasta.png"));
		imagenIcon1.setImage(imagenIcon1.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnPasta.setIcon(imagenIcon1);
		

		JLabel lblPregunta1 = new JLabel("¿Cuál es tu comida favorita?");
		lblPregunta1.setBounds(1105, 258, 135, 14);
		lblPregunta1.setHorizontalAlignment(SwingConstants.CENTER);
		pregunta1.add(lblPregunta1);

		JPanel pregunta2 = new JPanel();
		contentPane.add(pregunta2, "panelPregunta2");

		JPanel pregunta3 = new JPanel();
		contentPane.add(pregunta3, "panelPregunta3");

	}
}
