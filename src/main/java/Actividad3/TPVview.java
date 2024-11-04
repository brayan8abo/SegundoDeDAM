/*package Actividad3;


import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.SliderUI;

import java.awt.GridLayout;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class TPVview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	DefaultListModel<String> listModel = new DefaultListModel<>();
	CardLayout cardLayout;
	ClassLoader classloader = getClass().getClassLoader();

	
	  //Launch the application.
	
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

	String tipos[] = { "ENTRANTES", "PRIMEROS", "SEGUNDOS", "POSTRES", "BEBIDAS" };
	private JTable tablaProductos;

	public TPVview() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		cardLayout = new CardLayout();
		contentPane.setLayout(cardLayout);

		// ICONO MESAS
		ImageIcon iconoMesa = new ImageIcon(classloader.getResource("mesa.png"));
		iconoMesa.setImage(iconoMesa.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));


		ImageIcon iconoEntrante1 = new ImageIcon(classloader.getResource("croquetas.png"));
		iconoEntrante1.setImage(iconoEntrante1.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

		ImageIcon iconoEntrante2 = new ImageIcon(classloader.getResource("pinchos.png"));
		iconoEntrante2.setImage(iconoEntrante2.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

		ImageIcon iconoEntrante3 = new ImageIcon(classloader.getResource("carpaccio.png"));
		iconoEntrante3.setImage(iconoEntrante3.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));


		JPanel panel = new JPanel();
		contentPane.add(panel, "principal");
		panel.setLayout(new GridLayout(0, 2, 0, 0));
//	for para mesas
		for (int i = 1; i <= 6; i++) {
			panel.add(botonesMesas(i, iconoMesa));
		}

		JPanel panelTipos = new JPanel();
		panelTipos.setBounds(100, 100, 800, 800);
		contentPane.add(panelTipos, "panelTipos");
		panelTipos.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("hOLA");
		spinner.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinner.setBounds(100, 81, 73, 32);
		panelTipos.add(spinner);
		
		JButton btnAgregarPlato = new JButton("AGREGAR");
		btnAgregarPlato.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnAgregarPlato.setBounds(77, 159, 118, 25);
		panelTipos.add(btnAgregarPlato);

		JPanel paneLista = new JPanel();
		contentPane.add(paneLista, "panelLista");
		paneLista.setLayout(null);

		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnAgregar.setBounds(148, 493, 115, 35);
		paneLista.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelTipos");

			}
		});

		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnBorrar.setBounds(35, 493, 103, 35);
		paneLista.add(btnBorrar);

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnModificar.setBounds(275, 493, 121, 35);
		paneLista.add(btnModificar);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnSalir.setBounds(616, 500, 84, 28);
		paneLista.add(btnSalir);

		tablaProductos = new JTable();
		tablaProductos.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "MESA", "PRODUCTOS", "PRECIO", "TOTAL" }));
		tablaProductos.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		tablaProductos.setBounds(61, 99, 604, 289);
		paneLista.add(tablaProductos);

		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "principal");

			}
		});
		btnAtras.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		btnAtras.setBounds(522, 500, 84, 28);
		paneLista.add(btnAtras);

		JLabel lblNMesa = new JLabel("# MESA");
		lblNMesa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNMesa.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		lblNMesa.setBounds(81, 64, 64, 24);
		paneLista.add(lblNMesa);

		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductos.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		lblProductos.setBounds(226, 64, 103, 24);
		paneLista.add(lblProductos);

		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		lblPrecio.setBounds(408, 64, 103, 24);
		paneLista.add(lblPrecio);

		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Linux Libertine G", Font.BOLD, 14));
		lblTotal.setBounds(562, 64, 103, 24);
		paneLista.add(lblTotal);

		JButton botones[] = new JButton[tipos.length];
		int x = 10;
		int y = 10;
		int width = 110;
		int height = 80;
		int padding = 35;

		for (int i = 0; i < tipos.length; i++) {
			int indexTipo = i;
			JPanel panelProductos = new JPanel();
			contentPane.add(panelProductos, tipos[i]);
			panelProductos.setLayout(null);

			JLabel jlabel = new JLabel(tipos[i]);
			jlabel.setBounds(110, 20, 100, 100);
			/*JLabel jlabel2 = new JLabel("prueba");
			jlabel.setBounds(60, 100, 100, 100);
			panelProductos.add(jlabel);
			panelProductos.add(jlabel2);*/

			JButton btnAtrasProductos = new JButton("ATRÁS");
			btnAtrasProductos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cardLayout.show(contentPane, "panelTipos");
				}

			});
			btnAtrasProductos.setBounds(200, 200, 100, 100);
			panelProductos.add(btnAtrasProductos);
		//	panelProductos.add(jlabel2);

			/*
			 * if (tipos[i].equals("ENTRANTES")) { JButton primeros1 = new JButton();
			 * primeros1.setBounds(100, 120, 120, 150); panelProductos.add(primeros1);
			 * primeros1.setIcon(iconoEntrante1); JButton primeros2 = new JButton();
			 * primeros2.setBounds(250,200, 120, 150); panelProductos.add(primeros2);
			 * primeros2.setIcon(iconoEntrante2); JButton primeros3 = new JButton();
			 * primeros3.setBounds(350, 350, 120, 150); panelProductos.add(primeros3);
			 * primeros3.setIcon(iconoEntrante3);
			 * 
			 */
			if (tipos[i].equals("ENTRANTES")) {

				panelProductos.setLayout(new GridLayout(1, 3, 10, 10)); // 1 fila, 3 columnas, con espaciado de 10
																		// píxeles

				JButton entrante1 = new JButton(iconoEntrante1);
				JButton entrante2 = new JButton(iconoEntrante2);
				JButton entrante3 = new JButton(iconoEntrante3);

				// Añadir los botones al panel
				panelProductos.add(entrante1);
				panelProductos.add(entrante2);
				panelProductos.add(entrante3);

				// Configurar texto en los botones (opcional)
				entrante1.setText("Croquetas");
				entrante2.setText("Pinchos");
				entrante3.setText("Carpaccio");

				// Opcional: Posicionar el texto de cada botón en la parte inferior
				entrante1.setVerticalTextPosition(SwingConstants.BOTTOM);
				entrante1.setHorizontalTextPosition(SwingConstants.CENTER);
				entrante2.setVerticalTextPosition(SwingConstants.BOTTOM);
				entrante2.setHorizontalTextPosition(SwingConstants.CENTER);
				entrante3.setVerticalTextPosition(SwingConstants.BOTTOM);
				entrante3.setHorizontalTextPosition(SwingConstants.CENTER);
				
				
				
				

			}
			if (tipos[i].equals("PRIMEROS")) {
				JButton primeros1 = new JButton("PRUEBA");
				primeros1.setBounds(150, 150, 120, 40);
				panelProductos.add(primeros1);
			}
			if (tipos[i].equals("SEGUNDOS")) {
				JButton segundos1 = new JButton("PRUEBA");
				segundos1.setBounds(150, 150, 120, 40);
				panelProductos.add(segundos1);
			}
			if (tipos[i].equals("POSTRES")) {
				JButton postres1 = new JButton("PRUEBA");
				postres1.setBounds(150, 150, 120, 40);
				panelProductos.add(postres1);
			}
			if (tipos[i].equals("BEBIDAS")) {
				JButton bebidas1 = new JButton("PRUEBA");
				bebidas1.setBounds(150, 150, 120, 40);
				panelProductos.add(bebidas1);
			}

				if (tipos[i].equals("ENTRANTES")) {
				    botones[i].addActionListener(new ActionListener() {
				        @Override
				        public void actionPerformed(ActionEvent e) {
				            cardLayout.show(contentPane, "panelEntrantes"); // Cambia a panelEntrantes

	private JButton botonesMesas(int identificador, ImageIcon iconoMesa) {
		JButton button = new JButton("MESA " + identificador);
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		button.setIcon(iconoMesa);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(contentPane, "panelLista");
			}
		});
		return button;
	}*/