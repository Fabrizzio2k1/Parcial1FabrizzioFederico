package EjercicioBiblioteca;

import java.time.LocalDate;

public class Libro {
	
	//Atributos
	private String nombre;
	private String autor;
	private Boolean disponibilidad;
	private LocalDate fechaInicio;
	private LocalDate fechaDevolucion;
	private String persona;
	private String dni;
	
	//Constructor
	public Libro() {
		this.nombre = "No asignado";
		this.autor = "No asignado";
		this.disponibilidad = null;
		this.fechaInicio = LocalDate.now();
		this.fechaDevolucion = LocalDate.now();
		this.persona = "No asignado";
		this.dni = "No asignado";
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void solicitarLibro() {
		
	}
	
	public String validarCaracteres(String mensaje) {
		
		return "";
	}
	
	
	
}
