package gestorAplicacion;

import java.util.LinkedList;

public class Nevera {
    public LinkedList<Medicamento> cuenta = new LinkedList<>();
    public LinkedList<String> medicamentos = new LinkedList<>();
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
        if (medicamento.getCantidad() != 0) {
            if (this.getCapacidad() >= medicamento.getCantidad()) {
                if (!cuenta.isEmpty()) {
                    if (medicamentos.contains(medicamento.getNombre())) {
                        for (Medicamento med : cuenta) {
                            if (medicamento.getNombre().equals(med.getNombre())) {
                                med.setcant(med.getCantidad() + medicamento.getCantidad());
                                this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
                                medicamento.setcant(0);
                            }
                        }
                    } else {
                        cuenta.add(new Medicamento(medicamento.getNombre(), medicamento.getCantidad()));
                        medicamentos.add(medicamento.getNombre());
                        this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
                        medicamento.setcant(0);
                    }
                } else {
                    cuenta.add(new Medicamento(medicamento.getNombre(), medicamento.getCantidad()));
                    medicamentos.add(medicamento.getNombre());
                    this.setCapacidad(this.getCapacidad() - medicamento.getCantidad());
                    medicamento.setcant(0);
                }
            } else {
                int aux;
                aux = medicamento.getCantidad() - this.getCapacidad();
                if (!cuenta.isEmpty()) {
                    if (medicamentos.contains(medicamento.getNombre())) {
                        for (Medicamento med : cuenta) {
                            if (medicamento.getNombre().equals(med.getNombre())) {
                                medicamento.setcant(aux);
                                this.setCapacidad(0);
                                med.setcant(med.getCantidad() + this.getCapacidad());
                            }
                        }
                    } else {
                        cuenta.add(new Medicamento(medicamento.getNombre(), aux));
                        medicamentos.add(medicamento.getNombre());
                        this.setCapacidad(0);
                    }
                } else {
                    cuenta.add(new Medicamento(medicamento.getNombre(), 100));
                    medicamento.setcant(aux);
                    this.setCapacidad(0);
                }
            }
        }
    }
    public int cantidadMedicamento() {
        return 100 - capacidad;
    }
    public int verificar(String nombre, int cantidad){
        cuenta.removeIf(medicamento -> medicamento.getCantidad() == 0);
        int aux = cantidad;
        for(Medicamento medicamento : cuenta){
            if(medicamento.getNombre().equals(nombre)){
                if(medicamento.getCantidad() >= cantidad){
                    medicamento.setcant(medicamento.getCantidad() - cantidad);
                    setCapacidad(getCapacidad() + cantidad);
                } else {
                    aux = cantidad - medicamento.getCantidad();
                    setCapacidad(getCapacidad() + medicamento.getCantidad());
                    medicamento.setcant(0);
                }
            }
        }
        cuenta.removeIf(medicamento -> medicamento.getCantidad() == 0);
        return aux;
    }

    @Override
    public String toString(){
        return "Cantidad de medicamento: " + cantidadMedicamento() + "\n" +
                "Codigo: " + getCodigo() + "\n" +
                "Capacidad: " + getCapacidad() + "\n" +
                "Medicamento: " + cuenta.size() + "\n" +
                "Nombre de medicamentos: " + medicamentos + "\n" +
                "-----------------------------------------";
        }
    }
