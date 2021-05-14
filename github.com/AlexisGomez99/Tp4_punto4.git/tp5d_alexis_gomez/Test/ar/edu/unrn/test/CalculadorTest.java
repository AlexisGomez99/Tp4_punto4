package ar.edu.unrn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.unrn.modelo.Calculador;
import ar.edu.unrn.modelo.CalculadorJubilado;
import ar.edu.unrn.modelo.CalculadorNoJubilado;

public class CalculadorTest {
	
	
	@Test
	public void testJubiladoSinPromocion() {
		Calculador calculador= new CalculadorJubilado( LocalDate.now().getMonth().getValue() - 1);
		double resultado = calculador.calcularPrecio(100);
		
		Assert.assertEquals(110d, resultado, 0.01f);
	}
	
	public void testJubiladoConPromocion() {
		Calculador calculador= new CalculadorJubilado( LocalDate.now().getMonth().getValue());
		double resultado = calculador.calcularPrecio(100);
		
		Assert.assertEquals(100d, resultado, 0.01f);
	}
	
	@Test
	public void testNoJubiladoConPromocion() {
		Calculador calculador= new CalculadorNoJubilado( LocalDate.now().getMonth().getValue());
		double resultado = calculador.calcularPrecio(100);
		
		Assert.assertEquals(115d, resultado, 0.01f);
		
		
	}

	@Test
	public void testNoJubiladoSinPromocion() {
		Calculador calculador= new CalculadorNoJubilado( LocalDate.now().getMonth().getValue()- 1);
		double resultado = calculador.calcularPrecio(100);
		
		Assert.assertEquals(121d, resultado, 0.01f);
		
		
	}

}
