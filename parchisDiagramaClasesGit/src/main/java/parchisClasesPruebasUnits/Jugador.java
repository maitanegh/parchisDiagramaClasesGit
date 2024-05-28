/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador {
    private String nombre;
    private Tablero tablero;
    private Ficha[] fichas;

    public Jugador(String nombre, Tablero tablero) {
        this.nombre = nombre;
        this.tablero = tablero;
        this.fichas = new Ficha[2];
        this.fichas[0] = new Ficha();
        this.fichas[1] = new Ficha();
    }

    public void tirarDado(Dado d) {
        d.tirar();
    }

    public int consultarDado(Dado d) {
        return d.mostrarTirada();
    }

    public int consultarTablero(int numFicha) {
        return fichas[numFicha].getPosicion();
    }

    public void moverFicha(int numFicha, int cs) {
        int origen = consultarTablero(numFicha);
        fichas[numFicha].mover(cs);
        int destino = fichas[numFicha].getPosicion();
        tablero.cambiarFicha(origen, destino);
    }

    public String getNombre() {
        return nombre;
    }
}