package gestorAplicacion;

public class Empleado {
	private String direccion;
	private int telefono;
	private String cargo;
	
	public Empleado(String nombre, int edad, int documento, String direccion, int telefono, 
			String cargo){
		this.setNombre(nombre);
        this.setEdad(edad);
        this.setDocumento(documento);
        this.setcargo(cargo);
        this.direccion = direccion;
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}	
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	
	public String getcargo() {
		return cargo;
	}
	
}

