package gestorAplicacion;

public class Medicamento {
	private final int codigo;
	private String nombre;
	private Proveedor prov;
	private String MetSuministro;
	private int cant; //cantidad del medicamento en el inventario
	public Medicamento(int codigo, String nombre, Proveedor prov, String metSuministro, int cant) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.prov = prov;
		this.MetSuministro = metSuministro;
		this.cant = cant;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setProveedor(Proveedor prov) {
		this.prov = prov;
	}
	public void setMetSuministro(String metSuministro){
		this.MetSuministro = metSuministro;
	}
	public void setcant(int cant) {
		this.cant = cant;
	}

	//Getters
	public Proveedor getProveedor() {
		return this.prov;
	}
	public int getCantidad() {
		return cant;
	}
	public String getMetSuministro(){
		return MetSuministro;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public String getNombre() {
		return nombre;
	}

	public String toString(){
		return "Codigo: "+ this.codigo+"	Nombre:"+this.nombre+"		Cantidad en el inventario:"+this.cant;
	}
}
