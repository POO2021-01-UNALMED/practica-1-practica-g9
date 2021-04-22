package gestorAplicacion;

public class vehiculo {
	private int Placa;
	private String Modelo;
	private Empleado Encargado;
	
	public vehiculo {
		this.setEncargado = Encargado;
        this.placa = Placa;
		this.Modelo = Modelo;

	}
	public void setPlaca(int placa) {
		this.placa = placa;
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
	public int getModelo() {
		return Modelo;
	}
	
	public Empleado getEncargado() {
		return Encargado;
	}
	
}
}

