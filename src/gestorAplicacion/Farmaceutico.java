package gestorAplicacion;

public class Farmaceutico extends Persona{
    private String password;

    public Farmaceutico(String nombre, int edad, int documento, String password) {
        super(nombre,edad,documento);
        this.password = password;
    }

    //Getters
    public String getPassword(){
        return password;
    }

    //Setters
    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "Nombre: " + getNombre() +" Edad: " + getEdad() +" Documento: " + getDocumento() +" password: " + getPassword() ;
    }
}
