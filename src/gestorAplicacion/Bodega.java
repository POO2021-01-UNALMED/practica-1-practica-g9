package gestorAplicacion;

public class Bodega {
    String ubicacion;
    Nevera [] neveras;
    Estanterias [] estanterias;

    public Bodega(String ubicacion, Nevera [] neveras, Estanterias [] estanterias){
        this.ubicacion = ubicacion;
        this.neveras = neveras;
        this.estanterias = estanterias;
    }
}
