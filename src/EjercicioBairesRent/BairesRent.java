package EjercicioBairesRent;

import java.time.LocalDate;

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
		
	}
	
	
}
