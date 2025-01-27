import java.util.Scanner;
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");
        int numero = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("el factorial del numero " + numero + " es: " + factorial);




        scanner.close();   
    }
    
}
