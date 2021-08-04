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
	public Cliente(String nombre, int documento, String direccion) {
		super(nombre,documento);
		this.direccion=direccion;

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
}
