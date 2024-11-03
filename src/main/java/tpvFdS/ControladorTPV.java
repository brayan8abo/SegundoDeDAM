package tpvFdS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTPV {
	private tpvWiew2_0 vista;
	private MesasPanel[] mesas;

	public ControladorTPV(tpvWiew2_0 vista) {
		this.vista = vista;
		mesas = new MesasPanel[] { new MesasPanel("Mesa 1"), new MesasPanel("Mesa 2"), new MesasPanel("Mesa 3"),
				new MesasPanel("Mesa 4"), new MesasPanel("Mesa 5"), new MesasPanel("Mesa 6") };
		

		for (MesasPanel mesa : mesas) {
			vista.addMesaPanel(mesa);
			mesa.getBotonAnadir().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarPanelItem(mesa);
					
				}
			});
		}
	}

	private void mostrarPanelItem(MesasPanel mesa) {
		JDialog dialog = new JDialog(vista, "Añadir Item", true);
		Seleccion itemPanel = new Seleccion();

		itemPanel.addAceptarListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String productoSeleccionado = itemPanel.getProductoSeleccionado();
				int cantidad = itemPanel.getCantidadSeleccionada();
				double precio = 10.0; // Precio fijo para simplificar
				mesa.addItem(productoSeleccionado, "General", cantidad, precio);
				dialog.dispose();
				
			}
		});

		itemPanel.addCancelarListener(e -> dialog.dispose());

		dialog.add(itemPanel);
		dialog.pack();
		dialog.setVisible(true);
	}
}