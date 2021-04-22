package gestorAplicacion;

public class Cliente extends Persona {
	private String direccion;
	private int telefono;
	public Cliente(String nombre, int edad, int documento, String direccion, int telefono) {
		this.setNombre(nombre);
        this.setEdad(edad);
        this.setdocumento(documento);
        this.direccion = direccion;
		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}
}
