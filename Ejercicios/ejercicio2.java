import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("El primer número es: " + numero1);
        System.out.println("El segundo número es: " + numero2);
        System.out.println("La suma de ambos números es: " + (numero1 + numero2));

        scanner.close();
    }
}
