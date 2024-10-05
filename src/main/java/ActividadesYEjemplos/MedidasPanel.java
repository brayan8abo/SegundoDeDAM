package ActividadesYEjemplos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Event;

import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class MedidasPanel extends JFrame {

	protected static final JLabel textField = null;
	private JPanel contentPane;
	private JTextField textDato;

	/**
	 * Create the frame.
	 */
	public MedidasPanel() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Conversor de Medidas");
		setBounds(100, 100, 590, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(233, 280, 100, 30);
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí iría la lógica de conversión.
				String valor = textField.getText();
				System.out.println("Valor a convertir: " + valor);
				
			
				
			
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnConvertir);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		comboBox.setBounds(32, 132, 137, 40);
		

		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "CENTIMETROS", "METROS", "KILOMETROS" }));
		comboBox.setMaximumRowCount(3);
		contentPane.add(comboBox);

		JLabel lblOpcion = new JLabel("ESCOGE UNA OPCÓN");
		lblOpcion.setBounds(192, 43, 191, 46);
		lblOpcion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOpcion.setForeground(new Color(128, 0, 0));
		lblOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		contentPane.add(lblOpcion);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(393, 132, 137, 40);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "CENTIMETROS", "METROS", "KILOMETROS" }));
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		contentPane.add(comboBox_1);
		
		textDato = new JTextField();
		textDato.setBounds(233, 142, 86, 20);
		contentPane.add(textDato);
		textDato.setColumns(10);

		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 574, 321);
		lblFondo.setIcon(new ImageIcon(MedidasPanel.class.getResource("/img/fondo.png")));
		contentPane.add(lblFondo);
	}
}
