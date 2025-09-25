import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Digite os valores da matriz: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento " + linha + "[" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        mostrarMatriz(matriz);
        somarMatriz(matriz);

    }

    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("Matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");

            }
            System.out.println();
        }

    }

    public static void somarMatriz(int[][] matriz) {

        for (int linha = 0; linha < 3; linha++) {

            int soma = 0;

            for (int coluna = 0; coluna < 3; coluna++) {
                soma =  soma + matriz[linha][coluna];
            }

            System.out.println("Soma da linha " + linha + " é " + soma);

        }

    }

}



