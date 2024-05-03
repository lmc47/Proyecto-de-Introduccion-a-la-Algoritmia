import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class Vender extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JTextArea txtImprimir;
	private JButton btnVender;
	private JComboBox cboModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setTitle("Vender");
		setClosable(true);
		setMaximizable(true);
		setBounds(100, 100, 552, 390);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(12, 12, 60, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(12, 41, 60, 17);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad");
		lblNewLabel_2.setBounds(12, 70, 60, 17);
		getContentPane().add(lblNewLabel_2);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {tienda.modelo0,tienda.modelo1,tienda.modelo2,tienda.modelo3,tienda.modelo4}));
		cboModelo.setBounds(116, 7, 209, 21);
		getContentPane().add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(116, 39, 209, 21);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(116, 68, 209, 21);
		getContentPane().add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(415, 7, 105, 21);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(415, 39, 105, 21);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 99, 518, 245);
		getContentPane().add(scrollPane);
		
		txtImprimir = new JTextArea();
		txtImprimir.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		scrollPane.setViewportView(txtImprimir);
		//Cuando la caja diálogo se haga visible deberán verse inmediatamente los datos delprimer cerámico
		cboModelo.setSelectedIndex(0);	
		
		txtPrecio.setText(tienda.precio0 + "");
	}
	
	//Permite el precio en el txtField dependiendo del item seleccionado en el cbo
	void precio() {
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			txtPrecio.setText(tienda.precio0+"");
			break;
		case 2:
			txtPrecio.setText(tienda.precio1+"");
			break;		
		case 3:
			txtPrecio.setText(tienda.precio2+"");
			break;
		case 4:
			txtPrecio.setText(tienda.precio3+"");
			break;	
		default:
			txtPrecio.setText(tienda.precio4+"");
		break;
	}
		
		}
	
	
	int unidadesObs,cantidad;
	double ic,id,ip,precio,descuento;
	
	void ingresarCantidad() {
		cantidad=Integer.parseInt(txtCantidad.getText());
	}
	
	
	
	void impCompra() {
		switch (cboModelo.getSelectedIndex()) {
		case 0:
			ic = tienda.precio0 * cantidad;
			break;
		case 1:
			ic = tienda.precio1 * cantidad;
			break;
		case 2:
			ic = tienda.precio2 * cantidad;
			break;
		case 3:
			ic = tienda.precio3 * cantidad;
			break;
		default:
			ic = tienda.precio4 * cantidad;
			break;
		}
	}
	
	void impDescuento() {
		if (cantidad >=1 &&  cantidad <=5 ) {
			descuento = tienda.porcentaje1/100;
		}else if (cantidad >=6 && cantidad <=10) {
			descuento = tienda.porcentaje2/100;			
		}else if (cantidad >=11 && cantidad <=15 ) {
			descuento = tienda.porcentaje3/100;
		}else if (cantidad > 15) {
			descuento = tienda.porcentaje4/100;
			
		}
		id = ic * descuento;
	}
	
	void calObs() {
		if (cantidad >=1 && cantidad <=5) {
			unidadesObs = tienda.obsequioCantidad1;
		}else if (cantidad >=6 && cantidad <=10) {
			unidadesObs = tienda.obsequioCantidad2;
		}else if (cantidad > 10) {
			unidadesObs = tienda.obsequioCantidad3;
		} else {
			id = 0;
		}
	}
	void impPagar () {
		ip = ic - id;                                                                                                                                                              
	}
	
	void ventana() {
		if (tienda.acomuladorVentas % 5 == 0 && tienda.acomuladorVentas > 0) {
			JOptionPane.showMessageDialog(null, "Venta Nro. 5"+"\n"+"Importe General Acomulado: S/. "+String.format("%.2f",tienda.impGAcomulado)+"\n"+"Porcentaje de la couta diaria: "+String.format("%.2f", (tienda.impGAcomulado*100)/tienda.cuotaDiaria)+" %");	
		}
		
	}
	
	void imprimir() {
		tienda.acomuladorVentas++;
		tienda.impGAcomulado += ip;
		txtImprimir.setText(null);
		txtImprimir.append("BOLETA DE VENTA");
		txtImprimir.append("\n");
		txtImprimir.append("\n");
			
		switch (cboModelo.getSelectedIndex()) {


		case 0:
			
			txtImprimir.append("Modelo               : "+tienda.modelo0+"\n");
			txtImprimir.append("Precio               : S/. "+tienda.precio0+"\n");
			txtImprimir.append("Cantidad adquiridad  : "+cantidad+"\n");
			txtImprimir.append("Importe compra       : S/. "+String.format("%.2f", ic)+"\n");
			txtImprimir.append("Importe descuento    : S/. "+String.format("%.2f", id)+"\n");
			txtImprimir.append("Importe pagar        : S/. "+String.format("%.2f", ip)+"\n");
			txtImprimir.append("Tipo de obsequio     : "+tienda.tipoObsequio+"\n");
			txtImprimir.append("Unidades obsequiadas : "+unidadesObs+"\n");
			tienda.ventasProducto0++;
			tienda.cajasVendidas0+=cantidad;
			tienda.imptoven0+=ip;
			break;
		case 1:	
			txtImprimir.append("Modelo               : "+tienda.modelo1+"\n");
			txtImprimir.append("Precio               : S/. "+tienda.precio1+"\n");
			txtImprimir.append("Cantidad adquiridad  : "+cantidad+"\n");
			txtImprimir.append("Importe compra       : S/. "+String.format("%.2f", ic)+"\n");
			txtImprimir.append("Importe descuento    : S/. "+String.format("%.2f", id)+"\n");
			txtImprimir.append("Importe pagar        : S/. "+String.format("%.2f", ip)+"\n");
			txtImprimir.append("Tipo de obsequio     : "+tienda.tipoObsequio+"\n");
			txtImprimir.append("Unidades obsequiadas : "+unidadesObs+"\n");
			tienda.ventasProducto1++;
			tienda.cajasVendidas1+=cantidad;
			tienda.imptoven1+=ip;
			break;
			
		case 2:	
			txtImprimir.append("Modelo               : "+tienda.modelo2+"\n");
			txtImprimir.append("Precio               : S/. "+tienda.precio2+"\n");
			txtImprimir.append("Cantidad adquiridad  : "+cantidad+"\n");
			txtImprimir.append("Importe compra       : S/. "+String.format("%.2f", ic)+"\n");
			txtImprimir.append("Importe descuento    : S/. "+String.format("%.2f", id)+"\n");
			txtImprimir.append("Importe pagar        : S/. "+String.format("%.2f", ip)+"\n");
			txtImprimir.append("Tipo de obsequio     : "+tienda.tipoObsequio+"\n");
			txtImprimir.append("Unidades obsequiadas : "+unidadesObs+"\n");
			tienda.ventasProducto2++;
			tienda.cajasVendidas2+=cantidad;
			tienda.imptoven2+=ip;
			break;
		case 3:	
			txtImprimir.append("Modelo               : "+tienda.modelo3+"\n");
			txtImprimir.append("Precio               : S/. "+tienda.precio3+"\n");
			txtImprimir.append("Cantidad adquiridad  : "+cantidad+"\n");
			txtImprimir.append("Importe compra       : S/. "+String.format("%.2f", ic)+"\n");
			txtImprimir.append("Importe descuento    : S/. "+String.format("%.2f", id)+"\n");
			txtImprimir.append("Importe pagar        : S/. "+String.format("%.2f", ip)+"\n");
			txtImprimir.append("Tipo de obsequio     : "+tienda.tipoObsequio+"\n");
			txtImprimir.append("Unidades obsequiadas : "+unidadesObs+"\n");
			tienda.ventasProducto3++;
			tienda.cajasVendidas3+=cantidad;
			tienda.imptoven3+=ip;
			break;
		case 4:	
			txtImprimir.append("Modelo               : "+tienda.modelo4+"\n");
			txtImprimir.append("Precio               : S/. "+tienda.precio4+"\n");
			txtImprimir.append("Cantidad adquiridad  : "+cantidad+"\n");
			txtImprimir.append("Importe compra       : S/. "+String.format("%.2f", ic)+"\n");
			txtImprimir.append("Importe descuento    : S/. "+String.format("%.2f", id)+"\n");
			txtImprimir.append("Importe pagar        : S/. "+String.format("%.2f", ip)+"\n");
			txtImprimir.append("Tipo de obsequio     : "+tienda.tipoObsequio+"\n");
			txtImprimir.append("Unidades obsequiadas : "+unidadesObs+"\n");
			tienda.ventasProducto4++;
			tienda.cajasVendidas4+=cantidad;
			tienda.imptoven4+=ip;
			break;
		
		default:
			txtImprimir.append("Modelo               : 0" +"\n");
			txtImprimir.append("Precio               : S/. 0 "+"\n");
			txtImprimir.append("Cantidad adquiridad  : 0"+"\n");
			txtImprimir.append("Importe compra       : 0"+"\n");
			txtImprimir.append("Importe descuento    : 0"+"\n");
			txtImprimir.append("Importe pagar        : 0"+"\n");
			txtImprimir.append("Tipo de obsequio     : 0"+"\n");
			txtImprimir.append("Unidades obsequiadas : 0"+"\n");
			break;
			
		}
	}
	

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
		if (e.getSource() == cboModelo) {
			do_cboModelo_actionPerformed(e);
		}
		if (e.getSource() == btnVender) {
			do_btnVender_actionPerformed(e);
		}
	}
	protected void do_btnVender_actionPerformed(ActionEvent e) {
		ingresarCantidad();
		impCompra();
		impDescuento();
		calObs();
		impPagar();
		imprimir();
		ventana();
	
		
	}
	protected void do_cboModelo_actionPerformed(ActionEvent e) {
		precio();
		
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose();
	}
}
