import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cuenta total de un restaurante: ");
        Double bill = scanner.nextDouble();
        System.out.print("Ingresa el porcetanje de propina que desea dejar: ");
        Double tipPercentage = scanner.nextDouble();

        Double totalTip = bill * (tipPercentage/100);
        System.out.println("La cantidad de propina a dejar es de " + totalTip + " dólares.");

    }
}
