package gestorAplicacion;

import java.util.LinkedList;

import static uiMain.Interfaz.empleados;

public class Vehiculo {
        private String Placa;
        private String Modelo;
        private int Encargado;
        private boolean dispo; //disponibilidad del vehículo
        private LinkedList<Pedido> pedidoM = new LinkedList<>();
        private String direntrega;

        public Vehiculo(String placa, String modelo, int empleado) {
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
            for (Empleado empleado : empleados) {
                if (Encargado == empleado.getDocumento()) {
                    return empleado;
                }
            }
            return null;
        }

        public boolean getDisponibilidad(){return dispo;}


        //Setters
        public void setPlaca(String placa) {
            this.Placa = placa;
        }
        public void setModelo(String modelo) {
            this.Modelo = Modelo;
        }
        public void setEncargado(int Encargado) {
            this.Encargado = Encargado;
        }
        public void cambioDisponibilidad(int dis){ //Disponibilidad del vehículo
            if(dis==0){this.dispo=false;}
            else if(dis==1){this.dispo=true;}
            }


        public void entrega(String direccion, LinkedList pedidos, String vehiculo){
            this.direntrega = direccion;
            this.pedidoM = pedidos;
            this.Placa = vehiculo;
            this.dispo = false;
        }
        public void entregacheck(){
            this.dispo = true;
        }
    }
