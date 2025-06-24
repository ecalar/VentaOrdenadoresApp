package Mundopc;

import Mundopc.modelo.Monitor;
import Mundopc.modelo.Ordenador;
import Mundopc.modelo.Raton;
import Mundopc.modelo.Teclado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear objetos.
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);

        //Crear objeto de tipo Ordenador
        Ordenador ordenadorLenovo = new Ordenador("Ordenador Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(ordenadorLenovo);
    }
}