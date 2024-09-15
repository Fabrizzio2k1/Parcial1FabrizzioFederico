package EjercicioBiblioteca;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu [] = {"Solicitar","Devolver","Estado","Salir"};
		int opcion;
		Libro l1 = new Libro();
		
		do {
			opcion = JOptionPane.showOptionDialog(null, "Bienvenido a Lectores Felices!!!\nElija una opcion:", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				break;
			case 1:
				if (l1.getNombre().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "No solicitaste ningun libro...");
				} else {
					// Aca va la devolucion
				}
				break;
			case 2:
				if (l1.getNombre().equals("No asignado")) {
					JOptionPane.showMessageDialog(null, "No solicitaste ningun libro...");
				} else {
					// Aca va el estado
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Hasta luego, que tenga un Buen dia!!!");
				break;
			default:
				break;
			}
		} while (opcion!=3);
	}

}
