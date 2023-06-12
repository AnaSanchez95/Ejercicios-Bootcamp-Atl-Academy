package Clase7;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int lower;
        int higher;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        lower = numbers[0];
        higher = numbers[0];

        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= lower) {
                lower = numbers[i];
            } else if (numbers[i] >= higher) {
                higher = numbers[i];
            }
        }
        System.out.print("Los números que ha ingesado son: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nEl número mayor es: " + higher);
        System.out.println(("El número menor es: " + lower));
    }
}
