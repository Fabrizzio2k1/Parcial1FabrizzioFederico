package EjercicioBairesRent;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu [] = {"Ingresar","Consultar Ubicacion","Tamaño","Alquilar","Salir"};
		int opcion;
		BairesRent c1 = new BairesRent();
		
		do {
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				c1.ingresarCuenta();
				break;
			case 1:
				if (c1.getInquilino().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "Necesitas iniciar sesion!!!");
				}else {
					c1.seleccionarUbicacion();
				}
				break;
			case 2:
				if (c1.getUbicacion().equals("No asignado") || c1.getInquilino().equals("No asignado") ) {
					JOptionPane.showMessageDialog(null, "Necesitas Colocar Ubicacion o Iniciar Sesión!!!");
				}else {
					c1.seleccionarTamaño();
				}
				break;
			case 3:
				if (c1.getTamaño()==0.0) {
					JOptionPane.showMessageDialog(null, "Necesitas Colocar Tamaño!!!");
				} else {
					c1.alquilarDepartamento();
					c1.comprarDepartamento();
				}
				break;	
			case 4:
				JOptionPane.showMessageDialog(null, "Nos Vemos " + c1.getInquilino() + "!!!" );
				break;
			default:
				break;
			}
		} while (opcion!=4);
	}

}
