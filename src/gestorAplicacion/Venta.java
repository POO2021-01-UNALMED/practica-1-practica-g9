package gestorAplicacion;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Cliente.registrarCliente;

public class Venta {
    public static LinkedList<Venta> ventas = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    private Cliente cliente;
    Farmaceutico farmaceutico;
    public static LinkedList<String> drogas = new LinkedList<>();
    public static LinkedList<Integer> cantidades = new LinkedList<>(); //lista paralela con las cantidades de cada producto

    private int precioTotal;

    public Venta(Cliente cliente, Farmaceutico farmaceutico, LinkedList<String> drogas, LinkedList<Integer> cantidades) {
        this.cliente = cliente;
        this.farmaceutico = farmaceutico;
        Venta.drogas = drogas;
        Venta.cantidades = cantidades;
    }

    //Getters
    public Cliente getCliente() {
        return cliente;
    }

    //Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static void Vender() {
        String option;
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Venta al detal");
            System.out.println("2. Venta al por mayor");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            option = input.next();
            switch (option) {
                case "1":
                    VentaDetal();
                    break;

                case "2":
                    //VentaMayor();
                    break;
            }
            break;
        }
    }

    public static void VentaDetal() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados!");
            System.out.println("Registre un Cliente :");
            registrarCliente();
        } else {
            System.out.println("Documento Del cliente =");
            int DocumentoCliente = input.nextInt();
            for (Cliente cliente : clientes) {
                if (cliente.getDocumento() == DocumentoCliente) {
                    System.out.println("que desea comprar?");
                    String option = input.next();
                    System.out.println("Cantidad del producto");
                    int cantidad = input.nextInt();
                    cantidades.add(cantidad);
                    drogas.add(option);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.next();
                        drogas.add(option);
                        System.out.println("desea algo mas?");
                        System.out.println("(escriba si o no)");
                        option2 = input.next();
                    }
                }
            }
        }

    }

    public void VentaPorMayor() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados!");
            System.out.println("Registre un Cliente :");
            registrarCliente();
        } else {
            System.out.println("Documento Del cliente =");
            int DocumentoCliente = input.nextInt();
            for (Cliente cliente : clientes) {
                if (cliente.getDocumento() == DocumentoCliente) {
                    System.out.println("que desea comprar?");
                    String option = input.next();
                    System.out.println("¿Cantidad del producto que desea llevar?");
                    int cantidad = input.nextInt();
                    cantidades.add(cantidad);
                    drogas.add(option);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.next();
                        drogas.add(option);
                        System.out.println("desea algo mas?");
                        System.out.println("(escriba si o no)");
                        option2 = input.next();
                    }
                    ResumenVenta(drogas, cantidades);
                    System.out.println("Su pedido se enviará a la siguiente dirección: " +
                            cliente.getDireccion());
                    //entrega(cliente.getDireccion(), drogas, cantidades, vehiculo.placa);

                }
            }

        }
    }

    String ResumenVenta(LinkedList drogas, LinkedList cantidades) {
        Iterator it = drogas.iterator();
        Iterator ite = cantidades.iterator();
        while(it.hasNext() && ite.hasNext()){
            return it.next()+" "+ite.next();
        }
        return null;
    }
}





