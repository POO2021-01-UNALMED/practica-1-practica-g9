package gestorAplicacion;

public class Medicamento {
	private final String nombre;
	private Proveedor prov;
	private String MetSuministro;
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
	public void setMetSuministro(String metSuministro){
		this.MetSuministro = metSuministro;
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
	public String getMetSuministro(){
		return MetSuministro;
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString(){
		return " Nombre: " + this.getNombre() + " Cantidad en el inventario: " + this.getCantidad();
	}
}
