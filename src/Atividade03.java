
import java.util.Scanner;

public class Atividade03 {
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
            System.out.println("Matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t");

            }
            System.out.println();
        }
    }
}

