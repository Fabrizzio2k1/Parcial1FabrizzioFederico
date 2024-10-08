package EjercicioBiblioteca;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Libro {
	
	//Atributos
	private String nombre;
	private String autor;
	private Boolean disponibilidad;
	private LocalDate fechaInicio;
	private LocalDate fechaDevolucion;
	private String devolucion;
	private String persona;
	private int dni;
	
	//Constructor
	public Libro() {
		this.nombre = "No asignado";
		this.autor = "No asignado";
		this.disponibilidad = true;
		this.fechaInicio = LocalDate.now();
		this.fechaDevolucion = this.fechaInicio;
		this.devolucion = "Devolucion: ";
		this.persona = "No asignado";
		this.dni = 0;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public String getDevolucion() {
		return devolucion;
	}

	public void setDevolucion(String devolucion) {
		this.devolucion = devolucion;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void solicitarLibro() {
		do {
			this.nombre = validarCaracteres("Ingrese el nombre del Libro:");
			this.autor = validarNombre("Ingrese el nombre del Autor:");
			this.disponibilidad = validarDisponibilidad("¿Esta disponible?");
			if(!disponibilidad) {
				JOptionPane.showMessageDialog(null, "El libro no está disponible. Por favor, intente nuevamente.");
				continue;
			}
			this.fechaInicio = LocalDate.of(validarDigitos("Fecha del prestamo del libro\nAño:"),validarDigitos("Fecha del prestamo del libro\nMes:"),validarDigitos("Fecha del prestamo del libro\nDia:"));
			this.persona = validarNombre("Ingrese el nombre de la persona que pide el prestamo:");
			this.dni = validarDni("Ingrese el DNI de la persona");
			JOptionPane.showMessageDialog(null, "Fue cargado Extiosamente!!!");
		} while (disponibilidad!=true);
	}
	
	public void devolverLibro() {
		fechaDevolucion = fechaDevolucion.plusDays(7);
		devolucion = devolucion + "la Persona " + persona + ", con DNI " + dni + ", Tiene que devolver el libro el " + fechaDevolucion;
	}
	
	public String validarCaracteres(String mensaje) {
		String texto = "";
		while (texto.equals("")) {
			texto = JOptionPane.showInputDialog(mensaje);
		}
		return texto;
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
	
	public int validarDigitos(String mensaje) {
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
		
		return Integer.parseInt(num);
	}
	
	public int validarDni(String mensaje) {
		String num = "";
		Boolean flag;
		do {
			flag = true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty() || num.length() != 8) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if(!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Integer.parseInt(num);
	}
	
	public boolean validarDisponibilidad(String mensaje) {
		String disp [] = {"Si","No"};
		int opcion = JOptionPane.showOptionDialog(null, mensaje, null, 0, 0, null, disp, disp[0]);
		switch (opcion) {
		case 0:
			return true;
		case 1:
			return false;
		default:
			break;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", disponibilidad=" + disponibilidad + ", fechaInicio="
				+ fechaInicio + ", fechaDevolucion=" + fechaDevolucion + ", persona=" + persona + ", dni=" + dni + "]";
	}
	
}
