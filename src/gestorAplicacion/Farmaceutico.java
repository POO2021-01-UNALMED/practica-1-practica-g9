package gestorAplicacion;

public class Farmaceutico extends Persona{
    private String password;

    public Farmaceutico(String nombre, int edad, int documento, String password) {
        super(nombre,edad,documento);
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
