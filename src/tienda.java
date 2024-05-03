import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;

public class tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Datos mínimos del primer producto
	public static String modelo0 = "Cinza Plus";
	public static double precio0 = 92.56;
	public static double ancho0 = 62.0;
	public static double largo0 = 62.0;
	public static double espesor0 = 8;
	public static int contenido0 = 6;
	// Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
	// Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	// Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	// Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	private JMenuItem mntmConsultarCeramico;
	private JDesktopPane escritorio;
	private JMenuItem mntmModificarCeramico;
	private JMenuItem mntmListarCeramico;
	private JMenuItem mntmVender;
	
	//Acomuladores
	public static int acomuladorVentas = 0;
	public static double impGAcomulado;
	private JMenuItem mntmGenerarReportes;
	//Acomuladores por productos individuales
	public static int ventasProducto0;
	public static int ventasProducto1;
	public static int ventasProducto2;
	public static int ventasProducto3;
	public static int ventasProducto4;
	public static double imptoven0;
	public static double imptoven1;
	public static double imptoven2;
	public static double imptoven3;
	public static double imptoven4;
	public static int cajasVendidas0=0;
	public static int cajasVendidas1;
	public static int cajasVendidas2;
	public static int cajasVendidas3;
	public static int cajasVendidas4;
	public static double precioMayor;
	public static double precioMenor;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarCantidadptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	private JMenuItem mntmAcercaDeTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tienda frame = new tienda();
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
	public tienda() {
		setFont(null);
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 420);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCeramico = new JMenuItem("Consultar Cerámico");
		mntmConsultarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmConsultarCeramico);
		
		mntmModificarCeramico = new JMenuItem("Modificar Cerámico");
		mntmModificarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmModificarCeramico);
		
		mntmListarCeramico = new JMenuItem("Listar Cerámico");
		mntmListarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmListarCeramico);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		JMenu mnConfiguracion = new JMenu("Configuración");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidadptima = new JMenuItem("Configurar cantidad óptima");
		mntmConfigurarCantidadptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCuotaDiaria);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		escritorio = new JDesktopPane();
		contentPane.add(escritorio, BorderLayout.CENTER);

			
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcercaDeTienda) {
			do_mntmAcercaDeTienda_actionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarCuotaDiaria) {
			do_mntmConfigurarCuotaDiaria_actionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarCantidadptima) {
			do_mntmConfigurarCantidadptima_actionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			do_mntmConfigurarObsequios_actionPerformed(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			do_mntmConfigurarDescuentos_actionPerformed(e);
		}
		if (e.getSource() == mntmGenerarReportes) {
			do_mntmGenerarReportes_actionPerformed(e);
		}
		if (e.getSource() == mntmVender) {
			do_mntmVender_actionPerformed(e);
		}
		if (e.getSource() == mntmListarCeramico) {
			do_mntmListarCeramico_actionPerformed(e);
		}
		if (e.getSource() == mntmModificarCeramico) {
			do_mntmModificarCeramico_actionPerformed(e);
		}
		if (e.getSource() == mntmConsultarCeramico) {
			do_mntmConsultarCeramico_actionPerformed(e);
		}
	}
	protected void do_mntmConsultarCeramico_actionPerformed(ActionEvent e) {
		ConsultarCeramico f=new ConsultarCeramico();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmModificarCeramico_actionPerformed(ActionEvent e) {
		ModificarCeramico f=new ModificarCeramico();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmListarCeramico_actionPerformed(ActionEvent e) {
		ListarCeramico f=new ListarCeramico();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmVender_actionPerformed(ActionEvent e) {
		Vender f=new Vender();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmGenerarReportes_actionPerformed(ActionEvent e) {
		GReporte f=new GReporte();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmConfigurarDescuentos_actionPerformed(ActionEvent e) {
		ConfigurarDescuentos f=new ConfigurarDescuentos();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmConfigurarObsequios_actionPerformed(ActionEvent e) {
		ConfigurarObsequios f=new ConfigurarObsequios();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmConfigurarCantidadptima_actionPerformed(ActionEvent e) {
		CantidadOptima f=new CantidadOptima();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmConfigurarCuotaDiaria_actionPerformed(ActionEvent e) {
		CuotaDiaria f=new CuotaDiaria();
		this.escritorio.add(f);
		f.setVisible(true);
	}
	protected void do_mntmAcercaDeTienda_actionPerformed(ActionEvent e) {
		Acercade f=new Acercade();
		this.escritorio.add(f);
		f.setVisible(true);
		
	}
	}
	

