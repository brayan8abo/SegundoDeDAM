package Actividad2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Component;

public class Tarea extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textTarea;

	/**
	 * Launch the application.
	 */

	private JTextField tareas;
	public String tareasNuevas;

	public static void main(String[] args) {
		try {
			Tarea dialog = new Tarea();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Tarea() {
		setTitle("TAREAS");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		textTarea = new JTextField();
		textTarea.setBounds(35, 72, 375, 76);
		contentPanel.add(textTarea);
		textTarea.setColumns(10);

		JLabel lblNewLabel = new JLabel("INGRESA LA TAREA");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 29, 206, 32);
		contentPanel.add(lblNewLabel);
		setLocationRelativeTo(null);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setAlignmentX(Component.LEFT_ALIGNMENT);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("AGREGAR");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						tareasNuevas = tareas.getText();
						System.out.print(tareasNuevas);

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("SALIR");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

	public String getIntroducido() {
		return this.tareasNuevas;
	}
}
