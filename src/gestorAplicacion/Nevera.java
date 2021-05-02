package gestorAplicacion;

import java.util.LinkedList;

public class Nevera {
    static LinkedList<Medicamento> medicamentos = new LinkedList<>();
    private int capacidad;
    private final int codigo;

    public Nevera() {
        this.codigo = (int)Math.floor(Math.random()*(20000-1+1)+(1));
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
        if(this.getCapacidad() >= medicamento.getCantidad()) {
            medicamentos.add(medicamento);
            this.capacidad -= medicamento.getCantidad();
        } else {
            int aux;
            if(this.getCapacidad() > 0){
                aux = medicamento.getCantidad() - this.getCapacidad();
                medicamento.setcant(aux);
                this.setCapacidad(0);
            }
        }
    }

    //Setters
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    @Override
    public String toString(){
        return "Cantidad de medicamento: " + cantidadMedicamento() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Capacidad: " + capacidad + "\n" +
                "Medicamento: " + medicamentos.size();
    }
}
