import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acercade extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acercade frame = new Acercade();
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
	public Acercade() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("JetBrains Mono", Font.BOLD, 28));
		lblTienda.setBounds(124, 12, 188, 38);
		getContentPane().add(lblTienda);
		
		JLabel label = new JLabel("________________________________________________________________________________________");
		label.setBounds(0, 48, 440, 17);
		getContentPane().add(label);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAutor.setBounds(181, 77, 60, 17);
		getContentPane().add(lblAutor);
		
		JLabel lblNewLabel = new JLabel("Luis Madrid");
		lblNewLabel.setBounds(168, 106, 88, 17);
		getContentPane().add(lblNewLabel);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(149, 227, 105, 21);
		getContentPane().add(btnCerrar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		dispose();
	}
}
