import java.awt.Dimension;

import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Valoracion extends JFrame{
	JTextField texNombre;
	JTextField texApellido;
	JTextPane txtpnEscribaAquSu;
	JSlider slider;
	JComboBox comboBox1;
	JComboBox comboBox2;
	JLabel lblEnviar;
	JButton btnEnviar;
	private JButton btnSalir;
	private JLabel lblSalir;
	
	public Valoracion() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage("icon2.png"));
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon2.png")));
		
		
		getContentPane().setBackground(new Color(191, 184, 161));
		setBackground(new Color(191, 184, 161));
		
		getContentPane().setLayout(null);
		setBounds(100,100,669,285);
		
		txtpnEscribaAquSu = new JTextPane();
		txtpnEscribaAquSu.setText("Escriba aqu\u00ED su comentario");
		txtpnEscribaAquSu.setToolTipText("Escriba aqu\u00ED su comentario");
		txtpnEscribaAquSu.setForeground(new Color(128, 128, 128));
		txtpnEscribaAquSu.setFont(new Font("Dialog", Font.BOLD, 12));
		txtpnEscribaAquSu.setBorder(new LineBorder(new Color(142, 161, 142), 3));
		txtpnEscribaAquSu.setBounds(121, 236, 244, 94);
		getContentPane().add(txtpnEscribaAquSu);
		
		lblEnviar = new JLabel("Enviar");
		lblEnviar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnviar.setForeground(Color.WHITE);
		lblEnviar.setFont(new Font("Dialog", Font.BOLD, 15));
		lblEnviar.setBounds(113, 352, 91, 32);
		getContentPane().add(lblEnviar);
		
		lblSalir = new JLabel("Salir");
		lblSalir.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalir.setForeground(Color.WHITE);
		lblSalir.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSalir.setBounds(288, 352, 91, 32);
		getContentPane().add(lblSalir);
		
		btnEnviar = new JButton("");
		//btnEnviar.setIcon(new ImageIcon("btnsignUp.png"));
		btnEnviar.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
		
		btnEnviar.setSelected(true);
		btnEnviar.setOpaque(false);
		btnEnviar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEnviar.setForeground(new Color(255, 255, 255, 0));
		btnEnviar.setFocusTraversalPolicyProvider(true);
		btnEnviar.setFocusCycleRoot(true);
		btnEnviar.setContentAreaFilled(false);
		btnEnviar.setBorderPainted(false);
		btnEnviar.setBorder(null);
		btnEnviar.setBackground(new Color(255, 255, 255, 0));
		btnEnviar.setBounds(104, 341, 119, 60);
		getContentPane().add(btnEnviar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(new Color(142, 161, 142));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNombre.setBounds(55, 47, 69, 32);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setForeground(new Color(142, 161, 142));
		lblApellido.setFont(new Font("Dialog", Font.BOLD, 13));
		lblApellido.setBounds(246, 47, 69, 32);
		getContentPane().add(lblApellido);
		
		JLabel lblcomoNosHa = new JLabel("\u00BFComo nos has encontrado?");
		lblcomoNosHa.setHorizontalAlignment(SwingConstants.CENTER);
		lblcomoNosHa.setForeground(new Color(142, 161, 142));
		lblcomoNosHa.setFont(new Font("Dialog", Font.BOLD, 13));
		lblcomoNosHa.setBounds(53, 193, 183, 32);
		getContentPane().add(lblcomoNosHa);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Elija...", "Instagram", "Facebook", "Youtube", "Nuestra web", "Recomendaci\u00F3n"}));
		comboBox2.setBackground(Color.WHITE);
		comboBox2.setBounds(261, 197, 115, 26);
		getContentPane().add(comboBox2);
		
		texNombre = new JTextField();
		texNombre.setBounds(120, 51, 103, 26);
		getContentPane().add(texNombre);
		texNombre.setColumns(10);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Elija...", "Disponibilidad de un producto", "Atenci\u00F3n al cliente", "Servicios", "Otros"}));
		comboBox1.setBackground(Color.WHITE);
		comboBox1.setBounds(309, 94, 115, 26);
		getContentPane().add(comboBox1);
		
		texApellido = new JTextField();
		texApellido.setColumns(10);
		texApellido.setBounds(321, 51, 115, 26);
		getContentPane().add(texApellido);
		
		slider = new JSlider();
		slider.setBackground(new Color(255, 255, 255));
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setValue(10);
		slider.setMaximum(10);
		slider.setBounds(205, 132, 212, 50);
		getContentPane().add(slider);
		btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que quiere salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
				if(resp == JOptionPane.YES_OPTION) {
					
					dispose();
					
					//Sino, nos mantenemos en ella.
					}else if(resp == JOptionPane.NO_OPTION) {
						
						System.out.println("Gracias por continuar usando la aplicación!");
					}
				}
		});
		//btnSalir.setIcon(new ImageIcon("btnsignUp.png"));
		btnSalir.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/btnsignUp.png"))));
		
		btnSalir.setSelected(true);
		btnSalir.setOpaque(false);
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setForeground(new Color(255, 255, 255, 0));
		btnSalir.setFocusTraversalPolicyProvider(true);
		btnSalir.setFocusCycleRoot(true);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorderPainted(false);
		btnSalir.setBorder(null);
		btnSalir.setBackground(new Color(255, 255, 255, 0));
		btnSalir.setBounds(276, 341, 119, 60);
		getContentPane().add(btnSalir);
		
		JLabel lblPunteDel = new JLabel("Punt\u00FAe del 1 al 10");
		lblPunteDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunteDel.setForeground(new Color(142, 161, 142));
		lblPunteDel.setFont(new Font("Dialog", Font.BOLD, 13));
		lblPunteDel.setBounds(55, 131, 126, 32);
		getContentPane().add(lblPunteDel);
		
		JLabel lblSobreQueTema = new JLabel("\u00BFSobre que tema quiere valorarnos?");
		lblSobreQueTema.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobreQueTema.setForeground(new Color(142, 161, 142));
		lblSobreQueTema.setFont(new Font("Dialog", Font.BOLD, 13));
		lblSobreQueTema.setBounds(55, 90, 244, 32);
		getContentPane().add(lblSobreQueTema);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("fondo-blanco.png"));
		lblNewLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/fondo-blanco.png"))));
		
		lblNewLabel.setBounds(28, 16, 453, 416);
		getContentPane().add(lblNewLabel);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(new Dimension(528, 487));
		
		
		
	}
	//---------------------------------------------------->CONEXIÓN CONTROLADOR Y VISTA
	public void setControlador(Controlador c) {
		
		btnEnviar.addActionListener(c);
		
	}
}
