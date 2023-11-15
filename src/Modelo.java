import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

	private Connection conexion = null;
	Statement objetoStatement = null;
	private ResultSet resultado = null;
	String usuario2;
	String Anadir;

	public Modelo() {

		/// ----------------------------------->>REGISTRAR DRIVER

		try {
			Class.forName("org.sqlite.JDBC");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

			System.out.println("Error al registrar el driver");
			System.exit(0);
		}

		/// ----------------------------------->>CONEXIONES

		try {

			//conexion = DriverManager.getConnection("jdbc:sqlite:src/HousePlants.db", "", "");
			conexion = DriverManager.getConnection("jdbc:sqlite::resource:HousePlants.db", "", "");
			objetoStatement = conexion.createStatement();

		} catch (SQLException e) {
			System.out.println("Error al conectar con la Base de datos");
			System.exit(0);
		}

		System.out.println("Conectado!");
	}

	/// --------------------------------->>CREA LA TABLA SI NO EXISTE (REGISTROS)

	public void crearTablaRegistros() {
		PreparedStatement query;
		try {
			query = this.conexion.prepareStatement(
					"CREATE TABLE IF NOT EXISTS Registros(Usuario PRIMARI KEY varchar(40) not null, Contrasena varchar(20) not null, email varchar(20) not null)");
			query.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// --------------------------------->>CREA LA TABLA SI NO EXISTE (VALORACION)

	public void crearTablaValoracion() {
		PreparedStatement query;
		try {
			query = this.conexion.prepareStatement(
					"CREATE TABLE IF NOT EXISTS Valoraciones(Nombre PRIMARI KEY varchar(40) not null, Apellido varchar(20) not null, Tema varchar(20) not null, Puntuacion varchar(20) not null, Lugar varchar(20) not null, Comentario varchar(200) not null)");
			query.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//// --------------------------------------------------->>COMPROBAR QUE NO ESTÁ ESE REGISTRO

	public ResultSet comprobarRegistros(String table, String Usuario) {

		ResultSet resultado = null;

		String Anadir = "SELECT * FROM " + table + " WHERE Usuario = '" + Usuario + "';";

		try {

			resultado = objetoStatement.executeQuery(Anadir);

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return resultado;

	}

	//// --------------------------------------------------->>COMPROBAR QUE ESTÁ ESE REGISTRO

	public boolean buscarRegistro(String usuario, String contrasena) {

		Boolean registrado = false;

		Anadir = "SELECT * FROM Registros WHERE Usuario ='" + usuario + "'AND Contrasena ='" + contrasena + "';";

		try {

			resultado = objetoStatement.executeQuery(Anadir);

			if (resultado.next()) {

				registrado = true;
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return registrado; // -->> si entra cambia a true

	}

	//// --------------------------------------------------->>INSERTAR LOS REGISTROS

	public String Registrar(String Usuario, String Contrasena, String Email, String table) {

		String sentencia = null, mensaje = null;

		// insertamos en la base de datos el registro
		try {
			sentencia = "INSERT INTO " + table + " (Usuario, Contrasena, Email) " + "VALUES ('" + Usuario + "','"
					+ Contrasena + "','" + Email + "')";

			objetoStatement.executeUpdate(sentencia);
			mensaje = "Inserción realizada correctamente";
		} catch (SQLException e) {
			e.printStackTrace();
			mensaje = "Error al Insertar";
		}

		return mensaje;
	}
	//// --------------------------------------------------->>INSERTAR LAS VALORACIONES

	public String Valoraciones(String Nombre, String Apellido, String Tema, String Puntuacion, String Lugar, String Comentario, String table) {

		String sentencia = null, mensaje = null;

		// insertamos en la base de datos el registro
		try {
			sentencia = "INSERT INTO " + table + " (Nombre, Apellido, Tema, Puntuacion, Lugar, Comentario) " + "VALUES ('" + Nombre + "','"
					+ Apellido + "','" + Tema + "','" + Puntuacion + "','" + Lugar + "','" + Comentario + "')";

			objetoStatement.executeUpdate(sentencia);
			
			mensaje = "Comentario realizado correctamente";
		} catch (SQLException e) {
			e.printStackTrace();
			mensaje = "Error al Insertar";
		}

		return mensaje;
	}
}
