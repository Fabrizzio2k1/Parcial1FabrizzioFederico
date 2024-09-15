package EjercicioBairesRent;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu [] = {"Ingreso","Consulta","Alquilar","Salir"};
		int opcion;
		
		do {
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				
				break;

			default:
				break;
			}
		} while (opcion!=3);
	}

}
