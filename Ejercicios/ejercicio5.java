import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");
        int numero = scanner.nextInt();

        System.out.println("la tabla de multiplicar del " + numero + " es:");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
            
        }

    scanner.close();
    }
   
}
