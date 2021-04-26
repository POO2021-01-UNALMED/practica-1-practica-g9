package gestorAplicacion;

public class Estanterias {
    static Medicamento [] medicamentos;
    static int capacidad;

    public Estanterias() {
        capacidad = 100;
    }

    //Getters
    public int getCapacidad(){
        return capacidad;
    }
    public int cantidadMedicamento(){
        return medicamentos.length;
    }

}
