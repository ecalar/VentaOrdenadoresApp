package servicio;

import Mundopc.modelo.Ordenador;

import java.util.ArrayList;
import java.util.List;


public class Orden {
    private final int idOrden;
    private final List<Ordenador> ordenadores;
    private static int contadorOrdenes;

    public Orden(){
        ordenadores = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregarOrdenador(Ordenador ordenador){
        ordenadores.add(ordenador);
    }

    public void mostrarOrden(){
        System.out.println("Orden #: "  + idOrden);
        System.out.println("Total ordenadores: " + ordenadores.size());
        System.out.println();
        ordenadores.forEach(System.out::println);
    }

}
