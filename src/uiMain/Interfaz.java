package uiMain;
import gestorAplicacion.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Cliente.registrarCliente;


public class Interfaz {
    public static Farmaceutico farmaceuticoLogueado = new Farmaceutico(null,0,0,null);
    public static LinkedList<Farmaceutico> farmaceuticos = new LinkedList<>();
    public static LinkedList<Empleado> empleados = new LinkedList<>();
    public static LinkedList<Proveedor> proveedores = new LinkedList<>();
    public static LinkedList<Nevera> neveras = new LinkedList<>();
    public static LinkedList<Vehiculo> vehiculos = new LinkedList<>();
    public static LinkedList<Medicamento> medicamentosTotales = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    public static LinkedList<Pedido> pedidos = new LinkedList<>();


    public static void main(String[] args) {
        String option;

        
        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Bienvenido ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ingresar farmaceutico");
            System.out.println("2. Registrar farmaceutico");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.println();
            option = input.next();
            switch (option) {
                case "1":
                    ingresarFarmaceutico();


                    break;
                case "2":
                    registrarFarmaceutico();


                    break;
                case "0":
                    break label;
            }
        }
    }

    public static void registrarFarmaceutico() {
        //Registro de documento farmaceutico
        System.out.print("Documento : ");
        int Documento = input.nextInt();
        input.nextLine();
        while (Documento <= 0) {
            System.out.println("Documento invalido ,ingreselo de nuevo ");
            System.out.print("Documento : ");
            Documento = input.nextInt();
        }
        //Registro de nombre farmaceutico
        System.out.print("Nombre : ");
        String Nombre = input.nextLine();
        while (Nombre.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo ");
            System.out.print("Nombre : ");
            Nombre = input.nextLine();
        }
        //Registro edad farmaceutico
        System.out.print("Edad : ");
        int Edad = input.nextInt();
        if(Edad <= 18){
            System.out.println("Edad invalida");
            return;
        }
        //Registro contraseña
        System.out.print("Contraseña : ");
        input.nextLine();
        String Password = input.nextLine();
        while (Password.equals("")) {
            System.out.println("Contraseña invalido, ingreselo de nuevo ");
            System.out.print("Contraseña: ");
            Password = input.nextLine();
        }
        //Creacion del objeto farmaceutico
        Farmaceutico nuevoFarmaceutico = new Farmaceutico(Nombre, Edad, Documento, Password);
        farmaceuticos.add(nuevoFarmaceutico);
        System.out.println("FARMACEUTICO REGISTRADO EXITOSAMENTE");
        ingresarFarmaceutico();
    }

    public static void ingresarFarmaceutico() {
        if (farmaceuticos.isEmpty()) {
            System.out.println("No hay farmaceuticos registrados!");
            System.out.println("Registre un Farmaceutico :");
            registrarFarmaceutico();
        }
        //Verificacion de documento y contraseña del farmaceutico
        System.out.println("-----------------------------");
        System.out.println("Ingresar Documento");
        System.out.println("-----------------------------");
        int DocumentoIngresado = input.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Ingresa la contraseña");
        System.out.println("-----------------------------");
        input.nextLine();
        String PasswordIngresado = input.nextLine();
        for (Farmaceutico farmaceutico : farmaceuticos) {
            if (farmaceutico.getDocumento() == DocumentoIngresado && farmaceutico.getPassword().equals(PasswordIngresado)) {
                        System.out.println("-----------------------------");
                        System.out.println("LOGUEADO CORRECTAMENTE");
                        System.out.println("logueando...................");
                        farmaceuticoLogueado = farmaceutico;
                        menuPrincipal();
                        return;
                    }
                }
            }

    public static void menuPrincipal() {
        String option;
        System.out.println("Bienvenido " + farmaceuticoLogueado.getNombre());
        label:
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Vender");
            System.out.println("2. Inventario");
            System.out.println("3. Metodo3");
            System.out.println("4. Metodo4");
            System.out.println("5. Metodo4");
            System.out.println("0. Salir y cancelar");
            System.out.println("-----------------------------");
            option = input.next();
            switch (option) {
                case "1":
                    //ventas();
                    Vender();
                    break;
                case "2":
                    //Inventaro();
                    Inventario();
                    break;
                case "3":
                    //diagnostico();
                    break;
                case "4":
                    //guardar();
                    break;
                case "0":
                    salirCancelar();
                    break label;
                }
            }
        }
    public static void Inventario(){
        System.out.println("Ingresando al Inventario, escoja una opcion: ");
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Revisar inventario");
        System.out.println("2. Recibir mercancia");
        System.out.println("3. Registrar vehiculo nuevo.");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        String option = input.next();
        switch (option) {
            case "1" ->
                    //Revisar inventario();
                    RevisarInventario();
            case "2" ->
                    //Recibir mercancia();
                    RecibirMercancia();
            case "3" ->
                    // Registrar un vehículo
                    RegistroVehiculo();
        }
    }
    public static void RegistroVehiculo(){
        System.out.println("Ingrese modelo del vehículo:");
        String Model = input.next();
        System.out.println("Ingrese las placas del vehículo: ");
        String placas = input.next();
        System.out.println("Ingrese cc del encargado: ");
        int cc = input.nextInt();
        Vehiculo vehiculo = new Vehiculo(placas, Model, cc);
        vehiculos.add(vehiculo);
        System.out.println("----VEHICULO REGISTRADO EXITOSAMENTE----");
    }
    public static void RevisarInventario(){
        System.out.println("Escoja una opcion: ");
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Busqueda por bodega");
        System.out.println("2. Busqueda total");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        String option = input.next();
        switch (option) {
            case "1" ->
                    //Busqueda por bodega;
                    BusquedaNevera();
            case "2" ->
                    //Busqueda total;
                    BusquedaTotal();
                    }
                }
    public static void BusquedaNevera() {
        if (neveras.isEmpty()) {
            System.out.println("No hay neveras registradas");
        } else {
            System.out.println("Ingrese el codigo de la nevera: ");
            input.nextLine();
            int codigo = input.nextInt();
            for (Nevera nevera : neveras) {
                if (codigo == nevera.getCodigo()) {
                    System.out.println(nevera);
                }
            }
        }
    }
    public static void BusquedaTotal() {
        if (neveras.isEmpty()) {
            System.out.println("No hay neveras registradas");
        } else {
            for (Nevera nevera : neveras) {
                    System.out.println(nevera);
                }
            }
        }

    public static void RecibirMercancia() {
        if (proveedores.isEmpty()) {
            System.out.println("Registre un proveedor!");
            RegistrarProveedor();
        }
        System.out.println("Ingrese NIT de proveedor: ");
        int NIT = input.nextInt();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT() == NIT) {
                while (true) {
                    System.out.println("Ingrese nombre de medicamento: ");
                    String nombre = input.next();
                    System.out.println("Ingrese cantidad de medicamento: ");
                    int cantidad = input.nextInt();
                    if(medicamentosTotales.isEmpty()) {
                        medicamentosTotales.add(new Medicamento(nombre, proveedor, cantidad));
                    } else {
                        boolean revision = false;
                        for (Medicamento medicamento : medicamentosTotales) {
                            if (medicamento.getNombre().equals(nombre)) {
                                medicamento.setcant(medicamento.getCantidad() + cantidad);
                                revision = true;
                                break;
                            }
                        }
                        if (!revision) {
                            medicamentosTotales.add(new Medicamento(nombre, proveedor, cantidad));
                        }
                    }
                    System.out.println("Desea solicitar otro medicamento?: ");
                    System.out.println("1. si");
                    System.out.println("2. no");
                    int decision = input.nextInt();
                    if (decision == 2) {
                        break;
                    }
                }
                AdministrarMedicamento();
            }
        }
    }

        public static void AdministrarMedicamento() {
            if (neveras.isEmpty()) {
                System.out.println("No hay neveras registradas");
                Nevera nevera = new Nevera();
                neveras.add(nevera);
                System.out.println("Se ha creado una nevera nueva...");
            }
            for (Medicamento medicamento : medicamentosTotales) {
                for (Nevera nevera : neveras) {
                    if (nevera.getCapacidad() > 0 && medicamento.getCantidad() > 0) {
                        nevera.agregarMedicamento(medicamento);
                    }
                }
                if(neveras.getLast().getCapacidad() == 0){
                    Nevera nevera = new Nevera();
                    neveras.add(nevera);
                    AdministrarMedicamento();
                }
            }
        }

    public static void RegistrarProveedor(){
        System.out.println("Ingrese NIT de proveedor: ");
        int NIT = input.nextInt();
        System.out.println("Ingrese nombre de proveedor: ");
        String nombre = input.next();
        System.out.println("Ingrese telefono de proveedor: ");
        long telefono = input.nextLong();
        System.out.println("Ingrese direccion de proveedor: ");
        input.nextLine();
        String direccion = input.nextLine();

        Proveedor proveedor = new Proveedor(NIT,nombre,telefono,direccion);
        proveedores.add(proveedor);
        System.out.println("Proveedor registrado satisfactoriamente!!");
    }

    private static void salirCancelar() {
        while(true){
            System.out.println("Si sale ahora se perderan los cambios sin guardar");
            System.out.println("Ingrese [N] si desea regresar al  menu principal");
            System.out.println("Ingrese [Y] si desea cerrar el programa");
            String cerrado = input.next();
            if (cerrado.equals("N")||cerrado.equals("n")) {
                System.out.println("Regresando al menu principal");
                return;
            }
            else if (cerrado.equals("Y")||cerrado.equals("y")) {
                System.out.println("CERRANDO PROGRAMA");
                System.exit(0);

            } else {
                System.out.println("Opcion invalida");
                System.out.println("-----------------------------");
            }
        }
    }
    public static void Vender() {
        medicamentosTotales.removeIf(medicamento -> medicamento.getCantidad() == 0);
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
                //case "1" -> VentaDetal();
                case "2" -> VentaMayor();
            }
            break;
        }
    }

    /*public static void VentaDetal() {
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
                    Pedido pedido = new Pedido(option, cantidad);
                    pedidos.add(pedido);
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.next();
                        System.out.println("¿Cantidad del producto que desea llevar?");
                        cantidad = input.nextInt();
                        Pedido pedido1 = new Pedido(option, cantidad);
                        pedidos.add(pedido1);
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
                System.out.println(bodega1.getUbicacion());
                for(Nevera nevera1: bodega1.recorrerNeveras()){
                    System.out.println(nevera1);
                    for(Medicamento medicamento1: nevera1.recorrerMedicamentos()){
                        System.out.println(medicamento1);
                        for(Pedido pedido : pedidos){
                            if(medicamento1.getNombre().equals(pedido.getNombreM()) && medicamento1.getCantidad() >= pedido.getCantidadM()){
                                System.out.println("Si hay disponibilidad");
                                break;
                            }
                            else{
                                System.out.println("no hay disponibilidad");
                            }
                        }
                    }
                }
            }
        }
    }*/

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
                    String option = input.next();
                    System.out.println("¿Cantidad del producto que desea llevar?");
                    int cantidad = input.nextInt();
                    for(Medicamento medicamento : medicamentosTotales){
                        if(medicamento.getNombre().equals(option) && medicamento.getCantidad() >= cantidad){
                            Pedido pedido1 = new Pedido(option, cantidad);
                            pedidos.add(pedido1);
                            medicamento.setcant(medicamento.getCantidad() - cantidad);
                            int aux = 0;
                            for(Nevera nevera : neveras) {
                                aux = nevera.verificar(option, cantidad) ;
                                cantidad = aux;
                            }
                        }
                    }
                    System.out.println("desea algo mas?");
                    System.out.println("(escriba si o no)");
                    String option2 = input.next();
                    while ((option2).equals("si") || option2.equals("SI") || option2.equals("Si") || option2.equals("sI")) {
                        System.out.println("que desea comprar?");
                        option = input.next();
                        System.out.println("¿Cantidad del producto que desea llevar?");
                        cantidad = input.nextInt();
                        Pedido pedido2 = new Pedido(option, cantidad);
                        pedidos.add(pedido2);
                        System.out.println("desea algo mas?");
                        System.out.println("(escriba si o no)");
                        option2 = input.next();
                    }
                    ResumenVenta(pedidos);
                    System.out.println("Su pedido se enviará a la siguiente dirección: " +
                            cliente.getDireccion());
                    for (Vehiculo vehiculo:vehiculos) {
                    if (vehiculo.getDisponibilidad()){
                        vehiculo.entrega(cliente.getDireccion(), pedidos, vehiculo.getPlaca());
                    }
                }
            } else {
                System.out.println("Usuario no encontrado." + "Registre a su cliente.");
                registrarCliente();
                }
                pedidos.clear(); //Se limpia el arreglo para una nueva venta.
            }
        }

    }

    public static String ResumenVenta(LinkedList<Pedido> pedidos) { //acá dejo el resumen de venta y creo que será compatible con los dos tipos de venta
        Iterator it = pedidos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        return null;
    }
}