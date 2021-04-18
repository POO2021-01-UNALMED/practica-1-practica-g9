package gestorAplicacion;
import java.util.Scanner;


public class Farmaceutico extends Persona{

    public static Scanner input = new Scanner(System.in);
    public static void registrarUsuario() {
        System.out.print("Documento : ");

        int Documento = input.nextInt();
        String documentoString = String.valueOf(Documento);
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
        System.out.print("Apellido : ");
        String Apellido = input.nextLine();
        while (Apellido.equals("")) {
            System.out.println("Apellido invalido, ingreselo de nuevo ");
            System.out.print("Apellido: ");
            Apellido = input.nextLine();
        }
        System.out.print("Correo Electronico : ");
        String Correo = input.nextLine();
        while (Correo.equals("")) {
            System.out.println("Correo invalido, ingreselo de nuevo ");
            System.out.print("Correo: ");
            Correo = input.nextLine();
        }
        System.out.print("Contraseña : ");
        String Password = input.nextLine();
        while (Password.equals("")) {
            System.out.println("Contraseña invalido, ingreselo de nuevo ");
            System.out.print("Contraseña: ");
            Password = input.nextLine();
        }

        /*Usuario nuevoUsuario = new Usuario(documentoString, Nombre, Apellido, Correo, Password);
        usuarios.add(nuevoUsuario);


        System.out.println("USUARIO REGISTRADO EXITOSAMENTE");
        ingresarUsuario();*/


    }
}
