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

    //Setters
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }


    public void agregarMedicamento(Medicamento medicamento) {
        if(this.getCapacidad() >= medicamento.getCantidad()){
            if (!cuenta.isEmpty()) {
                for (Pedido med : cuenta) {
                    if (medicamento.getNombre().equals(med.getNombreM())) {
                        med.setCantidadM(med.getCantidadM() + medicamento.getCantidad());
                        this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
                        medicamento.setcant(0);
                        return;
                    }
                }
            }
            cuenta.add(new Pedido(medicamento.getNombre(), medicamento.getCantidad()));
            this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
            medicamento.setcant(0);
        } else {
            int aux;
            aux = medicamento.getCantidad() - this.getCapacidad();
            if (!cuenta.isEmpty()) {
                for (Pedido med : cuenta) {
                    if (medicamento.getNombre().equals(med.getNombreM())) {
                        medicamento.setcant(aux);
                        this.setCapacidad(0);
                        med.setCantidadM(med.getCantidadM() + this.getCapacidad());
                        return;
                    }
                }
            }
            cuenta.add(new Pedido(medicamento.getNombre(), 100));
            medicamento.setcant(aux);
            this.setCapacidad(0);
        }
    }
    public int cantidadMedicamento() {
        return 100 - capacidad;
    }

    @Override
    public String toString(){
        return "Cantidad de medicamento: " + cantidadMedicamento() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Capacidad: " + getCapacidad() + "\n" +
                "Medicamento: " + cuenta.size() + "\n" +
                "-----------------------------------------";
        }
    }
