package gestorAplicacion;

public class Nevera {
    static Medicamento [] medicamentos;
    static int capacidad;
    private int codigo;

    public Nevera(int codigo) {
        this.codigo = codigo;
        capacidad = 100;
    }

    //Getters
    public int getCapacidad(){
        return capacidad;
    }
    public int getCodigo(){
        return codigo;
    }
    public int cantidadMedicamento() {
        if (medicamentos.length == 0) {
            return 0;
        } else {
            return medicamentos.length;
        }
    }

    //Setters
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}
