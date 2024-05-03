import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CantidadOptima extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtOptima;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CantidadOptima frame = new CantidadOptima();
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
	public CantidadOptima() {
		setTitle("Configurar cantidad óptima");
		setBounds(100, 100, 572, 105);
		getContentPane().setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(449, 12, 105, 21);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(449, 38, 105, 21);
		getContentPane().add(btnCancelar);
		
		txtOptima = new JTextField();
		txtOptima.setBounds(218, 12, 184, 21);
		getContentPane().add(txtOptima);
		txtOptima.setColumns(10);
		
		JLabel lblCantidadptimaDe = new JLabel("Cantidad óptima de unidades");
		lblCantidadptimaDe.setBounds(12, 14, 192, 17);
		getContentPane().add(lblCantidadptimaDe);
		
		txtOptima.setText(tienda.cantidadOptima+"");

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			do_btnCancelar_actionPerformed(e);
		}
		if (e.getSource() == btnAceptar) {
			do_btnAceptar_actionPerformed(e);
		}
		
		
		
	}
	protected void do_btnAceptar_actionPerformed(ActionEvent e) {
		tienda.cantidadOptima = Integer.parseInt(txtOptima.getText());
		dispose();
	}
	protected void do_btnCancelar_actionPerformed(ActionEvent e) {
	dispose();
	}
}
