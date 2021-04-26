package gestorAplicacion;

import java.util.LinkedList;

public class Vehiculo {
        private String Placa;
        private String Modelo;
        private Empleado Encargado;
        private boolean dispo; //disponibilidad del vehículo

        public Vehiculo(String placa, String modelo, Empleado empleado) {
            this.Placa = placa;
            this.Modelo = modelo;
            this.Encargado = empleado;
            this.dispo=true;
        }

        //Getters
        public String getPlaca() {
            return Placa;
        }
        public String getModelo() {
        return Modelo;
    }
        public Empleado getEncargado() {
        return Encargado;
    }   public boolean getDisponibilidad(){return dispo;}


        //Setters
        public void setPlaca(String placa) {
            this.Placa = placa;
        }
        public void setModelo(String modelo) {
            this.Modelo = Modelo;
        }
        public void setEncargado(Empleado Encargado) {
            this.Encargado = Encargado;
        }
        public void cambioDisponibilidad(int dis){ //Disponibilidad del vehículo
            if(dis==0){this.dispo=false;}
            else if(dis==1){this.dispo=true;}
            }


        public void entrega(String direccion, LinkedList medicamentos, Vehiculo vehiculo){

        }
    }
