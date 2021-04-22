package gestorAplicacion;

public class Proveedor {
	private int NIT;
	private String nombreprov; // nombre proveedor
	private int telefonoprov; // telefono del proveedor
	private String Dirprov; //direccion del proveedor
	public Proveedor(int NIT, String nombre, int telefono, String direccion) {
		this.NIT = NIT;
		nombreprov = nombre;
		telefonoprov = telefono;
		Dirprov = direccion;
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
}
