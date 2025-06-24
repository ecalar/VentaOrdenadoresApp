package Mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //Constructor privado.
    private Monitor(){
        idMonitor = ++contadorMonitores;

    }
    //Constructor publico.
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
