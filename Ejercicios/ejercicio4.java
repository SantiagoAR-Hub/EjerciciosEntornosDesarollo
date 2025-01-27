import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("ingresa un numero");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mayor es: " + numero1);
            
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("el numero mayor es: " + numero2);
            
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("el numero mayor es: " + numero3);
            
        }
        scanner.close();
  }
}
