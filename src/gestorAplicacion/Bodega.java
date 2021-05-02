package gestorAplicacion;

import java.util.LinkedList;

public class Bodega {
    private String ubicacion;
    static LinkedList<Nevera> neveras = new LinkedList<>();
    static LinkedList<Estanterias> estanterias = new LinkedList<>();
    static int capacidadMax;

    public Bodega(String ubicacion){
        this.ubicacion = ubicacion;
        capacidadMax = 100;
    }

    //Getters
    public String getUbicacion(){
        return ubicacion;
    }


    //Setters
    public void setUbicacion(){
        this.ubicacion = ubicacion;
    }


    //Metodos
    public int cantidadNeveras() {
        if (neveras.size() == 0) {
            return 0;
        } else {
            return neveras.size();
        }
    }
    public int cantidadEstanterias() {
        if (estanterias.size() == 0) {
            return 0;
        } else {
            return estanterias.size();
        }
    }
    public int cantidadTotalMedicamento(){
        int MedicamentoN = 0;
        int MedicamentoE = 0;
        if(neveras.isEmpty()){
            MedicamentoN += 0;
        } else {
            for (Nevera nevera : neveras) {
                MedicamentoN += nevera.cantidadMedicamento();
            }
        }
        if(estanterias.isEmpty()){
            MedicamentoE += 0;
        } else {
            for (Estanterias estanteria : estanterias) {
                MedicamentoE += estanteria.cantidadMedicamento();
            }
        }
        return MedicamentoE + MedicamentoN;
    }

    public void repartirNeveras(Medicamento medicamento){
        if(neveras.isEmpty()){
            Nevera nevera = new Nevera();
            neveras.add(nevera);
        }
        for(Nevera nevera1 : neveras){
            if(nevera1.getCapacidad() > 0){
                nevera1.agregarMedicamento(medicamento);
                }
            }
        if(neveras.getLast().getCapacidad() == 0){
            Nevera nevera = new Nevera();
            neveras.add(nevera);
            repartirNeveras(medicamento);
        }
    }

    public void agregarEstanteria(Estanterias estanteria){
        estanterias.add(estanteria);
        }

        //Solucionar cantidad total de medicamento
    @Override
    public String toString(){
       return "Ubicacion: " + getUbicacion() + "\n" +
        "Cantidad de neveras: " + cantidadNeveras() + "\n" +
        "Cantidad de estanterias: " + cantidadEstanterias() + "\n" +
        "Medicamento total: " + cantidadTotalMedicamento() + "\n" +
        "Capacidad maxima: " + capacidadMax + "\n" +
        "------------------------------------------------";
    }
}
