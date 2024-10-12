//package Actividad2;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.border.LineBorder;
//import java.awt.Color;
//import javax.swing.JLabel;
//import java.awt.Font;
//import java.awt.Frame;
//
//import javax.swing.SwingConstants;
//import javax.swing.JButton;
//import javax.swing.JDialog;
//
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class Eventos extends JFrame {
//
//	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
//	private JTable tablaEventos;
//	protected Frame table;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Eventos frame = new Eventos();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Eventos() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 560, 390);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setLocationRelativeTo(null);
//		setTitle("EVENTOS");
//
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//
//		tablaEventos = new JTable();
//		tablaEventos.setBorder(new LineBorder(new Color(0, 0, 0)));
//		tablaEventos
//				.setModel(new DefaultTableModel(
//						new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
//								{ null, null, null }, { null, null, null }, },
//						new String[] { "NOMBRE", "TIPO", "FECHA" }));
//		tablaEventos.setBounds(54, 55, 437, 80);
//		contentPane.add(tablaEventos);
//
//		JLabel lblNombre = new JLabel("NOMBRE");
//		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		lblNombre.setBounds(87, 30, 63, 14);
//		contentPane.add(lblNombre);
//
//		JLabel lblTipo = new JLabel("TIPO");
//		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
//		lblTipo.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		lblTipo.setBounds(249, 28, 46, 16);
//		contentPane.add(lblTipo);
//
//		JLabel lblFecha = new JLabel("FECHA");
//		lblFecha.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
//		lblFecha.setBounds(396, 30, 55, 14);
//		contentPane.add(lblFecha);
//
//		JButton btnIncluir = new JButton("INCLUIR EVENTO");
//		btnIncluir.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				ControladorEventos datos = new ControladorEventos(Eventos.this);
//				datos.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//				datos.setVisible(true);
//			}
//		});
//		btnIncluir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		btnIncluir.setBounds(29, 300, 156, 23);
//		contentPane.add(btnIncluir);
//
//		JButton btnSalir = new JButton("SALIR");
//		btnSalir.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
//		btnSalir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
//		btnSalir.setBounds(428, 300, 89, 23);
//		contentPane.add(btnSalir);
//	}
//
//	public void agregarEvento(String nombre, String tipo, int dia) {
//		String fechaCompleta = "2024-10-" + String.format("%02d", dia); // Formatear la fecha como String
//		DefaultTableModel model = (DefaultTableModel) tablaEventos.getModel();
//		model.addRow(new Object[] { nombre, tipo, fechaCompleta });
//	}
//}
package Actividad2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class Eventos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaEventos;
	private DefaultTableModel model;
	private int mesActual;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Eventos frame = new Eventos();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Eventos() {

		Calendar calendar = Calendar.getInstance();
		int añoActual = calendar.get(Calendar.YEAR);
		mesActual = calendar.get(Calendar.MONTH) + 1;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("EVENTOS");
		setSize(590, 390);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		model = new DefaultTableModel(new Object[][] {}, new String[] { "NOMBRE", "TIPO", "FECHA" });
		tablaEventos = new JTable(model);
		tablaEventos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaEventos.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		tablaEventos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablaEventos.setBounds(54, 55, 437, 145);
		contentPane.add(tablaEventos);

		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblNombre.setBounds(87, 30, 63, 14);
		contentPane.add(lblNombre);

		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblTipo.setBounds(249, 28, 46, 16);
		contentPane.add(lblTipo);

		JLabel lblFecha = new JLabel(
				"Fecha seleccionada: " + añoActual + "-" + String.format("%02d", mesActual) + "-01");
		lblFecha.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setBounds(396, 30, 55, 14);
		contentPane.add(lblFecha);

		JButton btnIncluir = new JButton("INCLUIR EVENTO");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorEventos dialog = new ControladorEventos(Eventos.this);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		btnIncluir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		btnIncluir.setBounds(29, 300, 143, 23);
		contentPane.add(btnIncluir);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		btnSalir.setBounds(428, 300, 89, 23);
		contentPane.add(btnSalir);
	}

	// Método para agregar un evento
	public void agregarEvento(String nombre, String tipo, int dia) {
		// Obtener el año y el mes actual
		Calendar calendar = Calendar.getInstance();
		int año = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH) + 1; // +1 porque los meses empiezan en 0

		// Formatear la fecha en formato YYYY-MM-DD
		String fecha = String.format("%04d-%02d-%02d", año, mes, dia);

		// Agregar la fila a la tabla
		DefaultTableModel model = (DefaultTableModel) tablaEventos.getModel();
		model.addRow(new Object[] { nombre, tipo, fecha });
	}
}