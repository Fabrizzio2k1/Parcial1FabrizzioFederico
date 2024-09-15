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
	private String persona;
	private int dni;
	
	//Constructor
	public Libro() {
		this.nombre = "No asignado";
		this.autor = "No asignado";
		this.disponibilidad = true;
		this.fechaInicio = LocalDate.now();
		this.fechaDevolucion = LocalDate.now();
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
		this.nombre = validarCaracteres("Ingrese el nombre del Libro:");
		this.autor = validarCaracteres("Ingrese el nombre del Autor:");
		this.disponibilidad = validarDisponibilidad("¿Esta disponible?");
		this.fechaInicio = LocalDate.of(validarDigitos("Fecha del prestamo del libro\nAño:"),validarDigitos("Fecha del prestamo del libro\nMes:"),validarDigitos("Fecha del prestamo del libro\nDia:"));
		this.persona = validarCaracteres("Ingrese el nombre de la persona que pide el prestamo:");
		this.dni = validarDigitos("Ingrese el dni de la persona");
	}
	
	public String validarCaracteres(String mensaje) {
		String texto = "";
		while (texto.equals("")) {
			texto = JOptionPane.showInputDialog(mensaje);
		}
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
	
	
	
}
