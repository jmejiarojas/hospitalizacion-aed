package entidades;

public class Consumo {

	private int codigoConsumo;
	private int codigoPaciente;
	private String fechaConsumo;
	private double totalPagar;
	private int estado;
	
	public int getCodigoConsumo() {
		return codigoConsumo;
	}
	public void setCodigoConsumo(int codigoConsumo) {
		this.codigoConsumo = codigoConsumo;
	}
	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getFechaConsumo() {
		return fechaConsumo;
	}
	public void setFechaConsumo(String fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
