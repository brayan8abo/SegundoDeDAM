package Actividad2;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Cuestionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		setLocationRelativeTo(null);

		CardLayout cardlayout = new CardLayout();

		setContentPane(contentPane);
		contentPane.setLayout(cardlayout);

		JPanel pregunta1 = new JPanel();
		contentPane.add(pregunta1, "panelPregunta1");
		pregunta1.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnHamburguesa = new JButton();
		btnHamburguesa.setBounds(67, 94, 127, 150);
		pregunta1.add(btnHamburguesa);
		ImageIcon imagenIcon = new ImageIcon(classloader.getResource("hamburguesa.png"));
		imagenIcon.setImage(imagenIcon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnHamburguesa.setIcon(imagenIcon);

		JButton btnPasta = new JButton();
		btnPasta.setBounds(289, 94, 127, 150);
		pregunta1.add(btnPasta);
		ImageIcon imagenIcon1 = new ImageIcon(classloader.getResource("pasta.png"));
		imagenIcon1.setImage(imagenIcon1.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnPasta.setIcon(imagenIcon1);

		JLabel lblPregunta1 = new JLabel("¿Cuál es tu comida favorita?");
		lblPregunta1.setBounds(1105, 258, 135, 14);
		lblPregunta1.setHorizontalAlignment(SwingConstants.CENTER);
		pregunta1.add(lblPregunta1);

		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnAtras, "ERROR");
			}
		});
		btnAtras.setBounds(26, 287, 89, 23);
		pregunta1.add(btnAtras);

		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panelPregunta2");

			}
		});
		btnSiguiente.setBounds(385, 287, 100, 23);
		pregunta1.add(btnSiguiente);

		JLabel lblComida = new JLabel("¿CUÁL ES TU COMIDA FAVORITA?");
		lblComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblComida.setFont(new Font("Linux Libertine Display G", Font.PLAIN, 15));
		lblComida.setBounds(132, 27, 234, 42);
		pregunta1.add(lblComida);

		JPanel pregunta2 = new JPanel();
		contentPane.add(pregunta2, "panelPregunta2");
		pregunta2.setLayout(null);
		
		JButton btnAtras_1 = new JButton("ATRÁS");
		btnAtras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cardlayout.show(contentPane, "panelPregunta1");
			}
		});
		btnAtras_1.setBounds(26, 287, 89, 23);
		pregunta2.add(btnAtras_1);
		
		JButton btnSiguiente_1 = new JButton("SIGUIENTE");
		btnSiguiente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panelPregunta3");
				
			}
		});
		btnSiguiente_1.setBounds(385, 287, 100, 23);
		pregunta2.add(btnSiguiente_1);
		
		textField = new JTextField();
		textField.setBounds(211, 122, 86, 20);
		pregunta2.add(textField);
		textField.setColumns(10);

		JPanel pregunta3 = new JPanel();
		contentPane.add(pregunta3, "panelPregunta3");
		pregunta3.setLayout(null);
		
		JButton btnAtras_2 = new JButton("ATRÁS");
		btnAtras_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panelPregunta2");
			}
		});
		btnAtras_2.setBounds(25, 287, 89, 23);
		pregunta3.add(btnAtras_2);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFinalizar.setBounds(384, 287, 100, 23);
		pregunta3.add(btnFinalizar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(206, 146, 89, 23);
		pregunta3.add(btnNewButton);

	}
}
