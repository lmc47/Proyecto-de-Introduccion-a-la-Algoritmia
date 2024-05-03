import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ConsultarCeramico extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JComboBox cboModelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarCeramico frame = new ConsultarCeramico();
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
	public ConsultarCeramico() {
		setTitle("Consultar Ceramico");
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
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(149, 44, 175, 21);
		getContentPane().add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(149, 73, 175, 21);
		getContentPane().add(txtAncho);
		
		txtLargo = new JTextField();
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(149, 102, 175, 21);
		getContentPane().add(txtLargo);
		
		txtEspesor = new JTextField();
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(149, 131, 175, 21);
		getContentPane().add(txtEspesor);
		
		txtContenido = new JTextField();
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(149, 164, 175, 21);
		getContentPane().add(txtContenido);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {tienda.modelo0,tienda.modelo1,tienda.modelo2,tienda.modelo3,tienda.modelo4}));
		cboModelo.setBounds(149, 12, 175, 21);
		getContentPane().add(cboModelo);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose(); 
				
			}
		});
		btnNewButton.setBounds(354, 12, 105, 21);
		getContentPane().add(btnNewButton);
		//Cuando la caja diálogo se haga visible deberán verse inmediatamente los datos delprimer cerámico
				cboModelo.setSelectedIndex(0);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			do_cboModelo_actionPerformed(e);
		}
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
}
