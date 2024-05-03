import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarObsequios extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtTipo;
	private JTextField txt1a5;
	private JTextField txt6a10;
	private JTextField txt11mas;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
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
	public ConfigurarObsequios() {
		setTitle("Configurar obsequios");
		setBounds(100, 100, 490, 161);
		getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("Tipo de obsequio");
		lblA.setBounds(12, 12, 129, 17);
		getContentPane().add(lblA);
		
		JLabel lblA_4 = new JLabel("1 a 5 unidades");
		lblA_4.setBounds(12, 41, 129, 17);
		getContentPane().add(lblA_4);
		
		JLabel lblA_1 = new JLabel("6 a 10 unidades");
		lblA_1.setBounds(12, 70, 129, 17);
		getContentPane().add(lblA_1);
		
		JLabel lblMsDe = new JLabel("11 a más unidades");
		lblMsDe.setBounds(12, 99, 129, 17);
		getContentPane().add(lblMsDe);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(158, 10, 114, 21);
		getContentPane().add(txtTipo);
		txtTipo.setColumns(10);
		
		txt1a5 = new JTextField();
		txt1a5.setColumns(10);
		txt1a5.setBounds(158, 39, 114, 21);
		getContentPane().add(txt1a5);
		
		txt6a10 = new JTextField();
		txt6a10.setColumns(10);
		txt6a10.setBounds(158, 68, 114, 21);
		getContentPane().add(txt6a10);
		
		txt11mas = new JTextField();
		txt11mas.setColumns(10);
		txt11mas.setBounds(158, 97, 114, 21);
		getContentPane().add(txt11mas);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(363, 10, 105, 21);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(363, 36, 105, 21);
		getContentPane().add(btnCancelar);
		
		txtTipo.setText(tienda.tipoObsequio);
		txt1a5.setText(tienda.obsequioCantidad1+"");
		txt6a10.setText(tienda.obsequioCantidad2+"");
		txt11mas.setText(tienda.obsequioCantidad3+"");

	}
	
	void configurar() {
		tienda.tipoObsequio = txtTipo.getText();
		tienda.obsequioCantidad1 = Integer.parseInt(txt1a5.getText());
		tienda.obsequioCantidad2 = Integer.parseInt(txt6a10.getText());
		tienda.obsequioCantidad3 = Integer.parseInt(txt11mas.getText());
		dispose();
		
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
		configurar();
	}
	protected void do_btnCancelar_actionPerformed(ActionEvent e) {
		dispose();
	}
}
