package gestorAplicacion.Heredados;

import gestorAplicacion.Abstracto.Persona;

public class Empleado extends Persona {
	private String direccion;
	private int telefono;
	private String cargo;
	
	public Empleado(String nombre, int edad, int documento, String direccion, int telefono, 
			String cargo){
		super(nombre, edad, documento);
        this.setcargo(cargo);
        this.direccion = direccion;
		this.telefono = telefono;
	}
	//Getters
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getcargo() {
		return cargo;
	}

	//Setters
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
}

