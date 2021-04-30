package gestorAplicacion;

import java.util.LinkedList;

public class Nevera {
    static LinkedList<Medicamento> medicamentos = new LinkedList<>();
    private int capacidad;
    private int codigo;

    public Nevera(int codigo) {
        this.codigo = codigo;
        this.capacidad = 100;
    }

    //Getters
    public int getCapacidad(){
        return capacidad;
    }
    public int getCodigo(){
        return codigo;
    }
    public int cantidadMedicamento() {
        int cantidad = 0;
        if (medicamentos.isEmpty()) {
            return 0;
        } else {
            for (Medicamento medicamento : medicamentos) {
                cantidad += medicamento.getCantidad();
            }
            return cantidad;
        }
    }
    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }

    //Setters
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return "Cantidad de medicamento: " + cantidadMedicamento() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Capacidad: " + capacidad;
    }
}
