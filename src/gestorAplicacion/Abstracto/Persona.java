package gestorAplicacion.Abstracto;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private int documento;

    public Persona(String nombre, int edad, int documento){
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }
    public Persona(String nombre, int documento) {
        this.nombre=nombre;
        this.documento=documento;
    }

    //Getters
    public int getDocumento(){
        return documento;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDocumento(int documento){
        this.documento = documento;
    }



}
