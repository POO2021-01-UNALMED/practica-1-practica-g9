package gestorAplicacion;

import java.util.LinkedList;
import java.util.Scanner;


public class Cliente extends Persona {
	public static LinkedList<Cliente> clientes = new LinkedList<>();
	private String direccion;
	private int telefono;
	public static Scanner input = new Scanner(System.in);
	public Cliente(String nombre, int edad, int documento, String direccion, int telefono) {
		super(nombre,edad,documento);
        this.direccion = direccion;
		this.telefono = telefono;
	}
	public Cliente(String nombre, int documento) {
		super(nombre,documento);

	}
	//Getters
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}

	//Setters
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
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

		Cliente nuevoCliente = new Cliente(Nombre,Documento);
		clientes.add(nuevoCliente);
		System.out.println("ClIENTE REGISTRADO EXITOSAMENTE");
	}
}
