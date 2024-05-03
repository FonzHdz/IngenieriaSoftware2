package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PorcesadorImagen procesador = new PorcesadorImagen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la imagen a procesar");
        String imagen = scanner.nextLine();
        System.out.println("Seleccione una opcion de filtro (1: Alto Contraste, 2: Escala de grices, 3: Sepia)");
        String eleccion = scanner.nextLine();
        switch (eleccion){
            case "1":
                procesador.setEstrategia(new EstrategiaFiltroAltoContraste());
                break;
            case "2":
                procesador.setEstrategia(new EstrategiaFiltroEscalaGrices());
                break;
            case "3":
                procesador.setEstrategia(new EstrategiaFiltroSepia());
                break;
            default:
                System.out.println("Opcion incorrecta");
                return;
        }

        String resultado = procesador.ejecutarEstrategia(imagen);

        System.out.println(resultado);

    }
}