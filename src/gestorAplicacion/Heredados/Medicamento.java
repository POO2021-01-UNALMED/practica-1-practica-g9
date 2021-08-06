package gestorAplicacion.Heredados;

import java.io.Serializable;

public class Medicamento implements Serializable {
	private final String nombre;
	private Proveedor prov;
	private int cantidad; //cantidad del medicamento en el inventario

	public Medicamento(String nombre, int cantidad){
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public Medicamento(String nombre, Proveedor prov, int cant) {
		this.nombre = nombre;
		this.prov = prov;
		this.cantidad = cant;
	}

	//Setters
	public void setProveedor(Proveedor prov) {
		this.prov = prov;
	}
	public void setcant(int cant) {
		this.cantidad = cant;
	}

	//Getters
	public Proveedor getProveedor() {
		return this.prov;
	}
	public int getCantidad() {
		return cantidad;
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString(){
		return " Nombre: " + this.getNombre() + " Cantidad: " + this.getCantidad() + "\n";
	}
}
