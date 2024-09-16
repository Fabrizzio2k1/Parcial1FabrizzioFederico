package EjercicioBairesRent;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class BairesRent {
	//Atributos
	
	private int precio;
	private Boolean disponibilidad;
	private double tamaño;
	private String ubicacion;
	private LocalDate fecha;
	private String inquilino;
	private int dni;
	
	//Constructor
	public BairesRent() {
		this.precio = 0;
		this.disponibilidad = true;
		this.tamaño = 0.0;
		this.ubicacion = "No asignado";
		this.fecha = LocalDate.now();
		this.inquilino = "No asignado";
		this.dni = 0;
	}
	
	//Getters y Setters

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getInquilino() {
		return inquilino;
	}

	public void setInquilino(String inquilino) {
		this.inquilino = inquilino;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void ingresarCuenta() {
		this.inquilino = validarNombre("Ingrese su nombre:");
		this.dni = verificarDocumento("Ingrese su DNI:");
		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + this.inquilino );
	}
	
	public String seleccionarUbicacion() {
		String opciones [] = {"La Boca","Caballito","Almagro","Palermo","Recoleta"};
		ubicacion = (String) JOptionPane.showInputDialog(null, "Seleccione una Opción:", "Departamentos", 0, null, opciones,opciones[0]);
		return ubicacion;
	}
	
	public double seleccionarTamaño() {
		this.tamaño = validarDigitos("Ingrese el tamaño del depto");
		return tamaño;
	}
	
	public void alquilarDepartamento() {
		switch (ubicacion) {
		case "La Boca":
				this.precio = 100;
				this.precio *= tamaño;
			break;
		case "Caballito":
				this.precio = 1000;
				this.precio *= tamaño;
			break;
		case "Almagro":
				this.precio = 500;
				this.precio *= tamaño;
			break;
		case "Palermo":
				this.precio = 5000;
				this.precio *= tamaño;
			break;
		case "Recoleta":
				this.precio = 10000;
				this.precio *= tamaño;
			break;
		default:
			break;
		}
	}
	
	public void comprarDepartamento() {
		JOptionPane.showMessageDialog(null, "Felicitaciones " + inquilino + " compraste el departamento en " + ubicacion + ", su precio final fue $" + precio + ", el " + fecha);
	}
	
	public String validarNombre(String mensaje) {
		String texto = "";
		Boolean flag;
		do {
			flag = true;
			texto = JOptionPane.showInputDialog(mensaje);
			while (texto.isEmpty()) {
				texto = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < texto.length(); i++) {
				if(!Character.isAlphabetic(texto.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return texto;
	}
	
	public int verificarDocumento(String mensaje) {
		String documento = "";
		boolean flag;
		
		do {
			flag = true;
			documento = JOptionPane.showInputDialog(mensaje);
		while (documento.isEmpty() || documento.length() != 8) {
			documento = JOptionPane.showInputDialog(mensaje);
		}
		for (int i = 0; i < documento.length(); i++) {
            if (!Character.isDigit(documento.charAt(i))) {
                flag = false;
                break;
            }
		}
		} while (!flag);
		
		return Integer.parseInt(documento);
}
	
	public double validarDigitos(String mensaje) {
		String num = "";
		Boolean flag;
		do {
			flag = true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if(!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Double.parseDouble(num);
	}
}

