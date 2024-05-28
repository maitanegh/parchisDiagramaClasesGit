package parchisClasesPruebasUnits;

public class Usuario extends Jugador {
    private String nombreUsuario;

    public Usuario(String nombre, String nombreUsuario, Tablero tablero) {
        super(nombre, tablero);
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}