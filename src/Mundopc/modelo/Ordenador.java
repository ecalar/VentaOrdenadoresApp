package Mundopc.modelo;

public class Ordenador {
    private int idOrdenador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorOrdenadores;

    private Ordenador(){
        idOrdenador = ++contadorOrdenadores;
    }

    public Ordenador(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{\n" +
                "idOrdenador=" + idOrdenador +
                ", nombre='" + nombre + '\'' +
                ", \nmonitor=" + monitor +
                ", \nteclado=" + teclado +
                ", \nraton=" + raton +
                '}';
    }
}
