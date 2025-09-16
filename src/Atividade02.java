import java.util.Random;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        int[] numeros = new int[15];
        Random random = new Random();


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }


        System.out.println("Números gerados: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }



        System.out.println("Números pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("Números ímpares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
