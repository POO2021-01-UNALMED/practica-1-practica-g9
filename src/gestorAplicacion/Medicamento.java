package gestorAplicacion;

public class Medicamento {
	private final int codigo;
	private String nombre;
	private Proveedor prov;
	private int cant; //cantidad del medicamento en el inventario
	public Medicamento(int codigo, String nombre, Proveedor prov, int cant) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.prov = prov;
		this.cant = cant;
	}

	public int getCodigo() {
		return this.codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setProveedor(Proveedor prov) {
		this.prov = prov;
	}
	public Proveedor getProveedor() {
		return this.prov;
	}
	public void setcant(int cant) {
		this.cant = cant;
	}
	public int getCantidad() {
		return cant;
	}
}
