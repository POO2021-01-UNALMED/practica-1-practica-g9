package gestorAplicacion.Heredados;

import java.util.LinkedList;
import java.util.Scanner;

public class  Venta {
    public static LinkedList<Venta> ventas = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    private Cliente cliente;
    Farmaceutico farmaceutico;
    private int precioTotal;

    public Venta(Cliente cliente, Farmaceutico farmaceutico) {
        this.cliente = cliente;
        this.farmaceutico = farmaceutico;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}







