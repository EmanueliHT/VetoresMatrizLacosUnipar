import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[10];
        Scanner ler = new Scanner(System.in);
        int maior = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 1 número: ");
            numeros[i] = ler.nextInt();



            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 1 número: ");
            numeros[i] = ler.nextInt();



            if (numeros[i] > maior) {
                maior = numeros[i];
            }

        }
        System.out.println("O maior número é: " + maior);
        System.out.println(maior);


    }
}
