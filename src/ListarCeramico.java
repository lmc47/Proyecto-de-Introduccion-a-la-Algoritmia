import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ListarCeramico extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnListar;
	private JTextArea txtImprimir;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarCeramico frame = new ListarCeramico();
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
	public ListarCeramico() {
		setTitle("Listar Ceramico");
		setClosable(true);
		setMaximizable(true);
		setBounds(100, 100, 613, 426);
		getContentPane().setLayout(null);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(161, 353, 105, 27);
		getContentPane().add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(320, 353, 105, 27);
		getContentPane().add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 12, 579, 328);
		getContentPane().add(scrollPane);
		
		txtImprimir = new JTextArea();
		txtImprimir.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		scrollPane.setViewportView(txtImprimir);

	}
	void listarCeramico() {
		txtImprimir.append(null);
		txtImprimir.append("Listado de Ceramico");
		txtImprimir.append("\n");
		txtImprimir.append("\n");
		
		txtImprimir.append("Modelo        : " +tienda.modelo0+"\n");
		txtImprimir.append("Precio        : S/. " +tienda.precio0 +"\n");
		txtImprimir.append("Ancho (cm)    : " +tienda.ancho0 +" cm" + "\n");
		txtImprimir.append("Largo (cm)    : " +tienda.largo0 +" cm" + "\n");
		txtImprimir.append("Espesor (mm)  : " +tienda.espesor0 +" mm"+"\n");
		txtImprimir.append("Contenido     : " +tienda.contenido0 +" unidades"+"\n");
		            
		txtImprimir.append("\n");
		txtImprimir.append("Modelo        : " +tienda.modelo1+"\n");
		txtImprimir.append("Precio        : S/. " +tienda.precio1 +"\n");
		txtImprimir.append("Ancho (cm)    : " +tienda.ancho1 +" cm" + "\n");
		txtImprimir.append("Largo (cm)    : " +tienda.largo1 +" cm" + "\n");
		txtImprimir.append("Espesor (mm)  : " +tienda.espesor1 +" mm"+"\n");
		txtImprimir.append("Contenido     : " +tienda.contenido1 +" unidades"+"\n");
		            
		txtImprimir.append("\n");
		txtImprimir.append("Modelo        : " +tienda.modelo2+"\n");
		txtImprimir.append("Precio        : S/. " +tienda.precio2 +"\n");
		txtImprimir.append("Ancho (cm)    : " +tienda.ancho2 +" cm" + "\n");
		txtImprimir.append("Largo (cm)    : " +tienda.largo2 +" cm" + "\n");
		txtImprimir.append("Espesor (mm)  : " +tienda.espesor2 +" mm"+"\n");
		txtImprimir.append("Contenido     : " +tienda.contenido2 +" unidades"+"\n");
		
		txtImprimir.append("\n");
		txtImprimir.append("Modelo        : " +tienda.modelo3+"\n");
		txtImprimir.append("Precio        : S/. " +tienda.precio3 +"\n");
		txtImprimir.append("Ancho (cm)    : " +tienda.ancho3 +" cm" + "\n");
		txtImprimir.append("Largo (cm)    : " +tienda.largo3 +" cm" + "\n");
		txtImprimir.append("Espesor (mm)  : " +tienda.espesor3 +" mm"+"\n");
		txtImprimir.append("Contenido     : " +tienda.contenido3 +" unidades"+"\n");
		            
		txtImprimir.append("\n");
		txtImprimir.append("Modelo        : " +tienda.modelo4+"\n");
		txtImprimir.append("Precio        : S/. " +tienda.precio4 +"\n");
		txtImprimir.append("Ancho (cm)    : " +tienda.ancho4 +" cm" + "\n");
		txtImprimir.append("Largo (cm)    : " +tienda.largo4 +" cm" + "\n");
		txtImprimir.append("Espesor (mm)  : " +tienda.espesor4 +" mm"+"\n");
		txtImprimir.append("Contenido     : " +tienda.contenido4 +" unidades"+"\n");	
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			do_btnCerrar_actionPerformed(e);
		}
		if (e.getSource() == btnListar) {
			do_btnListar_actionPerformed(e);
		}
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
		listarCeramico();
	}
	protected void do_btnCerrar_actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose(); 
	}
}
