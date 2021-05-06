package gestorAplicacion;

import java.util.LinkedList;

public class Nevera {
    static LinkedList<Pedido> cuenta = new LinkedList<>();
    private int capacidad;
    private final int codigo;

    public Nevera() {
        this.codigo = (int) Math.floor(Math.random() * (20000 - 1 + 1) + (1));
        this.capacidad = 100;
    }

    //Getters
    public int getCapacidad() {
        return capacidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public int cantidadMedicamento() {
        return 100 - capacidad;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        if(this.getCapacidad() >= medicamento.getCantidad()){
            if (!cuenta.isEmpty()) {
                for (Pedido med : cuenta) {
                    if (medicamento.getNombre().equals(med.getNombreM())) {
                        med.setCantidadM(med.getCantidadM() + medicamento.getCantidad());
                        medicamento.setcant(0);
                        this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
                        return;
                    }
                }
            }
            cuenta.add(new Pedido(medicamento.getNombre(), medicamento.getCantidad()));
            medicamento.setcant(0);
            this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
        } else {
            int aux;
            aux = medicamento.getCantidad() - this.getCapacidad();
            if (!cuenta.isEmpty()) {
                for (Pedido med : cuenta) {
                    if (medicamento.getNombre().equals(med.getNombreM())) {
                        med.setCantidadM(med.getCantidadM() + this.getCapacidad());
                        medicamento.setcant(aux);
                        this.setCapacidad(0);
                        return;
                    }
                }
            }
            cuenta.add(new Pedido(medicamento.getNombre(), 100));
            medicamento.setcant(aux);
            this.setCapacidad(0);
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
                "Capacidad: " + getCapacidad() + "\n" +
                "Medicamento: " + cuenta.size() + "\n" +
                "Lista: " + cuenta;
    }
}
