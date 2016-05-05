package entidades;

public class Cama {

	private int numero;
	private int categoria;
	private double precioDia;
	private int estado;
	
	
	
	public Cama(int numero, int categoria, double precioDia, int estado) {
		this.numero = numero;
		this.categoria = categoria;
		this.precioDia = precioDia;
		this.estado = estado;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public double getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
