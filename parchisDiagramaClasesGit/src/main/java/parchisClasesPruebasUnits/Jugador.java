/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador 
{

	private String nombre;
	private Tablero tablero;
	
	public Jugador(String nombre, Tablero tablero) 
	{
		
		this.nombre = nombre;
		this.tablero = tablero;
		
	}
	
	public void tirarDado(Dado d) 
	{
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) 
	{
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() 
	{
		
		boolean[] casillas = tablero.consultarCasillas(); // metodo consultarCasilla es getter y devuelve array de booleanos
		
		int posicion = 0; // posicion de ficha es true y el resto es false
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) 
		{
			
			if (casillas[i]==true) 
			{
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int cs) 
	{
		
		int origen = consultarTablero();
		tablero.cambiarFicha(origen, origen+cs);;
		
	}
	
	public String getNombre()
	{
		
		return nombre;
		
	}
	
}
