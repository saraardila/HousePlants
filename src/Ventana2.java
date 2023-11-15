import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JMenuItem;

public class Ventana2 extends JFrame{
	
	JButton btnOrquideas;
	JButton btnCactus;
	JButton btnHoja;
	JButton btnSalir_1;
	JButton btnPlantas;
	JButton btnValoranos;
	JButton btnInfo;
	JButton btnFacebook;
	JButton btnYoutube;
	JButton btnInstagram;
	JMenuItem itemAyuda;
	Valoracion vl = new Valoracion();
	
	public Ventana2() {
		
		
	setUndecorated(true); //-->> para el fondo transparente
	setBackground(new Color(1.0f,1.0f,1.0f,0.0f)); //-->> transparencia
	
	
	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	getContentPane().setLayout(null);
	setSize(new Dimension(1383, 799));
	

	btnSalir_1 = new JButton("Salir");
	btnSalir_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
	btnSalir_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnInstagram = new JButton("");
	btnInstagram.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop().browse(new URL("https://www.instagram.com/fronda_magatzem/").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnInstagram.setBorder(null);
	btnInstagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnInstagram.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
	btnInstagram.setBorderPainted(false);
	//btnInstagram.setIcon(new ImageIcon("instagram_1.png"));
	btnInstagram.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/instagram_1.png"))));

	btnInstagram.setBounds(173, 94, 54, 51);
	getContentPane().add(btnInstagram);
	
	btnYoutube = new JButton("");
	btnYoutube.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop()
				.browse(new URL("https://www.youtube.com/channel/UCcNHeDxisUC5ZrIjHL6L-YQ/featured").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	
	itemAyuda = new JMenuItem("");
	//itemAyuda.setIcon(new ImageIcon("ayuda.png"));
	itemAyuda.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ayuda.png"))));
	
	itemAyuda.setSelected(true);
	itemAyuda.setRolloverEnabled(true);
	itemAyuda.setHorizontalTextPosition(SwingConstants.CENTER);
	itemAyuda.setHorizontalAlignment(SwingConstants.CENTER);
	itemAyuda.setFocusable(true);
	itemAyuda.setFocusTraversalPolicyProvider(true);
	itemAyuda.setFocusPainted(true);
	itemAyuda.setFocusCycleRoot(true);
	itemAyuda.setBorder(null);
	itemAyuda.setBackground(new Color(255, 255, 255, 0));
	itemAyuda.setBounds(173, 287, 82, 61);
	getContentPane().add(itemAyuda);
	
	
	
	btnYoutube.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnYoutube.setIcon(new ImageIcon("youtube.png"));
	btnYoutube.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/youtube.png"))));
	
	btnYoutube.setBorderPainted(false);
	btnYoutube.setBorder(null);
	btnYoutube.setBackground(new Color(255, 255, 255, 0));
	btnYoutube.setBounds(173, 225, 54, 51);
	getContentPane().add(btnYoutube);
	
	btnFacebook = new JButton("");
	btnFacebook.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop().browse(new URL("https://www.facebook.com/Fronda.MagatzemVerd").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnFacebook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnFacebook.setIcon(new ImageIcon("facebook.png"));
	btnFacebook.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/facebook.png"))));
	
	btnFacebook.setBorderPainted(false);
	btnFacebook.setBorder(null);
	btnFacebook.setBackground(new Color(255, 255, 255, 0));
	btnFacebook.setBounds(173, 156, 54, 51);
	getContentPane().add(btnFacebook);
	
	JLabel lblInfo = new JLabel("Info");
	lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
	lblInfo.setForeground(new Color(102, 102, 102));
	lblInfo.setFont(new Font("Dialog", Font.BOLD, 15));
	lblInfo.setBounds(164, 473, 78, 30);
	getContentPane().add(lblInfo);
	
	btnInfo = new JButton("");
	btnInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop().browse(new URL("https://www.fronda.com/sobre-nosotros").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnInfo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnInfo.setMnemonic(KeyEvent.VK_BACK_SPACE);
	btnInfo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	//btnInfo.setIcon(new ImageIcon("btnLoginSwitch.png"));
	btnInfo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
	
	
	btnInfo.setSelected(true);
	btnInfo.setOpaque(false);
	btnInfo.setHorizontalTextPosition(SwingConstants.CENTER);
	btnInfo.setForeground(new Color(255, 255, 255, 0));
	btnInfo.setFocusTraversalPolicyProvider(true);
	btnInfo.setFocusCycleRoot(true);
	btnInfo.setContentAreaFilled(false);
	btnInfo.setBorderPainted(false);
	btnInfo.setBorder(null);
	btnInfo.setBackground(new Color(255, 255, 255, 0));
	btnInfo.setBounds(146, 460, 119, 60);
	getContentPane().add(btnInfo);
	
	JLabel lblValranos = new JLabel("Val\u00F3ranos!");
	lblValranos.setHorizontalAlignment(SwingConstants.CENTER);
	lblValranos.setForeground(new Color(102, 102, 102));
	lblValranos.setFont(new Font("Dialog", Font.BOLD, 15));
	lblValranos.setBounds(164, 392, 78, 30);
	getContentPane().add(lblValranos);
	
	JLabel lblSalir = new JLabel("Salir");
	lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
	lblSalir.setForeground(new Color(102, 102, 102));
	lblSalir.setFont(new Font("Dialog", Font.BOLD, 15));
	lblSalir.setBounds(164, 556, 78, 30);
	getContentPane().add(lblSalir);
	//btnSalir_1.setIcon(new ImageIcon("btnLoginSwitch.png"));
	btnSalir_1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));

	
	btnSalir_1.setSelected(true);
	btnSalir_1.setOpaque(false);
	btnSalir_1.setHorizontalTextPosition(SwingConstants.CENTER);
	btnSalir_1.setForeground(new Color(255, 255, 255, 0));
	btnSalir_1.setFocusTraversalPolicyProvider(true);
	btnSalir_1.setFocusCycleRoot(true);
	btnSalir_1.setContentAreaFilled(false);
	btnSalir_1.setBorderPainted(false);
	btnSalir_1.setBorder(null);
	btnSalir_1.setBackground(new Color(255, 255, 255, 0));
	btnSalir_1.setBounds(146, 543, 119, 60);
	getContentPane().add(btnSalir_1);
	
	JLabel lblNewLabel = new JLabel("");
	//lblNewLabel.setIcon(new ImageIcon("white.png"));
	lblNewLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/white.png"))));
	
	
	lblNewLabel.setBounds(161, 79, 84, 279);
	getContentPane().add(lblNewLabel);

	btnHoja = new JButton("");
	btnHoja.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop()
				.browse(new URL("https://www.fronda.com/plantas-de-interior/plantas-hoja-verde").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnHoja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnHoja.setIcon(new ImageIcon("panta2.png"));
	btnHoja.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/panta2.png"))));
	

	btnHoja.setBorder(new LineBorder(Color.WHITE, 4));
	btnHoja.setBounds(618, 124, 213, 210);
	getContentPane().add(btnHoja);
	
	btnPlantas = new JButton("");
	btnPlantas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop()
				.browse(new URL("https://www.fronda.com/plantas-de-interior/plantas-de-flor").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}

		}
	});
	btnPlantas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnPlantas.setBorder(new LineBorder(Color.WHITE, 4));
	//btnPlantas.setIcon(new ImageIcon("planta1.png"));
	btnPlantas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/planta1.png"))));
	
	
	btnPlantas.setBounds(354, 124, 213, 210);
	getContentPane().add(btnPlantas);
	
	btnOrquideas = new JButton("");
	btnOrquideas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop().browse(new URL("https://www.fronda.com/plantas-de-interior/orquideas").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnOrquideas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnOrquideas.setIcon(new ImageIcon("planta3.png"));
	btnOrquideas.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/planta3.png"))));
	
	
	btnOrquideas.setBorder(new LineBorder(Color.WHITE, 4));
	btnOrquideas.setBounds(618, 371, 213, 210);
	getContentPane().add(btnOrquideas);
	
	btnCactus = new JButton("");
	btnCactus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Desktop.getDesktop().browse(
						new URL("https://www.fronda.com/plantas-de-interior/cactus-crasas-y-suculentas").toURI());
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	});
	btnCactus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnCactus.setIcon(new ImageIcon("planta4.png"));
	btnCactus.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/planta4.png"))));
	
	
	btnCactus.setBorder(new LineBorder(Color.WHITE, 4));
	btnCactus.setBounds(354, 371, 213, 210);
	getContentPane().add(btnCactus);
	btnValoranos = new JButton("");
	btnValoranos.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			vl.setVisible(true);
		}
	});
	btnValoranos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	//btnValoranos.setIcon(new ImageIcon("btnLoginSwitch.png"));
	btnValoranos.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnLoginSwitch.png"))));
	
	
	btnValoranos.setSelected(true);
	btnValoranos.setOpaque(false);
	btnValoranos.setMnemonic(KeyEvent.VK_BACK_SPACE);
	btnValoranos.setHorizontalTextPosition(SwingConstants.CENTER);
	btnValoranos.setForeground(new Color(255, 255, 255, 0));
	btnValoranos.setFocusTraversalPolicyProvider(true);
	btnValoranos.setFocusCycleRoot(true);
	btnValoranos.setContentAreaFilled(false);
	btnValoranos.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	btnValoranos.setBorderPainted(false);
	btnValoranos.setBorder(null);
	btnValoranos.setBackground(new Color(255, 255, 255, 0));
	btnValoranos.setBounds(146, 377, 119, 60);
	getContentPane().add(btnValoranos);

	
	JLabel fondo2 = new JLabel("");
	fondo2.setHorizontalTextPosition(SwingConstants.CENTER);
	fondo2.setHorizontalAlignment(SwingConstants.CENTER);
	//fondo2.setIcon(new ImageIcon("rightPanel2.png"));
	fondo2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rightPanel2.png"))));
	
	
	fondo2.setBounds(90, 28, 468, 649);
	getContentPane().add(fondo2);
	
	JLabel fondo1 = new JLabel("");
	//fondo1.setIcon(new ImageIcon("rightPanel2.png"));
	fondo1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/rightPanel2.png"))));
	
	fondo1.setHorizontalTextPosition(SwingConstants.CENTER);
	fondo1.setHorizontalAlignment(SwingConstants.CENTER);
	fondo1.setBounds(461, 28, 468, 649);
	getContentPane().add(fondo1);
	

	ponLaAyuda();
	
	}
	
	//---------------------------------------------------->CONEXIÓN CONTROLADOR Y VISTA
			public void setControlador(Controlador c) {
				
				 btnSalir_1.addActionListener(c);
				 btnOrquideas.addActionListener(c);
				 btnCactus.addActionListener(c);
				 btnHoja.addActionListener(c);
				 btnPlantas.addActionListener(c);
				 btnValoranos.addActionListener(c);
				 btnInfo.addActionListener(c);
				 btnInstagram.addActionListener(c);
				 btnFacebook.addActionListener(c);
				 btnYoutube.addActionListener(c);
				 itemAyuda.addActionListener(c);
			}
			private void ponLaAyuda() {
				
				try {
					// Carga el fichero de ayuda
					//File fichero = new File("jar:file:HousePlantsJar.jar!/help_set.hs");
					//URL hsURL = fichero.toURI().toURL();
					URL hsURL = new URL("jar:file:HousePlantsJar.jar!/help_set.hs");
					// Crea el HelpSet y el HelpBroker
					HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
					HelpBroker hb = helpset.createHelpBroker();

					// Pone ayuda a item de menu al pulsarlo y a F1 en ventana
					// principal y secundaria.
					hb.enableHelpOnButton(itemAyuda, "VentanaHelp", helpset);
					hb.enableHelpKey(getContentPane(), "Login",helpset);
					hb.enableHelpKey(getContentPane(), "Registrarse",helpset);
					hb.enableHelpKey(getContentPane(), "TerminosUso",helpset);
					hb.enableHelpKey(getContentPane(), "PaginaPrincipal",helpset);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
}
