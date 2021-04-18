package gestorAplicacion;
import java.util.Scanner;


public class Farmaceutico extends Persona{
    String contraseña;

    public static Scanner input = new Scanner(System.in);

    public Farmaceutico(String nombre, int edad, int documento, String contraseña) {
        super(nombre, edad, documento);
        this.contraseña = contraseña;
    }
}
