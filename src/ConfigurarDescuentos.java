import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfigurarDescuentos extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txt1a5;
	private JTextField txt6a10;
	private JTextField txt11a15;
	private JTextField txtmas15;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarDescuentos frame = new ConfigurarDescuentos();
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
	public ConfigurarDescuentos() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 490, 161);
		getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("1 a 5 unidades");
		lblA.setBounds(12, 12, 129, 17);
		getContentPane().add(lblA);
		
		JLabel lblA_4 = new JLabel("6 a 10 unidades");
		lblA_4.setBounds(12, 41, 129, 17);
		getContentPane().add(lblA_4);
		
		JLabel lblA_1 = new JLabel("11 a 15 unidades");
		lblA_1.setBounds(12, 70, 129, 17);
		getContentPane().add(lblA_1);
		
		JLabel lblMsDe = new JLabel("Más de 15 unidades");
		lblMsDe.setBounds(12, 99, 129, 17);
		getContentPane().add(lblMsDe);
		
		txt1a5 = new JTextField();
		txt1a5.setBounds(158, 10, 114, 21);
		getContentPane().add(txt1a5);
		txt1a5.setColumns(10);
		
		txt6a10 = new JTextField();
		txt6a10.setColumns(10);
		txt6a10.setBounds(158, 39, 114, 21);
		getContentPane().add(txt6a10);
		
		txt11a15 = new JTextField();
		txt11a15.setColumns(10);
		txt11a15.setBounds(158, 68, 114, 21);
		getContentPane().add(txt11a15);
		
		txtmas15 = new JTextField();
		txtmas15.setColumns(10);
		txtmas15.setBounds(158, 97, 114, 21);
		getContentPane().add(txtmas15);
		
		JLabel label = new JLabel("%");
		label.setBounds(278, 12, 17, 17);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("%");
		label_1.setBounds(278, 41, 17, 17);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setBounds(278, 70, 17, 17);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setBounds(278, 99, 17, 17);
		getContentPane().add(label_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(363, 10, 105, 21);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(363, 36, 105, 21);
		getContentPane().add(btnCancelar);

		txt1a5.setText(tienda.porcentaje1+"");
		txt6a10.setText(tienda.porcentaje2+"");
		txt11a15.setText(tienda.porcentaje3+"");
		txtmas15.setText(tienda.porcentaje4+"");
		
	}
	
	void configurar() {
		tienda.porcentaje1 = Double.parseDouble(txt1a5.getText());
		tienda.porcentaje2 = Double.parseDouble(txt6a10.getText());
		tienda.porcentaje3 = Double.parseDouble(txt11a15.getText());
		tienda.porcentaje4 = Double.parseDouble(txtmas15.getText());
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
