package uiMain;

import gestorAplicacion.Abstracto.Vehiculo;
import gestorAplicacion.Heredados.*;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

import static gestorAplicacion.Heredados.Cliente.clientes;


public class Interfaz {
    public static Farmaceutico farmaceuticoLogueado = new Farmaceutico(null, 0, 0, null);
    public static LinkedList<Farmaceutico> farmaceuticos = new LinkedList<>();
    public static LinkedList<Empleado> empleados = new LinkedList<>();
    public static LinkedList<Proveedor> proveedores = new LinkedList<>();
    public static LinkedList<Nevera> neveras = new LinkedList<>();
    public static LinkedList<Vehiculo> vehiculos = new LinkedList<>();
    public static LinkedList<Medicamento> medicamentosTotales = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    public static LinkedList<Medicamento> pedidos = new LinkedList<>();


    public static void main(String[] args) {
//deserializar
        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempFarmaceutico.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            try {
                Object obj = in.readObject();

                while (obj != null) {
                    farmaceuticos.add((Farmaceutico) obj);
                    obj = in.readObject();

                }
            } catch (EOFException e) {
            }
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn2;
        try {
            fileIn2 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempEmpleado.txt");
            ObjectInputStream in2 = new ObjectInputStream(fileIn2);



            try {
                Object obj = in2.readObject();

                while (obj != null) {
                    empleados.add((Empleado) obj);
                    obj = in2.readObject();

                }
            } catch (EOFException e) {

            }

            in2.close();
            fileIn2.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn3;
        try {
            fileIn3 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempProveedor.txt");
            ObjectInputStream in3 = new ObjectInputStream(fileIn3);



            try {
                Object obj = in3.readObject();

                while (obj != null) {
                    proveedores.add((Proveedor) obj);
                    obj = in3.readObject();

                }
            } catch (EOFException e) {

            }

            in3.close();
            fileIn3.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn4;
        try {
            fileIn4 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempNeveras.txt");
            ObjectInputStream in4 = new ObjectInputStream(fileIn4);



            try {
                Object obj = in4.readObject();

                while (obj != null) {
                    neveras.add((Nevera) obj);
                    obj = in4.readObject();

                }
            } catch (EOFException e) {

            }

            in4.close();
            fileIn4.close();


        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn5;
        try {
            fileIn5 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempMedicamentosTotales.txt");
            ObjectInputStream in5 = new ObjectInputStream(fileIn5);



            try {
                Object obj = in5.readObject();

                while (obj != null) {
                    medicamentosTotales.add((Medicamento) obj);
                    obj = in5.readObject();

                }
            } catch (EOFException e) {

            }

            in5.close();
            fileIn5.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn6;
        try {
            fileIn6 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempPedidos.txt");
            ObjectInputStream in6 = new ObjectInputStream(fileIn6);



            try {
                Object obj = in6.readObject();

                while (obj != null) {
                    pedidos.add((Medicamento) obj);
                    obj = in6.readObject();

                }
            } catch (EOFException e) {

            }

            in6.close();
            fileIn6.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        FileInputStream fileIn7;
        try {
            fileIn7 = new FileInputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempClientes.txt");
            ObjectInputStream in7 = new ObjectInputStream(fileIn7);



            try {
                Object obj = in7.readObject();

                while (obj != null) {
                    clientes.add((Cliente) obj);
                    obj = in7.readObject();

                }
            } catch (EOFException e) {

            }

            in7.close();
            fileIn7.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

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
            System.out.println("3. Registro");
            System.out.println("4. Metodo4");
            System.out.println("5. Metodo4");
            System.out.println("0. Salir y cancelar");
            System.out.println("-----------------------------");
            option = input.next();
            switch (option) {
                case "1":
                    Vender();
                    break;
                case "2":
                    Inventario();
                    break;
                case "3":
                    Registro();
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

    public static void Inventario() {
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

    public static void RegistroVehiculo() {
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

    public static void RevisarInventario() {
        System.out.println("Escoja una opcion: ");
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Busqueda por codigo");
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
                nevera.reset();
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
                nevera.reset();
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
                    if (medicamentosTotales.isEmpty()) {
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
                    System.out.println(medicamentosTotales);
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
            if (neveras.getLast().getCapacidad() == 0) {
                Nevera nevera = new Nevera();
                neveras.add(nevera);
                AdministrarMedicamento();
            }
        }
    }

    private static void salirCancelar() {

        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempFarmaceutico.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            for (Farmaceutico farmaceutico : farmaceuticos) {
                out.writeObject(farmaceutico);
            }

            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut2;
        try {
            fileOut2 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempEmpleado.txt");

            ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);

            for (Empleado empleado : empleados) {
                out2.writeObject(empleado);
            }
            out2.close();
            fileOut2.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut3;
        try {
            fileOut3 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempProveedor.txt");

            ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);

            for (Proveedor proveedor : proveedores) {
                out3.writeObject(proveedor);
            }
            out3.close();
            fileOut3.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut4;
        try {
            fileOut4 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempNeveras.txt");

            ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);

            for (Nevera nevera : neveras) {
                out4.writeObject(nevera);
            }
            out4.close();
            fileOut4.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut5;
        try {
            fileOut5 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempClientes.txt");

            ObjectOutputStream out5 = new ObjectOutputStream(fileOut5);

            for (Cliente cliente : clientes) {
                out5.writeObject(cliente);
            }
            out5.close();
            fileOut5.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut6;
        try {
            fileOut6 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempPedidos.txt");

            ObjectOutputStream out6 = new ObjectOutputStream(fileOut6);

            for (Medicamento pedido : pedidos) {
                out6.writeObject(pedido);
            }

            out6.close();
            fileOut6.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        FileOutputStream fileOut7;
        try {
            fileOut7 = new FileOutputStream(System.getProperty("user.dir") + "\\src\\baseDatos\\tempMedicamentosTotales.txt");

            ObjectOutputStream out7 = new ObjectOutputStream(fileOut7);


            for (Medicamento medicamento : medicamentosTotales) {
                out7.writeObject((medicamento));
            }
            out7.close();
            fileOut7.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        while (true) {
            System.out.println("Si sale ahora se perderan los cambios sin guardar");
            System.out.println("Ingrese [N] si desea regresar al  menu principal");
            System.out.println("Ingrese [Y] si desea cerrar el programa");
            String cerrado = input.next();
            if (cerrado.equals("N") || cerrado.equals("n")) {
                System.out.println("Regresando al menu principal");
                return;
            } else if (cerrado.equals("Y") || cerrado.equals("y")) {
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
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Venta al detal");
        System.out.println("2. Venta al por mayor");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        option = input.next();
        switch (option) {
            case "1" -> VentaDetal();
            case "2" -> VentaMayor();
        }
    }

    public static void VentaDetal() {
        while (true) {
            System.out.println("Que desea comprar?");
            String option = input.next();
            System.out.println("Cantidad del producto");
            int cantidad = input.nextInt();
            int count = cantidad;
            for (Nevera nevera : neveras) {
                count = nevera.verificarCantidad(option, count);
            }
            if (count <= 0) {
                Medicamento pedido = new Medicamento(option, cantidad);
                pedidos.add(pedido);
                int aux;
                for (Nevera nevera : neveras) {
                    aux = nevera.reducir(option, cantidad);
                    cantidad = aux;
                }
            } else {
                System.out.println("No hay medicamento suficiente!");
            }
            System.out.println("Desea algo mas?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int option2 = input.nextInt();
            if (option2 == 2) {
                break;
            }
        }
        System.out.println("----------[Resumen del Pedido]-----------------");
        for (Medicamento pedido : pedidos) {
            System.out.println(pedido);
        }
        pedidos.clear();
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
                    while (true) {
                        System.out.println("que desea comprar?");
                        String option = input.next();
                        System.out.println("¿Cantidad del producto que desea llevar?");
                        int cantidad = input.nextInt();
                        int count = cantidad;
                        for (Nevera nevera : neveras) {
                            count = nevera.verificarCantidad(option, count);
                        }
                        if (count <= 0) {
                            Medicamento pedido = new Medicamento(option, cantidad);
                            pedidos.add(pedido);
                            int aux;
                            for (Nevera nevera : neveras) {
                                aux = nevera.reducir(option, cantidad);
                                cantidad = aux;
                            }
                        } else {
                            System.out.println("No hay medicamento suficiente!");
                        }
                        System.out.println("desea algo mas?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        int decision = input.nextInt();
                        if (decision == 2) {
                            break;
                        }
                    }
                    System.out.println("----------[Resumen del Pedido]-----------------");
                    for (Medicamento pedido : pedidos) {
                        System.out.println(pedido);
                    }
                    System.out.println("-----------------------------------------------");
                    System.out.println("Su pedido se enviará a la siguiente dirección: " +
                            cliente.getDireccion());
                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getDisponibilidad()) {
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

    public static void Registro() {
        String option;
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Registrar");
        System.out.println("2. Eliminar");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        option = input.next();
        switch (option) {
            case "1":
                Registrar();
                break;
            case "2":
                Eliminar();
                break;
            case "0":
                break;
        }
    }

    public static void Registrar() {
        String option;
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Empleado");
        System.out.println("2. Farmaceutico");
        System.out.println("3. Cliente");
        System.out.println("4. Proveedor");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        option = input.next();
        switch (option) {
            case "1":
                registrarEmpleado();
            case "2":
                registrarFarmaceutico();
            case "3":
                registrarCliente();
            case "4":
                RegistrarProveedor();
            case "0":
                break;
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
        if (Edad <= 18) {
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

    public static void RegistrarProveedor() {
        System.out.println("Ingrese NIT de proveedor: ");
        int NIT = input.nextInt();
        System.out.println("Ingrese nombre de proveedor: ");
        String nombre = input.next();
        System.out.println("Ingrese telefono de proveedor: ");
        long telefono = input.nextLong();
        System.out.println("Ingrese direccion de proveedor: ");
        input.nextLine();
        String direccion = input.nextLine();

        Proveedor proveedor = new Proveedor(NIT, nombre, telefono, direccion);
        proveedores.add(proveedor);
        System.out.println("Proveedor registrado satisfactoriamente!!");
    }

    public static void registrarCliente() {
        System.out.print("Documento : ");
        int Documento = input.nextInt();
        input.nextLine();
        while (Documento <= 0) {
            System.out.println("Documento invalido ,ingreselo de nuevo ");
            System.out.print("Documento : ");
            Documento = input.nextInt();
        }

        System.out.print("Nombre : ");
        String Nombre = input.nextLine();
        while (Nombre.equals("")) {
            System.out.println("Nombre invalido, ingreselo de nuevo ");
            System.out.print("Nombre : ");
            Nombre = input.nextLine();
        }
        System.out.print("Direccion : ");
        String direccion = input.nextLine();
        while (direccion.equals("")) {
            System.out.println("Dirección invalida, ingresela de nuevo. ");
            System.out.print("Dirección : ");
            direccion = input.nextLine();
        }

        Cliente nuevoCliente = new Cliente(Nombre, Documento, direccion);
        clientes.add(nuevoCliente);
        System.out.println("ClIENTE REGISTRADO EXITOSAMENTE");
    }

    public static void registrarEmpleado() {
        System.out.println("Ingrese nombre de empleado: ");
        String nombre = input.next();
        System.out.println("Ingrese edad de empleado: ");
        int edad = input.nextInt();
        System.out.println("Ingrese documento de empleado: ");
        int documento = input.nextInt();
        System.out.println("Ingrese direccion de empleado: ");
        String direccion = input.next();
        System.out.println("Ingrese telefono de empleado");
        int telefono = input.nextInt();
        System.out.println("Ingrese cargo de empleado");
        String cargo = input.next();

        input.nextLine();

        Empleado empleado = new Empleado(nombre, edad, documento, direccion, telefono, cargo);
        empleados.add(empleado);
        System.out.println("Empleado registrado exitosamente");
    }

    public static void Eliminar() {
        String option;
        System.out.println("-----------------------------");
        System.out.println("Escoja una opcion:");
        System.out.println("1. Empleado");
        System.out.println("2. Farmaceutico");
        System.out.println("3. Cliente");
        System.out.println("4. Proveedor");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");
        option = input.next();
        switch (option) {
            case "1":
                eliminarEmpleado();
            case "2":
                eliminarFarmaceutico();
            case "3":
                eliminarCliente();
            case "4":
                eliminarProveedor();
            case "0":
                break;
        }
    }

    public static void eliminarFarmaceutico() {
        System.out.println("Ingrese el documento: ");
        int documento = input.nextInt();
        for (Farmaceutico farmaceutico : farmaceuticos) {
            if (farmaceutico.getDocumento() == documento) {
                farmaceuticos.remove(farmaceutico);
            } else {
                System.out.println("No se encuentra el farmaceutico!");
            }
        }
    }

    public static void eliminarEmpleado() {
        System.out.println("Ingrese el documento: ");
        int documento = input.nextInt();
        for (Empleado empleado : empleados) {
            if (empleado.getDocumento() == documento) {
                empleados.remove(empleado);
            } else {
                System.out.println("No se encuentra el empleado!");
            }
        }
    }

    public static void eliminarCliente() {
        System.out.println("Ingrese el documento: ");
        int documento = input.nextInt();
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento() == documento) {
                clientes.remove(cliente);
            } else {
                System.out.println("No se encuentra el cliente!");
            }
        }
    }

    public static void eliminarProveedor() {
        System.out.println("Ingrese el NIT del proveedor: ");
        int NIT = input.nextInt();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNIT() == NIT) {
                proveedores.remove(proveedor);
            } else {
                System.out.println("No se encuentra el proveedor!");
            }
        }
    }
}