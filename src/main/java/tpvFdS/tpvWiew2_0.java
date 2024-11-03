package tpvFdS;

import javax.swing.*;
import java.awt.*;

public class tpvWiew2_0 extends JFrame {
	private JPanel panelMesas;

	public tpvWiew2_0() {
		setTitle("TPV Restaurante");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		panelMesas = new JPanel(new GridLayout(2, 3));
		add(panelMesas, BorderLayout.CENTER);

		new ControladorTPV(this); // Inicializar el controlador
		setLocationRelativeTo(null);
	}

	public void addMesaPanel(MesasPanel mesa) {
		panelMesas.add(mesa);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			tpvWiew2_0 vista = new tpvWiew2_0();
			vista.setVisible(true);
		});
	}
}