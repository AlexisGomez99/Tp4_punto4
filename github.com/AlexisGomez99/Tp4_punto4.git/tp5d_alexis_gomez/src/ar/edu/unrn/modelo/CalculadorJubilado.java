package ar.edu.unrn.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return (precioProducto*0.1)+precioProducto;
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		// TODO Auto-generated method stub
		return precioProducto;
	}
	
	/*public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (!of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal += precioProducto * 0.1;
		}
		log.log(CalculadorJubilado.class.getName());
		return precioTotal;
	}*/
}