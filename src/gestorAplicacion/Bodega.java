package gestorAplicacion;

public class Bodega {
    String ubicacion;
    Nevera [] neveras;
    Estanterias [] estanterias;
    int capacidadMax = 100;

    public Bodega(String ubicacion, Nevera [] neveras, Estanterias [] estanterias){
        this.ubicacion = ubicacion;
        this.neveras = neveras;
        this.estanterias = estanterias;
    }
}
