package tpvFdS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Seleccion extends JPanel {
	private JButton[] botonesCategorias;
	private JButton botonAceptar, botonCancelar;
	private JSpinner spinnerCantidad;
	private JLabel labelProductoSeleccionado;

	private String[][] productos = { { "Ensalada", "Sopa" }, // Entrantes
			{ "Arroz", "Pasta" }, // Primeros
			{ "Pollo", "Pescado" }, // Segundos
			{ "Helado", "Pastel" }, // Postres
			{ "Agua", "Vino" } // Bebidas
	};

	private String[] categorias = { "Entrantes", "Primeros", "Segundos", "Postres", "Bebidas" };

	public Seleccion() {
		setLayout(new BorderLayout());

		// Panel de categorías
		JPanel panelCategorias = new JPanel(new GridLayout(1, categorias.length));
		botonesCategorias = new JButton[categorias.length];

		for (int i = 0; i < categorias.length; i++) {
			botonesCategorias[i] = new JButton(categorias[i]);
			final int index = i; // Para usar en el ActionListener
			botonesCategorias[i].addActionListener(e -> mostrarProductos(index));
			panelCategorias.add(botonesCategorias[i]);
		}

		add(panelCategorias, BorderLayout.NORTH);

		// Panel inferior para aceptar o cancelar la selección
		JPanel panelInferior = new JPanel(new FlowLayout());
		labelProductoSeleccionado = new JLabel("Seleccionado: ");
		spinnerCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		botonAceptar = new JButton("Aceptar");
		botonCancelar = new JButton("Cancelar");

		panelInferior.add(labelProductoSeleccionado);
		panelInferior.add(spinnerCantidad);
		panelInferior.add(botonAceptar);
		panelInferior.add(botonCancelar);

		add(panelInferior, BorderLayout.SOUTH);
	}

	private void mostrarProductos(int categoriaIndex) {
		// Crear un diálogo para mostrar productos
		JDialog dialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Seleccionar Producto", true);
		JPanel panelProductos = new JPanel(new GridLayout(0, 2)); 

		
		for (String producto : productos[categoriaIndex]) {
			JButton botonProducto = new JButton(producto);
			botonProducto.addActionListener(e -> labelProductoSeleccionado.setText("Seleccionado: " + producto));
			panelProductos.add(botonProducto);
			
		}

		dialog.add(panelProductos);
		dialog.pack();
		dialog.setVisible(true);
	}

	public void addAceptarListener(ActionListener listener) {
		botonAceptar.addActionListener(listener);
	}

	public void addCancelarListener(ActionListener listener) {
		botonCancelar.addActionListener(listener);
	}

	public int getCantidadSeleccionada() {
		return (int) spinnerCantidad.getValue();
	}

	public String getProductoSeleccionado() {
		return labelProductoSeleccionado.getText().replace("Seleccionado: ", "");
	}
}
