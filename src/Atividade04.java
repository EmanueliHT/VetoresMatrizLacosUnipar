import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("Digite os valores da matriz: ");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Elemento " + linha + "[" + coluna + "]: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        System.out.println("Matriz 4x4:");
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matriz[linha][coluna] + " \t");

            }
            System.out.println();
        }
        System.out.println("Diagonal Principal: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha == coluna) {
                    System.out.println(matriz[linha][coluna] + "\t ");
                } else {
                    System.out.print("\t ");
                }
            }
            System.out.println();
        }
    }
}
