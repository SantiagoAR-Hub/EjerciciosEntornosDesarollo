import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) { System.out.println("el numero es par");
            
        } else {System.out.println("el numero es impar");
            
        }
scanner.close();
       
    }


}