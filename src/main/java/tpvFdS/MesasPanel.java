package tpvFdS;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MesasPanel extends JPanel {
	private String nombre;
	private JButton botonAnadir;
	private JTextArea textoComanda;
	private List<Producto> platos;

	public MesasPanel(String nombre) {
		this.nombre = nombre;
		this.platos = new ArrayList<>();

		setLayout(new BorderLayout());

		// Etiqueta para el nombre de la mesa
		JLabel labelNombreMesa = new JLabel(nombre, SwingConstants.CENTER);
		add(labelNombreMesa, BorderLayout.NORTH);

		// Área de texto para mostrar la comanda
		textoComanda = new JTextArea(10, 30);
		textoComanda.setEditable(false);
		textoComanda.setLineWrap(true); // Para que el texto se ajuste a la línea
		textoComanda.setWrapStyleWord(true); // Para que ajuste por palabra
		add(textoComanda, BorderLayout.CENTER);

		// Botón para añadir ítem
		botonAnadir = new JButton("Añadir Item");
		add(botonAnadir, BorderLayout.SOUTH);
	}

	public JButton getBotonAnadir() {
		return botonAnadir;
	}

	public void addItem(String nombre, String tipo, int cantidad, double precio) {
		platos.add(new Producto(nombre, tipo, cantidad, precio));
		actualizarTextoComanda();
		
	}

	private void actualizarTextoComanda() {
		StringBuilder sb = new StringBuilder();
		double total = 0;

		for (Producto item : platos) {
			sb.append(item.getNombre()).append(" - ").append(item.getCantidad()).append(" x ").append(item.getPrecio())
					.append(" = ").append(item.getPrecioTotal()).append("\n");
			total += item.getPrecioTotal();
		}

		sb.append("Total: ").append(total);
		textoComanda.setText(sb.toString());
	}
}