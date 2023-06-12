package Clase5;

import java.util.Scanner;

public class ConversorMillasKilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una distancia en millas: ");
        Integer miles = scanner.nextInt();

        Double kilometres = miles * 1.60934;
        System.out.println(miles + " millas son " + kilometres + " kilómetros.");
    }
}
