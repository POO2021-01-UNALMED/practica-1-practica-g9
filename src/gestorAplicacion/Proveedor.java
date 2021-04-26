package gestorAplicacion;

public class Proveedor {
	private int NIT;
	private String nombreprov; // nombre proveedor
	private int telefonoprov; // telefono del proveedor
	private String dirprov; //direccion del proveedor
	public Proveedor(int NIT, String nombre, int telefono, String direccion) {
		this.NIT = NIT;
		nombreprov = nombre;
		telefonoprov = telefono;
		dirprov = direccion;
	}

	//Getters
	public String getDireccion() {
		return dirprov;
	}
	public String getNombreprov() {
		return nombreprov;
	}
	public int getTelefonoprov() {
		return telefonoprov;
	}
	public int getNIT() {
		return this.NIT;
	}

	//Setters
	public void setNIT(int NIT) {
		this.NIT = NIT;
	}
	public void setNombreProv(String nombre) {
		nombreprov = nombre;
	}
	public void setTelefonoPROV(int telefono) {
		telefonoprov = telefono;
	}
	public void setDirprov(String direccion) {
		dirprov = direccion;
	}
}
