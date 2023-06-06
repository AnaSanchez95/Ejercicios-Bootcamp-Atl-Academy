import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        Double originalPrice = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: ");
        Double discount = scanner.nextDouble();

        Double finalPrice = originalPrice - (originalPrice * discount / 100);
        System.out.println("El precio final del producto es de " + finalPrice + " dólares.");
    }
}
