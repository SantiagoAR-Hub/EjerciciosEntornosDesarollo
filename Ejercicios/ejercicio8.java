import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        String cadenaInvertida = "";

        // Invertir la cadena usando un bucle
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("La cadena invertida es: " + cadenaInvertida);

        scanner.close(); 
    }
}
