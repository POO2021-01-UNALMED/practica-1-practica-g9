package gestorAplicacion;

public class Nevera {
    Medicamento [] medicamentos;
    int capacidad;
    String codigo;

    public Nevera(Medicamento[] medicamentos, int capacidad, String codigo) {
        this.medicamentos = medicamentos;
        this.capacidad = capacidad;
        this.codigo = codigo;
    }
}
