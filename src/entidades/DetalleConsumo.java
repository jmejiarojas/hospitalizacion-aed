package entidades;

public class DetalleConsumo {

	private int codigoConsumo;
	private int codigoProducto;
	private int cantidad;
	private double precioUnitario;
	private double SubTotal;
	
	public int getCodigoConsumo() {
		return codigoConsumo;
	}
	public void setCodigoConsumo(int codigoConsumo) {
		this.codigoConsumo = codigoConsumo;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}
	
	
}
