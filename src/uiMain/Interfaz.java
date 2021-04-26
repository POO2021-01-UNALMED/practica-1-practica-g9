package uiMain;
import gestorAplicacion.Bodega;
import gestorAplicacion.Farmaceutico;

import java.util.LinkedList;
import java.util.Scanner;

import static gestorAplicacion.Venta.Vender;

public class Interfaz {
    public static Farmaceutico farmaceuticoLogueado = new Farmaceutico(null,0,0,null);
    public static LinkedList<Farmaceutico> farmaceuticos = new LinkedList<>();
    public static LinkedList<Bodega> bodegas = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String option;

        
        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Bienvenido ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ingresar farmaceutico");
            System.out.println("2. Registrar usuario");
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
        System.out.println("3. Registrar nueva bodega");
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
                    //Registrar nueva Bodega();
                    RegistrarBodega();
        }
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
                    BusquedaBodega();
            case "2" ->
                    //Busqueda total;
                    BusquedaTotal();
                    }
                }
    public static void BusquedaBodega() {
        if (bodegas.isEmpty()) {
            System.out.println("No hay bodegas registradas");
        } else {
            System.out.println("Ingrese la ubicacion de la bodega: ");
            input.nextLine();
            String direccion = input.nextLine();
            for (Bodega bodega : bodegas) {
                if (bodega.getUbicacion().equals(direccion)) {
                    System.out.println(bodega);
                }
            }
        }
    }
    public static void BusquedaTotal() {
        if (bodegas.isEmpty()) {
            System.out.println("No hay bodegas registradas");
        } else {
            for (Bodega bodega : bodegas) {
                    System.out.println(bodega);
                }
            }
        }

    public static void RecibirMercancia(){
        if(bodegas.isEmpty()){
            System.out.println("No hay bodegas registradas");
        } else {
            System.out.println("Ingrese la direccion de la bodega que recibira la mercancia");
            String direccion = input.nextLine();
            //Un for vacio, funcionalidad de recibir mercancia aun incompleto!!!
            /*
            for(Bodega bodega : bodegas){
                if(bodega.getUbicacion().equals(direccion)){
                    System.out.println("");
                } else {
                    System.out.println("No se encuentra la bodega con la direccion: " + direccion);
                }
            }*/
        }
    }

    public static void RegistrarBodega(){
        System.out.println("Registro de bodega");
        System.out.println("Ingrese la ubicacion de la bodega: ");
        String direccion = input.nextLine();
        while (direccion.isEmpty()){
            direccion = input.nextLine();
        }
        Bodega bodega = new Bodega(direccion);
        bodegas.add(bodega);
        System.out.println("Bodega registrada con exito!");
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
}