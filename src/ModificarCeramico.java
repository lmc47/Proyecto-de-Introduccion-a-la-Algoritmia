import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ModificarCeramico extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnNewButton;
	private JComboBox cboModelo;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCeramico frame = new ModificarCeramico();
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
	public ModificarCeramico() {
		setTitle("Modificar Ceramico");
		setMaximizable(true);
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 482, 225);
		getContentPane().setLayout(null);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(12, 17, 90, 17);
		getContentPane().add(lblModelo);
		
		JLabel lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(12, 46, 90, 17);
		getContentPane().add(lblPrecios);
		
		JLabel lblAnchocm = new JLabel("Ancho (cm)");
		lblAnchocm.setBounds(12, 75, 90, 17);
		getContentPane().add(lblAnchocm);
		
		JLabel lblLargomm = new JLabel("Largo (cm)");
		lblLargomm.setBounds(12, 104, 90, 17);
		getContentPane().add(lblLargomm);
		
		JLabel lblEspesormm = new JLabel("Espesor (mm)");
		lblEspesormm.setBounds(12, 133, 90, 17);
		getContentPane().add(lblEspesormm);
		
		JLabel lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(12, 162, 90, 17);
		getContentPane().add(lblContenido);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(149, 44, 175, 21);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(149, 73, 175, 21);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(149, 102, 175, 21);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(149, 131, 175, 21);
		getContentPane().add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setColumns(10);
		txtContenido.setBounds(149, 164, 175, 21);
		getContentPane().add(txtContenido);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setBounds(149, 12, 175, 21);
		getContentPane().add(cboModelo);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(354, 12, 105, 21);
		getContentPane().add(btnNewButton);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(354, 41, 105, 21);
		getContentPane().add(btnGrabar);
				cboModelo.setModel(new DefaultComboBoxModel(new String[] {tienda.modelo0,tienda.modelo1,tienda.modelo2,tienda.modelo3,tienda.modelo4}));
		//Cuando la caja diálogo se haga visible deberán verse inmediatamente los datos delprimer cerámico
				cboModelo.setSelectedIndex(0);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGrabar) {
			do_btnGrabar_actionPerformed(e);
		}
		if (e.getSource() == cboModelo) {
			do_cboModelo_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose(); 
	}
	protected void do_cboModelo_actionPerformed(ActionEvent e) {
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			txtPrecio.setText(tienda.precio0+"");
			txtAncho.setText(tienda.ancho0+"");
			txtLargo.setText(tienda.largo0+"");
			txtEspesor.setText(tienda.espesor0+"");
			txtContenido.setText(tienda.contenido0+"");
			break;
		
		case 1:
			txtPrecio.setText(tienda.precio1+"");
			txtAncho.setText(tienda.ancho1+"");
			txtLargo.setText(tienda.largo1+"");
			txtEspesor.setText(tienda.espesor1+"");
			txtContenido.setText(tienda.contenido1+"");
			break;
		
		case 2:
			txtPrecio.setText(tienda.precio2+"");
			txtAncho.setText(tienda.ancho2+"");
			txtLargo.setText(tienda.largo2+"");
			txtEspesor.setText(tienda.espesor2+"");
			txtContenido.setText(tienda.contenido2+"");
			break;
			
		case 3:
			txtPrecio.setText(tienda.precio3+"");
			txtAncho.setText(tienda.ancho3+"");
			txtLargo.setText(tienda.largo3+"");
			txtEspesor.setText(tienda.espesor3+"");
			txtContenido.setText(tienda.contenido3+"");
			break;

		default:
			txtPrecio.setText(tienda.precio4+"");
			txtAncho.setText(tienda.ancho4+"");
			txtLargo.setText(tienda.largo4+"");
			txtEspesor.setText(tienda.espesor4+"");
			txtContenido.setText(tienda.contenido4+"");
			break;
		}
		
	}
	protected void do_btnGrabar_actionPerformed(ActionEvent e) {
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			tienda.precio0=Double.parseDouble(txtPrecio.getText());
			tienda.ancho0=Double.parseDouble(txtAncho.getText());
			tienda.largo0=Double.parseDouble(txtLargo.getText());
			tienda.espesor0=Double.parseDouble(txtEspesor.getText());
			tienda.contenido0=Integer.parseInt(txtContenido.getText());
			break;
		
		case 1:
			tienda.precio1=Double.parseDouble(txtPrecio.getText());
			tienda.ancho1=Double.parseDouble(txtAncho.getText());
			tienda.largo1=Double.parseDouble(txtLargo.getText());
			tienda.espesor1=Double.parseDouble(txtEspesor.getText());
			tienda.contenido1=Integer.parseInt(txtContenido.getText());
			break;
		
		case 2:
			tienda.precio2=Double.parseDouble(txtPrecio.getText());
			tienda.ancho2=Double.parseDouble(txtAncho.getText());
			tienda.largo2=Double.parseDouble(txtLargo.getText());
			tienda.espesor2=Double.parseDouble(txtEspesor.getText());
			tienda.contenido2=Integer.parseInt(txtContenido.getText());
			break;
			
		case 3:
			tienda.precio3=Double.parseDouble(txtPrecio.getText());
			tienda.ancho3=Double.parseDouble(txtAncho.getText());
			tienda.largo3=Double.parseDouble(txtLargo.getText());
			tienda.espesor3=Double.parseDouble(txtEspesor.getText());
			tienda.contenido3=Integer.parseInt(txtContenido.getText());
			break;

		default:
			tienda.precio0=Double.parseDouble(txtPrecio.getText());
			tienda.ancho0=Double.parseDouble(txtAncho.getText());
			tienda.largo0=Double.parseDouble(txtLargo.getText());
			tienda.espesor0=Double.parseDouble(txtEspesor.getText());
			tienda.contenido0=Integer.parseInt(txtContenido.getText());
			break;
		}
		setVisible(false);
		dispose(); 
		
	}
}
