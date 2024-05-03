import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class GReporte extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextArea txtImprimir;
	private JComboBox cboModelo;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GReporte frame = new GReporte();
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
	public GReporte() {
		setTitle("Generar Reportes");
		setBounds(100, 100, 681, 369);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Reporte");
		lblNewLabel.setBounds(12, 12, 114, 17);
		getContentPane().add(lblNewLabel);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Ventas por modelo", "Comparación de precios con el precio promedio", "Comparación de cajas vendidas con la cantidad óptima", "Estadística sobre el precio"}));
		cboModelo.setBounds(128, 10, 367, 21);
		getContentPane().add(cboModelo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(549, 10, 105, 21);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 60, 647, 263);
		getContentPane().add(scrollPane);
		
		txtImprimir = new JTextArea();
		txtImprimir.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		scrollPane.setViewportView(txtImprimir);
		cboModelo.setSelectedIndex(0);

	}

	
	double promedio;
	double precioPromedio() {
			return (tienda.precio0 + tienda.precio1 + tienda.precio2 + tienda.precio3 + tienda.precio4)/5;
		}
	
	void precioMayor() {
		if (tienda.precio0 > tienda.precio1 && tienda.precio0 > tienda.precio2 && tienda.precio0 > tienda.precio3 && tienda.precio0 > tienda.precio4) {
			tienda.precioMayor = tienda.precio0;
		}
		if (tienda.precio1 > tienda.precio0 && tienda.precio1 > tienda.precio2 && tienda.precio1 > tienda.precio3 && tienda.precio1 > tienda.precio4) {
			tienda.precioMayor = tienda.precio1;
		}
		if (tienda.precio2 > tienda.precio0 && tienda.precio2 > tienda.precio1 && tienda.precio2 > tienda.precio3 && tienda.precio2 > tienda.precio4) {
			tienda.precioMayor = tienda.precio2;
		}
		if (tienda.precio3 > tienda.precio0 && tienda.precio3 > tienda.precio2 && tienda.precio3 > tienda.precio1 && tienda.precio3 > tienda.precio4) {
			tienda.precioMayor = tienda.precio3;
		}
		if (tienda.precio4 > tienda.precio0 && tienda.precio4 > tienda.precio2 && tienda.precio4 > tienda.precio3 && tienda.precio4 > tienda.precio1) {
			tienda.precioMayor = tienda.precio4;
		}
	}
		
		void precioMenor() {
			if (tienda.precio0 < tienda.precio1 && tienda.precio0 < tienda.precio2 && tienda.precio0 < tienda.precio3 && tienda.precio0 < tienda.precio4) {
				tienda.precioMenor = tienda.precio0;
			}
			if (tienda.precio1 < tienda.precio0 && tienda.precio1 < tienda.precio2 && tienda.precio1 < tienda.precio3 && tienda.precio1 < tienda.precio4) {
				tienda.precioMenor = tienda.precio1;
			}
			if (tienda.precio2 < tienda.precio0 && tienda.precio2 < tienda.precio1 && tienda.precio2 < tienda.precio3 && tienda.precio2 < tienda.precio4) {
				tienda.precioMenor = tienda.precio2;
			}
			if (tienda.precio3 < tienda.precio0 && tienda.precio3 < tienda.precio2 && tienda.precio3 < tienda.precio1 && tienda.precio3 < tienda.precio4) {
				tienda.precioMenor = tienda.precio3;
			}
			if (tienda.precio4 < tienda.precio0 && tienda.precio4 < tienda.precio2 && tienda.precio4 < tienda.precio3 && tienda.precio4 < tienda.precio1) {
				tienda.precioMenor = tienda.precio4;
			}
	}
		

		
		double comparacion0,comparacion1,comparacion2,comparacion3,comparacion4;
		String txt0,txt1,txt2,txt3,txt4;
		void comparacion() {
		if (tienda.precio0 > promedio) {
			comparacion0 = tienda.precio0 - promedio;
			txt0="más que el promedio";
		}else {
			comparacion0 = promedio  - tienda.precio0 ;
			txt0="menos que el promedio";
		}	
	
		if (tienda.precio1 > promedio) {
			comparacion1 = tienda.precio1 - promedio;
			txt1="más que el promedio";
		}else {
			comparacion1 = promedio  - tienda.precio1 ;
			txt1="menos que el promedio";
		}
		
		if (tienda.precio2 > promedio) {
			comparacion2 = tienda.precio2 - promedio;
			txt2="más que el promedio";
		}else {
			comparacion2 = promedio  - tienda.precio2 ;
			txt2="menos que el promedio";
		}	
		
		if (tienda.precio3 > promedio) {
			comparacion3 = tienda.precio3 - promedio;
			txt3="más que el promedio";
		}else {
			comparacion3 = promedio  - tienda.precio3 ;
			txt3="menos que el promedio";
		}	
		if (tienda.precio4 > promedio) {
			comparacion4 = tienda.precio4 - promedio;
			txt4="más que el promedio";
		}else {
			comparacion4 = promedio  - tienda.precio4 ;
			txt4="menos que el promedio";
		}	
		}
		int compaCajas0,compaCajas1,compaCajas2,compaCajas3,compaCajas4;
		String txtCajas0,txtCajas1,txtCajas2,txtCajas3,txtCajas4;
		void comparacionCajas0() {
			if (tienda.cajasVendidas0 > tienda.cantidadOptima) {
				compaCajas0 = tienda.cajasVendidas0 - tienda.cantidadOptima;
				txtCajas0 = "más que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas0+" "+txtCajas0+"\n\n");
			}else if (tienda.cajasVendidas0 < tienda.cantidadOptima) {
				compaCajas0 = tienda.cantidadOptima - tienda.cajasVendidas0;
				txtCajas0 = "menos que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas0+" "+txtCajas0+"\n\n");
			}else {
				txtCajas0 ="igual que la cantidad óptima";
				txtImprimir.append("Comparación                : "+txtCajas0+"\n\n");
			}}
		void comparacionCajas1() {
			
			if (tienda.cajasVendidas1 > tienda.cantidadOptima) {
				compaCajas1 = tienda.cajasVendidas1 - tienda.cantidadOptima;
				txtCajas1 = "más que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas1+" "+txtCajas1+"\n\n");
			}else if (tienda.cajasVendidas1 < tienda.cantidadOptima) {
				compaCajas1 = tienda.cantidadOptima - tienda.cajasVendidas1;
				txtCajas1 = "menos que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas1+" "+txtCajas1+"\n\n");
			}else {
				txtCajas1 ="igual que la cantidad óptima";
				txtImprimir.append("Comparación                : "+txtCajas1+"\n\n");
			}}
		void comparacionCajas2() {
			
			if (tienda.cajasVendidas2 > tienda.cantidadOptima) {
				compaCajas2 = tienda.cajasVendidas2 - tienda.cantidadOptima;
				txtCajas2 = "más que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas2+" "+txtCajas2+"\n\n");
			}else if (tienda.cajasVendidas2 < tienda.cantidadOptima) {
				compaCajas2 = tienda.cantidadOptima - tienda.cajasVendidas2;
				txtCajas2 = "menos que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas2+" "+txtCajas2+"\n\n");
			}else {
				txtCajas2 ="igual que la cantidad óptima";
				txtImprimir.append("Comparación                : "+txtCajas2+"\n\n");
			}}
			void comparacionCajas3() {
			if (tienda.cajasVendidas3 > tienda.cantidadOptima) {
				compaCajas3 = tienda.cajasVendidas3 - tienda.cantidadOptima;
				txtCajas3 = "más que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas3+" "+txtCajas3+"\n\n");
			}else if (tienda.cajasVendidas3 < tienda.cantidadOptima) {
				compaCajas3 = tienda.cantidadOptima - tienda.cajasVendidas3;
				txtCajas3 = "menos que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas3+" "+txtCajas3+"\n\n");
			}else {
				txtCajas3 ="igual que la cantidad óptima";
				txtImprimir.append("Comparación                : "+txtCajas3+"\n\n");
			}}
			void comparacionCajas4() {
			if (tienda.cajasVendidas4 > tienda.cantidadOptima) {
				compaCajas4 = tienda.cajasVendidas4 - tienda.cantidadOptima;
				txtCajas4 = "más que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas4+" "+txtCajas4+"\n\n");
			}else if (tienda.cajasVendidas4 < tienda.cantidadOptima) {
				compaCajas4 = tienda.cantidadOptima - tienda.cajasVendidas4;
				txtCajas4 = "menos que la cantidad óptima";
				txtImprimir.append("Comparación                : "+compaCajas4+" "+txtCajas4+"\n\n");
			}else {
				txtCajas4 ="igual que la cantidad óptima";
				txtImprimir.append("Comparación                : "+txtCajas4+"\n\n");
			}
					}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
		if (e.getSource() == cboModelo) {
			do_comboBox_actionPerformed(e);
		}
	}
	protected void do_comboBox_actionPerformed(ActionEvent e) {
		precioMayor();
		precioMenor();
		comparacion();
		promedio = precioPromedio();
		txtImprimir.setText(null);
		switch (cboModelo.getSelectedIndex()) {
			case 0:
				
			txtImprimir.append("VENTAS POR MODELO"+"\n\n");
			txtImprimir.append("Modelo                      : "+tienda.modelo0 +"\n");
			txtImprimir.append("Cantidad de Ventas          : "+tienda.ventasProducto0 +"\n");
			txtImprimir.append("Cantidad de cajas vendidas  : "+tienda.cajasVendidas0 +"\n");
			txtImprimir.append("Importe total vendido       : "+String.format("%.2f", tienda.imptoven0)+"\n");
			txtImprimir.append("Aporte a la cuota diaria    : "+String.format("%.2f", (tienda.imptoven0*100)/tienda.cuotaDiaria) + "%" +"\n\n");
		
			txtImprimir.append("Modelo                      : "+tienda.modelo1 +"\n");
			txtImprimir.append("Cantidad de Ventas          : "+tienda.ventasProducto1 +"\n");
			txtImprimir.append("Cantidad de cajas vendidas  : "+tienda.cajasVendidas1 +"\n");
			txtImprimir.append("Importe total vendido       : "+String.format("%.2f",tienda.imptoven1)+"\n" );
			txtImprimir.append("Aporte a la cuota diaria    : "+String.format("%.2f", (tienda.imptoven1*100)/tienda.cuotaDiaria) + "%"+"\n\n");
			
			txtImprimir.append("Modelo                      : "+tienda.modelo2 +"\n");
			txtImprimir.append("Cantidad de Ventas          : "+tienda.ventasProducto2 +"\n");
			txtImprimir.append("Cantidad de cajas vendidas  : "+tienda.cajasVendidas2 +"\n");
			txtImprimir.append("Importe total vendido       : "+String.format("%.2f",tienda.imptoven2)+"\n" );
			txtImprimir.append("Aporte a la cuota diaria    : "+String.format("%.2f", (tienda.imptoven2*100)/tienda.cuotaDiaria) + "%"+"\n\n");
			
			txtImprimir.append("Modelo                      : "+tienda.modelo3 +"\n");
			txtImprimir.append("Cantidad de Ventas          : "+tienda.ventasProducto3 +"\n");
			txtImprimir.append("Cantidad de cajas vendidas  : "+tienda.cajasVendidas3 +"\n");
			txtImprimir.append("Importe total vendido       : "+String.format("%.2f",tienda.imptoven3 )+"\n" );
			txtImprimir.append("Aporte a la cuota diaria    : "+String.format("%.2f", (tienda.imptoven3*100)/tienda.cuotaDiaria) + "%" +"\n\n");
			
			txtImprimir.append("Modelo                      : "+tienda.modelo4 +"\n");
			txtImprimir.append("Cantidad de Ventas          : "+tienda.ventasProducto4 +"\n");
			txtImprimir.append("Cantidad de cajas vendidas  : "+tienda.cajasVendidas4 +"\n");
			txtImprimir.append("Importe total vendido       : "+String.format("%.2f",tienda.imptoven4)+"\n" );
			txtImprimir.append("Aporte a la cuota diaria    : "+String.format("%.2f", (tienda.imptoven0*100)/tienda.cuotaDiaria) + "%" +"\n\n");
			
		    
			
			break;
		case 1:
			
			txtImprimir.append("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO"+"\n\n");
			txtImprimir.append("Modelo          : "+tienda.modelo0+"\n");
			txtImprimir.append("Precio          : "+String.format("%.2f",tienda.precio0)+"\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio)+"\n");
			txtImprimir.append("Comparación     : "+String.format("%.2f",comparacion0)+" "+txt0+"\n\n");
			
			
			txtImprimir.append("Modelo          : "+tienda.modelo1+"\n");
			txtImprimir.append("Modelo          : "+tienda.modelo1+"\n");
			txtImprimir.append("Precio          : "+String.format("%.2f",tienda.precio1)+"\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio)+"\n");
			txtImprimir.append("Comparación     : "+String.format("%.2f",comparacion1)+" "+txt1+"\n\n");
			
			txtImprimir.append("Modelo          : "+tienda.modelo2+"\n");
			txtImprimir.append("Modelo          : "+tienda.modelo2+"\n");
			txtImprimir.append("Precio          : "+String.format("%.2f",tienda.precio2)+"\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio)+"\n");
			txtImprimir.append("Comparación     : "+String.format("%.2f",comparacion2)+" "+txt0+"\n\n");

			
			txtImprimir.append("Modelo          : "+tienda.modelo3+"\n");
			txtImprimir.append("Modelo          : "+tienda.modelo3+"\n");
			txtImprimir.append("Precio          : "+String.format("%.2f",tienda.precio3)+"\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio)+"\n");
			txtImprimir.append("Comparación     : "+String.format("%.2f",comparacion3)+" "+txt0+"\n\n");
		
			txtImprimir.append("Modelo          : "+tienda.modelo4+"\n");
			txtImprimir.append("Modelo          : "+tienda.modelo4+"\n");
			txtImprimir.append("Precio          : "+String.format("%.2f",tienda.precio4)+"\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio)+"\n");
			txtImprimir.append("Comparación     : "+String.format("%.2f",comparacion4)+" "+txt0+"\n\n");

			break;
			
		case 2:
			
			txtImprimir.append("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA"+"\n\n");
			txtImprimir.append("Modelo                     : "+tienda.modelo0+"\n");
			txtImprimir.append("Cantidad de cajas vendidas : "+tienda.cajasVendidas0+"\n");
			txtImprimir.append("Cantidad óptima            : "+tienda.cantidadOptima+"\n");
			comparacionCajas0();
			txtImprimir.append("\n");
			
			txtImprimir.append("Modelo                     : "+tienda.modelo1+"\n");
			txtImprimir.append("Cantidad de cajas vendidas : "+tienda.cajasVendidas1+"\n");
			txtImprimir.append("Cantidad óptima            : "+tienda.cantidadOptima+"\n");
			comparacionCajas1();
			txtImprimir.append("\n");
			
			txtImprimir.append("Modelo                     : "+tienda.modelo2+"\n");
			txtImprimir.append("Cantidad de cajas vendidas : "+tienda.cajasVendidas2+"\n");
			txtImprimir.append("Cantidad óptima            : "+tienda.cantidadOptima+"\n");
			comparacionCajas2();
			txtImprimir.append("\n");
			
			txtImprimir.append("Modelo                     : "+tienda.modelo3+"\n");
			txtImprimir.append("Cantidad de cajas vendidas : "+tienda.cajasVendidas3+"\n");
			txtImprimir.append("Cantidad óptima            : "+tienda.cantidadOptima+"\n");
			comparacionCajas3();
			txtImprimir.append("\n");
			
			txtImprimir.append("Modelo                     : "+tienda.modelo4+"\n");
			txtImprimir.append("Cantidad de cajas vendidas : "+tienda.cajasVendidas4+"\n");
			txtImprimir.append("Cantidad óptima            : "+tienda.cantidadOptima+"\n");
			comparacionCajas4();
			txtImprimir.append("\n");
			
			break;
		default:
			
			txtImprimir.append("ESTADÍSTICA SOBRE EL PRECIO"+"\n\n");
			txtImprimir.append("Precio promedio : "+String.format("%.2f",promedio) +"\n");
			txtImprimir.append("Precio mayor    : "+String.format("%.2f",tienda.precioMayor) +"\n");
			txtImprimir.append("Precio menor    : "+String.format("%.2f",tienda.precioMenor) +"\n");
					
			break;
		
	}
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	
}
