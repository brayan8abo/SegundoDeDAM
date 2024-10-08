package Actividad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ActividadesYEjemplos.MiDialogo;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class ListaTareas extends JFrame {

	private JPanel contentPane;
	private static int seleccionado;
	JList<String> lista = new JList();
	String nuevaTarea;

	DefaultListModel<String> listModel = new DefaultListModel<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaTareas frame = new ListaTareas();
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
	public ListaTareas() {
		setResizable(false);
		setTitle("LISTA DE TAREAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		lista = new JList<String>();
		lista.setBackground(SystemColor.activeCaption);
		lista.setModel(listModel);
		lista.setBounds(129, 108, 333, 145);
		contentPane.add(lista);

		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBackground(new Color(255, 255, 255));
		// JFrame dialog = this;
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Tarea tareaAgregar = new Tarea(ListaTareas.this);
				tareaAgregar.setVisible(true);

				nuevaTarea = tareaAgregar.getTarea();

				if (nuevaTarea != null && !nuevaTarea.isEmpty()) {
					listModel.addElement(nuevaTarea);

				} else
					JOptionPane.showMessageDialog(btnAgregar,"ERROR");

			}

		});
		btnAgregar.setBounds(25, 322, 116, 23);
		contentPane.add(btnAgregar);

		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int selecionado = lista.getSelectedIndex();

				if (selecionado != -1) {
					listModel.remove(selecionado);
				} else
					JOptionPane.showMessageDialog(btnEliminar, "ERROR");
				

			}
		});
		btnEliminar.setBounds(290, 322, 122, 23);
		contentPane.add(btnEliminar);

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				seleccionado = lista.getSelectedIndex();

				lista.getSelectedIndex();
				if (seleccionado != -1) {

					// String tareaActual = listModel.getElementAt(seleccionado);

					Tarea tareaModificar = new Tarea(ListaTareas.this);
					tareaModificar.setVisible(true);

					String tareaModificada = tareaModificar.getTarea();
					if (tareaModificada != null && !tareaModificada.isEmpty()) {
						// Reemplazamos la tarea en la lista con la tarea modificada
						listModel.setElementAt(tareaModificada, seleccionado);
					}
				} else {
					JOptionPane.showMessageDialog(ListaTareas.this, "ERROR");
				}
			}
		});
		btnModificar.setBounds(151, 322, 129, 23);
		contentPane.add(btnModificar);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(422, 322, 122, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ListaTareas.class.getResource("/img/Diseño sin título.png")));
		lblNewLabel.setBounds(0, 0, 554, 371);
		contentPane.add(lblNewLabel);
	}
}
