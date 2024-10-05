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

public class MedidasPanel extends JFrame {

	private JPanel contentPane;

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
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí iría la lógica de conversión.
				String valor = textField.getText();
				System.out.println("Valor a convertir: " + valor);
			}
		});
		btnConvertir.setBounds(233, 280, 100, 30);
		contentPane.add(btnConvertir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CENTIMETROS", "METROS", "KILOMETROS"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(167, 101, 137, 40);
		contentPane.add(comboBox);
	}
}
