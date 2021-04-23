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

	public void setNIT(int NIT) {
		this.NIT = NIT;
	}
	public int getNIT() {
		return this.NIT;
	}
	public void setNombreProv(String nombre) {
		nombreprov = nombre;
	}
	public String getNombreprov() {
		return nombreprov;
	}
	public void setTelefonoPROV(int telefono) {
		telefonoprov = telefono;
	}
	public int getTelefonoprov() {
		return telefonoprov;
	}
	public void setDirprov(String direccion) {
		dirprov = direccion;
	}
	public String getDireccion() {
		return dirprov;
	}


}
