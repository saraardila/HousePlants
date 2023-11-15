
public class Principal {

	public static void main(String[] args) {
	
		Modelo bd = new Modelo();
		Registro registro = new Registro();
		yaRegistrado y = new yaRegistrado();
		Ventana2 v = new Ventana2();
		Valoracion vl = new Valoracion();
		Controlador controlador = new Controlador(registro,bd,y,v,vl);
		
		//---------------------------------->>Conexión vista-controlador
		registro.setControlador(controlador);
		y.setControlador(controlador);
		v.setControlador(controlador);
		vl.setControlador(controlador);
		//---------------------------------->>hacer visible la ventana
		registro.setVisible(true);
		y.setVisible(false);
		v.setVisible(false);
		//vl.setVisible(true);
		//------------------------------>>Crear tabla si no hay
		bd.crearTablaRegistros();
		bd.crearTablaValoracion();
			
	}

}
