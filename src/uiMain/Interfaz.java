package uiMain;
import java.util.Scanner;

import static gestorAplicacion.Farmaceutico.registrarUsuario;

public class Interfaz {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String option;


        label:
        while (true) {

            System.out.println("-----------------------------");
            System.out.println("Bienvenido ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Registrar usuario");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.println();
            option = input.next();
            switch (option) {
                case "1":
                    //ingresarUsuario();


                    break;
                case "2":
                    registrarUsuario();


                    break;
                case "0":
                    break label;
            }
        }
    }
}
