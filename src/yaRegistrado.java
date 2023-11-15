import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class yaRegistrado extends JFrame {
	
	JButton btnSalir;
	JButton btnEntrar;
	JButton btnEntrar2;
	JButton btnRegistrarse;
	JPasswordField txtContrasena;
	JTextField txtUsuario;
	JButton btnDirecto;
	Ventana2 v = new Ventana2();

	public yaRegistrado() {
		
	setUndecorated(true); //-->> para el fondo transparente
	setBackground(new Color(1.0f,1.0f,1.0f,0.0f)); //-->> transparencia
	
	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	getContentPane().setLayout(null);
	setSize(new Dimension(1383, 799));
	

	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	getContentPane().setLayout(null);
	setSize(new Dimension(1383, 799));
	
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
	

	
	txtUsuario = new JTextField();
	txtUsuario.setBorder(null);
	txtUsuario.setBackground(new Color(191, 184, 161));
	txtUsuario.setBounds(565, 232, 338, 30);
	getContentPane().add(txtUsuario);
	txtUsuario.setColumns(10);
	
	JLabel lblEntrar2 = new JLabel("Entrar");
	lblEntrar2.setHorizontalAlignment(SwingConstants.CENTER);
	lblEntrar2.setForeground(new Color(255, 255, 255));
	lblEntrar2.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblEntrar2.setBounds(672, 396, 78, 30);
	getContentPane().add(lblEntrar2);
	
	btnEntrar2 = new JButton("Salir");
	btnEntrar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnEntrar2.setIcon(new ImageIcon("btnsignUp.png"));
	btnEntrar2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
	
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
	btnEntrar2.setBounds(652, 381, 119, 60);
	getContentPane().add(btnEntrar2);
	
	txtContrasena = new JPasswordField();
	txtContrasena.setBorder(null);
	txtContrasena.setBounds(565, 314, 338, 30);
	txtContrasena.setBackground(new Color(191, 184, 161));
	getContentPane().add(txtContrasena);
	
	JLabel lblRectangulo2 = new JLabel("");
	//lblRectangulo2.setIcon(new ImageIcon("rectangulo7.png"));
	lblRectangulo2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rectangulo7.png"))));
	
	lblRectangulo2.setBounds(565, 338, 338, 14);
	getContentPane().add(lblRectangulo2);
	
	JLabel lblContrasena = new JLabel("Contrase\u00F1a");
	lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
	lblContrasena.setForeground(Color.WHITE);
	lblContrasena.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblContrasena.setBounds(565, 286, 98, 30);
	getContentPane().add(lblContrasena);
	
	JLabel lblUsuario = new JLabel("Usuario");
	lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
	lblUsuario.setForeground(new Color(255, 255, 255));
	lblUsuario.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblUsuario.setBounds(555, 201, 78, 30);
	getContentPane().add(lblUsuario);
	
	JLabel lblRectangulo = new JLabel("");
	//lblRectangulo.setIcon(new ImageIcon("rectangulo7.png"));
	lblRectangulo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rectangulo7.png"))));
	
	
	lblRectangulo.setBounds(565, 256, 338, 14);
	getContentPane().add(lblRectangulo);
	
	JLabel lblRegistrarse = new JLabel("Registrarse");
	lblRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
	lblRegistrarse.setForeground(Color.GRAY);
	lblRegistrarse.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblRegistrarse.setBounds(670, 102, 117, 30);
	getContentPane().add(lblRegistrarse);
	
	btnRegistrarse = new JButton("Salir");
	btnRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnRegistrarse.setIcon(new ImageIcon("btnLoginSwitch.png"));
	btnRegistrarse.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
	
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
	btnRegistrarse.setBounds(670, 88, 119, 60);
	getContentPane().add(btnRegistrarse);
	
	JLabel lblEntrar = new JLabel("Login");
	lblEntrar.setHorizontalAlignment(SwingConstants.CENTER);
	lblEntrar.setForeground(Color.WHITE);
	lblEntrar.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblEntrar.setBounds(597, 102, 78, 30);
	getContentPane().add(lblEntrar);
	
	btnEntrar = new JButton("Salir");
	btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnEntrar.setIcon(new ImageIcon("btnsignUp.png"));
	btnEntrar.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
	
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
	btnEntrar.setBounds(591, 88, 119, 60);
	getContentPane().add(btnEntrar);
	

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
	
	JLabel lblSalir = new JLabel("Salir");
	lblSalir.setForeground(new Color(102, 102, 102));
	lblSalir.setFont(new Font("Sitka Display", Font.BOLD, 15));
	lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
	lblSalir.setBounds(669, 474, 78, 30);
	getContentPane().add(lblSalir);
	
	btnSalir.setBounds(652, 459, 119, 60);
	getContentPane().add(btnSalir);
	
	
	JLabel panel2 = new JLabel("");
	panel2.setHorizontalTextPosition(SwingConstants.CENTER);
	panel2.setHorizontalAlignment(SwingConstants.CENTER);
	//panel2.setIcon(new ImageIcon("rightPanel.png"));
	panel2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rightPanel.png"))));
	
	panel2.setBounds(458, 31, 468, 576);
	getContentPane().add(panel2);
	
	JLabel panel1 = new JLabel("");
	panel1.setHorizontalTextPosition(SwingConstants.CENTER);
	panel1.setHorizontalAlignment(SwingConstants.CENTER);
	//panel1.setIcon(new ImageIcon("componente1.png"));
	panel1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Componente1.png"))));
	
	
	panel1.setBounds(64, 41, 468, 649);
	getContentPane().add(panel1);
	
}////---------------------------------------->PREGUNTAR ANTES DE CERRAR;
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
	
	}

}
