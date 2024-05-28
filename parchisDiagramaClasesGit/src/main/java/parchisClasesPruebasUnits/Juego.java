/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Juego {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Usuario persona1 = new Usuario("Mikel", "persona1", tablero);
        Usuario persona2 = new Usuario("Maitane", "persona2", tablero);

        Usuario[] jugadores = {persona1, persona2};
        int turno = 0;

        do {
            Usuario jugadorActual = jugadores[turno % 2];
            System.out.println(jugadorActual.getNombre() + " tira los dados.");

            jugadorActual.tirarDado(dado1);
            jugadorActual.tirarDado(dado2);

            int tirada = jugadorActual.consultarDado(dado1) + jugadorActual.consultarDado(dado2);
            System.out.println("Ha salido el " + tirada);

            int numFicha = turno % 2; // Alterna entre ficha 0 y ficha 1
            jugadorActual.moverFicha(numFicha, tirada);

            System.out.println("La ficha " + numFicha + " de " + jugadorActual.getNombre() + " esta en la casilla " + jugadorActual.consultarTablero(numFicha));

            turno++;
        } while (persona1.consultarTablero(0) < tablero.consultarNumCasillas() && persona1.consultarTablero(1) < tablero.consultarNumCasillas() &&
                 persona2.consultarTablero(0) < tablero.consultarNumCasillas() && persona2.consultarTablero(1) < tablero.consultarNumCasillas());

        System.out.println("Fin del juego");
    }
}