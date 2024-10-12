//package Actividad2;
//
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JTextField;
//import java.awt.Font;
//import com.toedter.calendar.JCalendar;
//import javax.swing.border.LineBorder;
//import javax.swing.event.ChangeEvent;
//import javax.swing.event.ChangeListener;
//import javax.swing.table.DefaultTableModel;
//
//import java.awt.Color;
//import javax.swing.JSlider;
//import javax.swing.SwingConstants;
//import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JLabel;
//import javax.swing.JList;
//
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class ControladorEventos extends JDialog {
//
//	private static final long serialVersionUID = 1L;
//	private final JPanel contentPanel = new JPanel();
//	private JTextField textNombre;
//	String[] tipos = { "Fiesta", "Concierto", "VIP" };
//	private Eventos principal;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		try {
//			ControladorEventos dialog = new ControladorEventos(null);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Create the dialog.
//	 * 
//	 * @param eventos
//	 */
//	public ControladorEventos(Eventos eventos) {
//		this.principal = eventos;
//		setBounds(100, 100, 450, 300);
//		getContentPane().setLayout(new BorderLayout());
//		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		getContentPane().add(contentPanel, BorderLayout.CENTER);
//		contentPanel.setLayout(null);
//		setSize(590, 390);
//		setLocationRelativeTo(null);
//
//		textNombre = new JTextField();
//		textNombre.setToolTipText("");
//		textNombre.setText("\r\n");
//		textNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		textNombre.setBounds(105, 39, 138, 22);
//		contentPanel.add(textNombre);
//		textNombre.setColumns(10);
//
//		JComboBox comboBox = new JComboBox();
//		comboBox.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Fiesta", "Concierto", "VIP" }));
//		comboBox.setBounds(454, 39, 99, 22);
//		contentPanel.add(comboBox);
//
//		JSlider slider = new JSlider(1, 31, 1);
//		slider.setMajorTickSpacing(1);
//		slider.setPaintLabels(true);
//		slider.setPaintTicks(true);
//		slider.setFont(new Font("Linux Libertine G", Font.BOLD, 11));
//		slider.setBounds(10, 128, 564, 96);
//		contentPanel.add(slider);
//
//		JLabel fecha = new JLabel("La fecha seleccionada es: 2024-10-01");
//		fecha.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
//		fecha.setHorizontalAlignment(SwingConstants.CENTER);
//		fecha.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		fecha.setBounds(10, 244, 249, 34);
//
//		slider.addChangeListener(new ChangeListener() {
//
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				int diaSeleccionado = slider.getValue();
//				fecha.setText("Fecha seleccionada: 2024-10-" + String.format("%02d", diaSeleccionado));
//
//			}
//		});
//
//		contentPanel.add(slider);
//		contentPanel.add(fecha);
//
//		JLabel lblNombre = new JLabel("NOMBRE");
//		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		lblNombre.setBounds(29, 43, 66, 14);
//		contentPanel.add(lblNombre);
//
//		JLabel lblTipo = new JLabel("ELIGE EL TIPO");
//		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTipo.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		lblTipo.setBounds(342, 43, 91, 14);
//		contentPanel.add(lblTipo);
//
//		{
//			JPanel buttonPane = new JPanel();
//			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
//			getContentPane().add(buttonPane, BorderLayout.SOUTH);
//			{
//				JButton agregar = new JButton("AGREGAR");
//				agregar.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						agregar.addActionListener(new ActionListener() {
//							public void actionPerformed(ActionEvent e) {
//								// Obtener los datos del formulario
//								String nombre = textNombre.getText();
//								String tipo = (String) comboBox.getSelectedItem();
//								int fecha = slider.getValue();
//
//								if (principal != null) { // Verificar que la referencia no sea null
//									principal.agregarEvento(nombre, tipo, fecha); // Pasar los datos
//								} else {
//									System.out.println("parentFrame es null");
//								}
//
//								dispose();
//							}
//						});
//
//					}
//				});
//				buttonPane.add(agregar);
//				getRootPane().setDefaultButton(agregar);
//			}
//			{
//				JButton cancelButton = new JButton("SALIR");
//				cancelButton.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						dispose();
//					}
//				});
//				cancelButton.setActionCommand("SALIR");
//				buttonPane.add(cancelButton);
//			}
//		}
//	}
//}
package Actividad2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ControladorEventos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private Eventos principal; // No-static, se asignará en el constructor

	public ControladorEventos(Eventos eventos) {
		this.principal = eventos; // Asignar la referencia del frame padre

		setBounds(100, 100, 590, 390);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setSize(590, 390);

		textNombre = new JTextField();
		textNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		textNombre.setBounds(105, 39, 138, 22);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Fiesta", "Concierto", "VIP" }));
		comboBox.setBounds(454, 39, 99, 22);
		contentPanel.add(comboBox);

		JSlider slider = new JSlider(0, 32, 1);
		slider.setMajorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setFont(new Font("Linux Libertine G", Font.BOLD, 11));
		slider.setBounds(10, 128, 564, 96);
		contentPanel.add(slider);

		JLabel fecha = new JLabel("Fecha seleccionada: 2024-10-01");
		fecha.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		fecha.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		fecha.setBounds(10, 244, 249, 34);
		contentPanel.add(fecha);

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int diaSeleccionado = slider.getValue();
				fecha.setText("Fecha seleccionada: 2024-10-" + String.format("%02d", diaSeleccionado));
			}
		});

		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblNombre.setBounds(29, 43, 66, 14);
		contentPanel.add(lblNombre);

		JLabel lblTipo = new JLabel("ELIGE EL TIPO");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblTipo.setBounds(342, 43, 91, 14);
		contentPanel.add(lblTipo);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton agregar = new JButton("AGREGAR");
				agregar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						String nombre = textNombre.getText();
						String tipo = (String) comboBox.getSelectedItem();
						int fechaSeleccionada = slider.getValue();

						if (principal != null) {
							principal.agregarEvento(nombre, tipo, fechaSeleccionada);
						}
						if (nombre.isEmpty() && tipo != "-1") {
							JOptionPane.showMessageDialog(null, "ERROR");

						}

						dispose();
					}
				});
				buttonPane.add(agregar);
				getRootPane().setDefaultButton(agregar);
			}
			{
				JButton cancelButton = new JButton("SALIR");
				cancelButton.setActionCommand("SALIR");
				buttonPane.add(cancelButton);
			}
		}
	}
}