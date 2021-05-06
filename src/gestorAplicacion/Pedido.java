package gestorAplicacion;

public class Pedido {
    private String nombreM;
    int cantidadM;

    public Pedido(String nombreM, int cantidadM){
        this.nombreM = nombreM;
        this.cantidadM = cantidadM;
    }

    //Getters
    public String getNombreM(){
        return nombreM;
    }
    public int getCantidadM(){
        return cantidadM;
    }

    //Setters
    public void setNombreM(String nombreM){
        this.nombreM = nombreM;
    }
    public void setCantidadM(int cantidadM){
        this.cantidadM = cantidadM;
    }

    @Override
    public String toString(){
        return "Nombre medicamento: " + getNombreM() + "\n" +
                "Cantidad: " + getCantidadM() + "\n";
    }


}
