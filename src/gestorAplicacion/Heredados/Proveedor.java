package gestorAplicacion.Heredados;

import java.io.Serializable;

public class Proveedor  implements Serializable {
	private int NIT;
	private String nombreprov; // nombre proveedor
	private long telefonoprov; // telefono del proveedor
	private String dirprov; //direccion del proveedor
	public Proveedor(int NIT, String nombre, long telefono, String direccion) {
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
	public long getTelefonoprov() {
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
