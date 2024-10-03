package ActividadesYEjemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel cPConversor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CONVERSOR");
		setBounds(100, 100, 599, 401);
		cPConversor = new JPanel();
		cPConversor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(cPConversor);
		cPConversor.setLayout(null);
		
		JButton btnMedidas = new JButton("MEDIDAS");
		btnMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaEmergente();
				dispose();
				
				
			}
		});
		btnMedidas.setBorder(new LineBorder(null, 3, true));
		btnMedidas.setBackground(Color.WHITE);
		btnMedidas.setForeground(new Color(0, 0, 0));
		btnMedidas.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		btnMedidas.setBounds(165, 145, 115, 55);
		cPConversor.add(btnMedidas);
		
		JButton btnTemperaturas = new JButton("TEMPERATURAS");
		btnTemperaturas.setForeground(Color.BLACK);
		btnTemperaturas.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		btnTemperaturas.setBorder(new LineBorder(null, 3, true));
		btnTemperaturas.setBackground(Color.WHITE);
		btnTemperaturas.setBounds(305, 145, 132, 55);
		cPConversor.add(btnTemperaturas);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Conversor.class.getResource("/img/img.png")));
		fondo.setBounds(0, 0, 590, 371);
		cPConversor.add(fondo);
	}
	public static void abrirVentanaEmergente() {
        // Crear la ventana emergente
        JFrame ventanaEmergente = new JFrame("Ventana Emergente");
        ventanaEmergente.setSize(250, 150);
        ventanaEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo la ventana emergente
        ventanaEmergente.setLocationRelativeTo(null); // Centra la ventana emergente

        // Crear un mensaje o componente para la ventana emergente
        JLabel mensaje = new JLabel("¡Hola desde la ventana emergente!", SwingConstants.CENTER);
        ventanaEmergente.add(mensaje);

        // Mostrar la ventana emergente
        ventanaEmergente.setVisible(true);
    }
}

