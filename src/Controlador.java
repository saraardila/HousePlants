import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ActionListener, MouseListener {

	Registro r = null;
	yaRegistrado y = null;
	Ventana2 v = null;
	Modelo bd = null;
	Valoracion vl = null;

	public Controlador(Registro r, Modelo bd, yaRegistrado y, Ventana2 v, Valoracion vl) {
		
		this.r = r;
		this.bd = bd;
		this.y = y;
		this.v = v;
		this.vl = vl;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object boton = e.getSource();

		ResultSet comprobar = bd.comprobarRegistros("Registros", r.txtUsuario.getText());

		if (boton == r.btnEntrar2) { //// --------------------------------------------------->>BOTON REGISTRARSE

			try {

				if (!comprobar.next()) { // --->> si el registro no está en la base de datos entonces podrá guardarse.ç

					String mensaje = "";
					String Usuario = r.txtUsuario.getText();
					String Contrasena = r.txtContrasena.getText().toString();
					String Email = r.txtEmail.getText();
					boolean Terminos = r.chckbxTerminosUso.isSelected();

					if (Usuario.isEmpty() || Contrasena.isEmpty() || Email.isEmpty()) {// ----->comprobar si los campos
																						// están vacios

						System.out.println("Los campos están vacíos.");
						JOptionPane.showMessageDialog(r, "Por favor, rellene todos los campos.", "Error!",
								JOptionPane.ERROR_MESSAGE);

					}
					if (Terminos == false) {
						JOptionPane.showMessageDialog(r, "Por favor,debe aceptar los términos de uso.", "Atención!",
								JOptionPane.WARNING_MESSAGE);
					} else {

						mensaje = bd.Registrar(Usuario, Contrasena, Email, "Registros");

						JOptionPane.showMessageDialog(r, "Se ha registrado correctamente", "Enhorabuena!",
								JOptionPane.INFORMATION_MESSAGE);
						v.setVisible(true);
						r.setVisible(false);
						System.out.println("Se ha registrado correctamente");

					}

				} else {

					JOptionPane.showMessageDialog(r, "Ese usuario ya está registrado.", "Error!",
							JOptionPane.WARNING_MESSAGE);
				}

			} catch (SQLException e1) {

				JOptionPane.showMessageDialog(r, "Ha ocurrido un error, no se pueden registrar los datos.", "Error!",
						JOptionPane.WARNING_MESSAGE);

				e1.printStackTrace();
			}
		}

		else if (boton == y.btnEntrar2) {//// ------------------------------------------->>BOTON ENTRAR SI YA ESTAS REGISTRADO

			boolean resultado = false;

			resultado = bd.buscarRegistro(y.txtUsuario.getText(), y.txtContrasena.getText()); //-->> para que la contraseña no la guarde cifrada

			if (resultado) { // --->> si el registro está en la base de datos entonces podrá entrar(true)

				// entra en la pagina

				v.setVisible(true);
				y.setVisible(false);

			} else {

				System.out.println("Los campos están vacíos.");
				JOptionPane.showMessageDialog(y, "Este usuario no existe.", "Error!", JOptionPane.ERROR_MESSAGE);

			}

		}

		else if (boton == vl.btnEnviar) { //--------------->> Enviar el formulario
			vl.setVisible(false);
			
			String mensaje = "";
			String Nombre = vl.texNombre.getText();
			String Apellido = vl.texApellido.getText();
			String Tema = vl.comboBox1.getSelectedItem().toString();
			int Puntuacion1 = vl.slider.getValue();
			String Puntuacion = String.valueOf(Puntuacion1);
			String Lugar = vl.comboBox2.getSelectedItem().toString();
			String Comentario = vl.txtpnEscribaAquSu.getText();

			if (Nombre.isEmpty() || Apellido.isEmpty() || Tema.isEmpty() || Puntuacion.isEmpty() || Lugar.isEmpty()
					|| Comentario.isEmpty()) { // -->> comprobar que los campos no estén vacios

				System.out.println("Los campos están vacíos.");
				JOptionPane.showMessageDialog(vl, "Por favor, complete todos los campos", "Error!",
						JOptionPane.WARNING_MESSAGE);

			} else

				mensaje = bd.Valoraciones(Nombre, Apellido, Tema, Puntuacion, Lugar, Comentario, "Valoraciones");

			JOptionPane.showMessageDialog(vl, "Su comentario ha sido enviado con éxito", "Enhorabuena!",
					JOptionPane.INFORMATION_MESSAGE);
		
			
		} else if(boton == r.btnSalir) {
			
			r.cerrarVentana(); //-->> metodo cerrar ventana
			
		}else if(boton == r.btnDirecto) {
			
			r.dispose();
			
			v.setVisible(true);
			
			
		}else if(boton == y.btnSalir){
			
			y.cerrarVentana();
			
		}else if(boton == v.btnValoranos) {
			
			v.setVisible(false);
			vl.setVisible(true);
			
		}else if(boton == v.btnSalir_1 ) {
			
			System.exit(0);
			
		}
		//// --------------------------------------------------->>VENTANAS VISIBLES O NO

		else if (boton == r.btnRegistrarse) {

			r.setVisible(true);
			y.setVisible(false);
			deshabilitarBoton(r, y);

		} else if (boton == r.btnEntrar) {

			r.setVisible(false);
			y.setVisible(true);
			y.validate();
			deshabilitarBoton(r, y);

		} else if (boton == y.btnRegistrarse) {

			r.setVisible(true);
			y.setVisible(false);
			y.validate();
			deshabilitarBoton(r, y);
			
			
			///////////------------------------------->>LINKS

		} else if (boton == v.btnHoja) {
			try {
				Desktop.getDesktop()
						.browse(new URL("https://www.fronda.com/plantas-de-interior/plantas-hoja-verde").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnCactus) {

			try {

				Desktop.getDesktop().browse(
						new URL("https://www.fronda.com/plantas-de-interior/cactus-crasas-y-suculentas").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnOrquideas) {

			try {
				Desktop.getDesktop().browse(new URL("https://www.fronda.com/plantas-de-interior/orquideas").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnPlantas) {

			try {
				Desktop.getDesktop()
						.browse(new URL("https://www.fronda.com/plantas-de-interior/plantas-de-flor").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnYoutube) {

			try {
				Desktop.getDesktop()
						.browse(new URL("https://www.youtube.com/channel/UCcNHeDxisUC5ZrIjHL6L-YQ/featured").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnInstagram) {

			try {
				Desktop.getDesktop().browse(new URL("https://www.instagram.com/fronda_magatzem/").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}

		} else if (boton == v.btnInfo) {

			try {
				Desktop.getDesktop().browse(new URL("https://www.fronda.com/sobre-nosotros").toURI());

			} catch (MalformedURLException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			} catch (URISyntaxException e1) {

				e1.printStackTrace();
			}
		} else if (boton == v.btnSalir_1) {

			System.exit(0);}
		/*}else if (boton == v.itemAyuda) {
			
			
			try {
				// Carga el fichero de ayuda
				File fichero = new File("help/help_set.hs");
				URL hsURL = fichero.toURI().toURL();

				// Crea el HelpSet y el HelpBroker
				HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
				HelpBroker hb = helpset.createHelpBroker();

				hb.enableHelpOnButton(r.itemAyuda, "VentanaHelp", helpset);
				hb.enableHelpKey(r.getContentPane(), "Login",helpset);
				hb.enableHelpKey(r.getContentPane(), "Registrarse",helpset);
				hb.enableHelpKey(r.getContentPane(), "TerminosUso",helpset);
				hb.enableHelpKey(r.getContentPane(), "PaginaPrincipal",helpset);

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}*/
		
		else if (boton == r.itemAyuda) {
			
			
			try {
				// Carga el fichero de ayuda
				//File fichero = new File("help/help_set.hs");
				//File fichero = new File("jar:file:HousePlantsJar.jar!/help_set.hs");
				//URL hsURL = fichero.toURI().toURL();
				URL hsURL = new URL("jar:file:HousePlantsJar.jar!/help_set.hs");
				// Crea el HelpSet y el HelpBroker
				HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
				HelpBroker hb = helpset.createHelpBroker();

				// Pone ayuda a item de menu al pulsarlo y a F1 en ventana
				// principal y secundaria.
				hb.enableHelpOnButton(r.itemAyuda, "VentanaHelp", helpset);
				hb.enableHelpKey(r.getContentPane(), "Login",helpset);
				hb.enableHelpKey(r.getContentPane(), "Registrarse",helpset);
				hb.enableHelpKey(r.getContentPane(), "TerminosUso",helpset);
				hb.enableHelpKey(r.getContentPane(), "PaginaPrincipal",helpset);

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

	//// --------------------------------------------------->>DESHABILITAR BOTONES

	public void deshabilitarBoton(Registro r, yaRegistrado y) {

		if (r.isVisible()) {

			y.setVisible(false);
			r.btnEntrar2.setEnabled(true);
			r.btnEntrar.setEnabled(false);
			r.btnRegistrarse.setEnabled(false);
		} else if (y.isVisible()) {

			r.setVisible(false);
			r.btnEntrar2.setEnabled(true);
			r.btnRegistrarse.setEnabled(true);

		}

	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
