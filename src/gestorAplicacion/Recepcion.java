package gestorAplicacion;

public class Recepcion extends Medicamento{

    public Recepcion(Proveedor proveedor, String nombre, String metSuministro, int codigo, int cantidad) {
        super(codigo,nombre,proveedor,metSuministro,cantidad);
    }
}
