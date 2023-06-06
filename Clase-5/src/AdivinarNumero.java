import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer randomNumber = Integer.valueOf((int) Math.round(Math.random() * 100));


        while (true) {
            System.out.print("Adivine el número del 1 al 100: ");
            Integer number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("¡Enhorabuena, adivinaste el número!");
                break;
            } else if (number < randomNumber) {
                System.out.println("¡Tu número es más bajo, prueba otra vez!");
            } else {
                System.out.println("!Tu número es más alto, prueba otra vez!");
            }
        };
    }
}
