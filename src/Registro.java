import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Cursor;

public class Registro extends JFrame {

	JButton btnSalir;
	JButton btnEntrar;
	JButton btnEntrar2;
	JButton btnRegistrarse;
	JCheckBox chckbxTerminosUso;
	JPasswordField txtContrasena;
	JTextField txtUsuario;
	JTextField txtEmail;
	JButton btnDirecto;
	JMenuItem itemAyuda;
	Ventana2 v = new Ventana2();
	public Registro() {
		
		
		setUndecorated(true); //-->> para el fondo transparente
		setBackground(new Color(1.0f,1.0f,1.0f,0.0f)); //-->> transparencia
		
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(new Dimension(1383, 799));
		
		JLabel lblAyuda = new JLabel("Help");
		lblAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAyuda.setForeground(Color.WHITE);
		lblAyuda.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblAyuda.setBounds(795, 502, 78, 30);
		getContentPane().add(lblAyuda);
		
		itemAyuda = new JMenuItem("");
		itemAyuda.setRequestFocusEnabled(false);
		itemAyuda.setHorizontalTextPosition(SwingConstants.CENTER);
		itemAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		itemAyuda.setSelected(true);
		itemAyuda.setFocusable(true);
		itemAyuda.setFocusTraversalPolicyProvider(true);
		itemAyuda.setFocusPainted(true);
		itemAyuda.setFocusCycleRoot(true);
		itemAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		itemAyuda.setBorder(null);
		itemAyuda.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		//itemAyuda.setIcon(new ImageIcon("btnsignUp.png"));
		itemAyuda.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
		
		itemAyuda.setBounds(780, 486, 146, 61);
		getContentPane().add(itemAyuda);
		
		
		//------------------->> Cajas de texto 
		

		txtUsuario = new JTextField();
		txtUsuario.setBorder(null);
		txtUsuario.setBackground(new Color(191, 184, 161));
		txtUsuario.setBounds(552, 177, 338, 30);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(new Color(191, 184, 161));
		txtEmail.setBounds(552, 342, 338, 30);
		getContentPane().add(txtEmail);
	
		chckbxTerminosUso = new JCheckBox("Estoy de acuerdo con los t\u00E9rminos de uso");
		chckbxTerminosUso.setBorder(null);
		chckbxTerminosUso.setForeground(new Color(255, 255, 255));
		chckbxTerminosUso.setFont(new Font("Sitka Display", Font.BOLD, 13));
		chckbxTerminosUso.setBackground(new Color(191, 184, 161));
		chckbxTerminosUso.setBounds(552, 414, 290, 23);
		getContentPane().add(chckbxTerminosUso);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBorder(null);
		txtContrasena.setBounds(552, 259, 338, 30);
		txtContrasena.setBackground(new Color(191, 184, 161));
		getContentPane().add(txtContrasena);
		
		
		///-------------------------------------->>>Texto
		
		JLabel lblEntrar2 = new JLabel("Entrar");
		lblEntrar2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar2.setForeground(new Color(112, 112, 112));
		lblEntrar2.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblEntrar2.setBounds(551, 502, 78, 30);
		getContentPane().add(lblEntrar2);
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblEmail.setBounds(531, 318, 78, 30);
		getContentPane().add(lblEmail);
		
		JLabel lblRectangulo2 = new JLabel("");
		//lblRectangulo2.setIcon(new ImageIcon("rectangulo7.png"));
		lblRectangulo2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rectangulo7.png"))));
		
		lblRectangulo2.setBounds(552, 283, 338, 14);
		getContentPane().add(lblRectangulo2);
		
		JLabel lblRectangulo3 = new JLabel("");
		//lblRectangulo3.setIcon(new ImageIcon("rectangulo7.png"));
		lblRectangulo3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rectangulo7.png"))));
		
		lblRectangulo3.setBounds(552, 365, 338, 14);
		getContentPane().add(lblRectangulo3);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblContrasena.setBounds(531, 226, 109, 30);
		getContentPane().add(lblContrasena);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblUsuario.setBounds(542, 146, 78, 30);
		getContentPane().add(lblUsuario);
		
		JLabel lblRectangulo = new JLabel("");
		//lblRectangulo.setIcon(new ImageIcon("rectangulo7.png"));
		lblRectangulo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rectangulo7.png"))));
		lblRectangulo.setBounds(552, 201, 338, 14);
		getContentPane().add(lblRectangulo);
		
		JLabel lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarse.setForeground(new Color(255, 255, 255));
		lblRegistrarse.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblRegistrarse.setBounds(785, 76, 117, 30);
		getContentPane().add(lblRegistrarse);
		
		JLabel lblEntrar = new JLabel("Login");
		lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrar.setForeground(new Color(102, 102, 102));
		lblEntrar.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblEntrar.setBounds(712, 76, 78, 30);
		getContentPane().add(lblEntrar);
		
		
		///---------------------------------------->>Botones
		
		btnSalir = new JButton("Salir");
		btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setSelected(true);
		btnSalir.setOpaque(false);
		btnSalir.setBorder(null);
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setFocusCycleRoot(true);
		btnSalir.setFocusTraversalPolicyProvider(true);
		btnSalir.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		btnSalir.setForeground(new Color(1.0f,1.0f,1.0f,0.0f));
		//btnSalir.setIcon(new ImageIcon("btnLoginSwitch.png"));
		btnSalir.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
		
		
		btnEntrar2 = new JButton("Entrar2");
		btnEntrar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
		btnEntrar2.setSelected(true);
		btnEntrar2.setOpaque(false);
		btnEntrar2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEntrar2.setForeground(new Color(255, 255, 255, 0));
		btnEntrar2.setFocusTraversalPolicyProvider(true);
		btnEntrar2.setFocusCycleRoot(true);
		btnEntrar2.setContentAreaFilled(false);
		btnEntrar2.setBorderPainted(false);
		btnEntrar2.setBorder(null);
		btnEntrar2.setBackground(new Color(255, 255, 255, 0));
		btnEntrar2.setBounds(531, 487, 119, 60);
		getContentPane().add(btnEntrar2);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//btnRegistrarse.setIcon(new ImageIcon("btnsignUp.png"));
		btnRegistrarse.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
		
		btnRegistrarse.setSelected(true);
		btnRegistrarse.setOpaque(false);
		btnRegistrarse.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarse.setForeground(new Color(255, 255, 255, 0));
		btnRegistrarse.setFocusTraversalPolicyProvider(true);
		btnRegistrarse.setFocusCycleRoot(true);
		btnRegistrarse.setContentAreaFilled(false);
		btnRegistrarse.setBorderPainted(false);
		btnRegistrarse.setBorder(null);
		btnRegistrarse.setBackground(new Color(255, 255, 255, 0));
		btnRegistrarse.setBounds(785, 62, 119, 60);
		getContentPane().add(btnRegistrarse);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		//btnEntrar.setIcon(new ImageIcon("btnLoginSwitch.png"));
		btnEntrar.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
		
		btnEntrar.setSelected(true);
		btnEntrar.setOpaque(false);
		btnEntrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEntrar.setForeground(new Color(255, 255, 255, 0));
		btnEntrar.setFocusTraversalPolicyProvider(true);
		btnEntrar.setFocusCycleRoot(true);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(new Color(255, 255, 255, 0));
		btnEntrar.setBounds(706, 62, 119, 60);
		getContentPane().add(btnEntrar);
		
		JLabel lblSalir = new JLabel("Salir");
		lblSalir.setForeground(new Color(102, 102, 102));
		lblSalir.setFont(new Font("Sitka Display", Font.BOLD, 15));
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setBounds(676, 502, 78, 30);
		getContentPane().add(lblSalir);
		
		btnSalir.setBounds(659, 487, 119, 60);
		getContentPane().add(btnSalir);
		
		btnDirecto = new JButton("Directo");
		btnDirecto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDirecto.setSelected(true);
		btnDirecto.setOpaque(true);
		btnDirecto.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDirecto.setForeground(new Color(255, 255, 255, 0));
		btnDirecto.setFocusTraversalPolicyProvider(true);
		btnDirecto.setFocusCycleRoot(true);
		btnDirecto.setContentAreaFilled(false);
		btnDirecto.setBorderPainted(false);
		btnDirecto.setBorder(null);
		btnDirecto.setBackground(new Color(255, 255, 255, 0));
		btnDirecto.setBounds(142, 164, 294, 338);
		getContentPane().add(btnDirecto);
		
		btnDirecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				v.setVisible(true);
			}
		});
		
		
		///---------------------------------------->>Paneles Fondo
		
		JLabel panel2 = new JLabel("");
		panel2.setHorizontalTextPosition(SwingConstants.CENTER);
		panel2.setHorizontalAlignment(SwingConstants.CENTER);
		panel2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rightPanel.png"))));
		//panel2.setIcon(new ImageIcon("rightPanel.png"));
		//panel2.setIcon(new ImageIcon("jar:file:HousePlantsJar.jar!/rightPanel.png"));
		
		panel2.setBounds(458, 41, 468, 576);
		getContentPane().add(panel2);
		
		JLabel panel1 = new JLabel("");
		panel1.setHorizontalTextPosition(SwingConstants.CENTER);
		panel1.setHorizontalAlignment(SwingConstants.CENTER);
		//panel1.setIcon(new ImageIcon("Componente1.png"));
		panel1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Componente1.png"))));
		
		panel1.setBounds(64, 49, 468, 649);
		getContentPane().add(panel1);
		
		//ponLaAyuda();
		
	}
	

////---------------------------------------->PREGUNTAR ANTES DE CERRAR;
	public void cerrarVentana() {
		//creamos los botones
		String botones [] = {"Si","No"};
		//El dialogo que queremos poner al mensaje
		
		int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicación?", "Cerrar", 0, 0, null, botones, this);
		
		//Si elije que SI, cerramos la aplicaicon
		if(eleccion == JOptionPane.YES_OPTION) {
			
			System.exit(0);
			
		//Sino, nos mantenemos en ella.
		}else if(eleccion == JOptionPane.NO_OPTION) {
			
			System.out.println("Gracias por continuar usando la aplicación!");
			
		}
		
	}
	
	//---------------------------------------------------->CONEXIÓN CONTROLADOR Y VISTA
	
		public void setControlador(Controlador c) {
			
			btnRegistrarse.addActionListener(c);
			btnSalir.addActionListener(c);
			btnEntrar.addActionListener(c);
			btnEntrar2.addActionListener(c);
			itemAyuda.addActionListener(c);
		
		}
		
	/*	private void ponLaAyuda() {
			try {
				// Carga el fichero de ayuda
				File fichero = new File("help/help_set.hs");
				URL hsURL = fichero.toURI().toURL();

				// Crea el HelpSet y el HelpBroker
				HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
				HelpBroker hb = helpset.createHelpBroker();

				// Pone ayuda a item de menu al pulsarlo y a F1 en ventana
				// principal y secundaria.
				hb.enableHelpOnButton(itemAyuda, "aplicacion", helpset);
				hb.enableHelpKey(getContentPane(), "ventana_principal",helpset);
				hb.enableHelpKey(getContentPane(), "ventana_secundaria",helpset);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
}
