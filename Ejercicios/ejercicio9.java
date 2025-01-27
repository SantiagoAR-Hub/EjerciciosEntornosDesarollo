import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea promediar:");
        int cantidadNumeros = scanner.nextInt();

        double suma = 0;

        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidadNumeros; i++) {
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidadNumeros;

        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}
