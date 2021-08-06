package gestorAplicacion.Heredados;

import java.util.LinkedList;

public class  Venta {
    public LinkedList<Medicamento> ventas = new LinkedList<>();
    private Cliente cliente;
    Farmaceutico farmaceutico;

    public Venta(Cliente cliente, Farmaceutico farmaceutico) {
        this.cliente = cliente;
        this.farmaceutico = farmaceutico;
    }
    public Venta(Farmaceutico farmaceutico){
        this.farmaceutico = farmaceutico;
    }
    public void agregarMedicamento(LinkedList<Medicamento> medicamentos){
        ventas.addAll(medicamentos);
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "Farmaceutico: " + farmaceutico.getNombre() + "CC: " + farmaceutico.getDocumento() + "\n" +
                "Medicamentos: " + ventas;
    }
}







