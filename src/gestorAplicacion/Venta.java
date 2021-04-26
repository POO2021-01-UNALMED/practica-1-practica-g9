package gestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Cliente.registrarCliente;

public class Venta {
    public static LinkedList<Venta> ventas = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    private Cliente cliente;
    private Farmaceutico farmaceutico;
    public static LinkedList<String> drogas = new LinkedList<>();
    private int precioTotal;

    public Venta(Cliente cliente, Farmaceutico farmaceutico, LinkedList drogas) {
        this.cliente = cliente;
        this.farmaceutico = farmaceutico;
        this.drogas = drogas;
    }

    public Cliente getCliente() {
        return cliente;
    }

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
                System.out.println("aparezco");
                System.out.println(cliente.getDocumento());
                if (cliente.getDocumento() == DocumentoCliente) {

                        System.out.println("que desea comprar?");
                       String option = input.next();
                        drogas.add(option);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                        String option2 = input.next();
                        while(option2.equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                            System.out.println("que desea comprar?");
                            option = input.next();
                            drogas.add(option);
                            System.out.println("desea algo mas?");
                            System.out.println("(escriba si o no)");
                         option2 = input.next();
                        }
                        /*if( verificarDisponibilidad()isTrue){
                    retirarDeStock();

                       }
                       else{
                       sout("no hay medicamento disponible para vender")
                       }
                         */



                        }
                    }
                }


            }


        }




