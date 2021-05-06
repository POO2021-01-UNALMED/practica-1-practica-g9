package gestorAplicacion;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Cliente.registrarCliente;
import static uiMain.Interfaz.bodegas;

public class Venta {
    public static LinkedList<Venta> ventas = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    private Cliente cliente;
    Farmaceutico farmaceutico;
    public static LinkedList<String> drogasDetal = new LinkedList<>();
    public static LinkedList<Integer> drogasMayor = new LinkedList<>();
    public static LinkedList<Integer> cantidades = new LinkedList<>(); //lista paralela con las cantidades de cada producto



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
                    VentaMayor();
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
                    drogasDetal.add(option);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.next();
                        drogasDetal.add(option);
                        System.out.println("¿Cantidad del producto que desea llevar?");
                        cantidad = input.nextInt();
                        cantidades.add(cantidad);
                        System.out.println("desea algo mas?");
                        System.out.println("(escriba si o no)");
                        option2 = input.next();
                    }
                }
            }
        }
        System.out.println("ingrese direccion de la bodega");
        input.nextLine();
        String direccion = input.nextLine();
// esto de aqui abajo esta en via de desarrollo porque no funciona (imprime 900 cosas) , no lo usen aun , pls UwU
        for (Bodega bodega1 : bodegas) {
            if (bodega1.getUbicacion().equals(direccion)) {
                for(Nevera nevera1: bodega1.recorrerNeveras()){
                    for(Medicamento medicamento1: nevera1.recorrerMedicamentos()){
                        for(String string1:drogasDetal ){
                                if(medicamento1.getNombre().contains(string1)){
                                    //verificar cantidad
                                    //si si mostrar que si disponibilidad
                                }
                                else{
                                    System.out.println("no hay disponibilidad");
                                }

                        }
                    }
                }
            }


        }
    }

    public static void VentaMayor() {
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
                    int option = input.nextInt();
                    System.out.println("¿Cantidad del producto que desea llevar?");
                    int cantidad = input.nextInt();

                    cantidades.add(cantidad);
                    drogasMayor.add(option);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.nextInt();
                        drogasMayor.add(option);
                        System.out.println("¿Cantidad del producto que desea llevar?");
                        cantidad = input.nextInt();
                        cantidades.add(cantidad);
                        System.out.println("desea algo mas?");
                        System.out.println("(escriba si o no)");
                        option2 = input.next();
                    }
                    ResumenVenta(drogasMayor, cantidades);
                    System.out.println("Su pedido se enviará a la siguiente dirección: " +
                            cliente.getDireccion());
                    //entrega(cliente.getDireccion(), drogas, cantidades, vehiculo.placa);

                }
            }

        }
        System.out.println(cantidades);
        System.out.println(drogasMayor);
    }

    public static String ResumenVenta(LinkedList drogas, LinkedList cantidades) {
        Iterator it = drogas.iterator();
        Iterator ite = cantidades.iterator();
        while(it.hasNext() && ite.hasNext()){
            return it.next()+" "+ite.next();
        }
        return null;
    }
}







