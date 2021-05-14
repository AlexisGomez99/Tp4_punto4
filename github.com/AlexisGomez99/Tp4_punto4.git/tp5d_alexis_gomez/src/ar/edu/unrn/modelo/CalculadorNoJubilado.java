package ar.edu.unrn.modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}
	
	@Override
	protected double mesSinPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return (precioProducto*0.21)+precioProducto;
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return (precioProducto*0.15)+precioProducto;
	}
	/*public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal += precioProducto * 0.15;
		} else {
			precioTotal += precioProducto * 0.21;
		}
		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;
	}*/
}