/**
 * 
 */
package parchisClasesPruebasUnits;

import java.util.Random;

/**
 * 
 */
public class Dado 
{
// Atributo de la clase
	private int numero; // valor por defecto es 0
	
	public void tirar() 
	{
		
		Random aleatorio = new Random();
		
		numero = aleatorio.nextInt(6)+1;
		
	}

	public int mostrarTirada() 
	{
	
		return numero;
	}
	
}
