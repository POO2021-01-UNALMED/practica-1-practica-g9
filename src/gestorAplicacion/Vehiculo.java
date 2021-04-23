package gestorAplicacion;

public class Vehiculo {
        private String Placa;
        private String Modelo;
        private Empleado Encargado;

        public Vehiculo() {
            this.Encargado = Encargado;
            this.Placa = Placa;
            this.Modelo = Modelo;
        }
        public void setPlaca(String placa) {
            this.Placa = placa;
        }
        public void setModelo(String modelo) {
            this.Modelo = Modelo;
        }
        public void setEncargado(Empleado Encargado) {
            this.Encargado = Encargado;
        }

        public String getPlaca() {
            return Placa;
        }
        public String getModelo() {
            return Modelo;
        }
        public Empleado getEncargado() {
            return Encargado;
        }

    }
