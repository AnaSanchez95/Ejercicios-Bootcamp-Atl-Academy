package Clase5;

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad de su perro: ");
        Integer dogAge = scanner.nextInt();

        Integer humanAge = dogAge * 7;
        System.out.println("En años humanos tu perro tiene " + humanAge + " años");

    }

}
