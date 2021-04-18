package gestorAplicacion;

public class Farmaceutico extends Persona{
    private String contraseña;

    public Farmaceutico(String nombre, int edad, int documento, String contraseña) {
        setNombre(nombre);
        setDocumento(documento);
        setEdad(edad);
        this.contraseña = contraseña;
    }

    public String getContraseña(){
        return contraseña;
    }
}
