import java.util.Scanner;
import java.util.Random;

public class ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; 

        Scanner scanner = new Scanner(System.in);
        int intento;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. Intenta adivinarlo:");

        while (!adivinado) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("Muy bajo, intenta con un número mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Muy alto, intenta con un número menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinado = true;
            }
        }

        scanner.close();
    }
}

