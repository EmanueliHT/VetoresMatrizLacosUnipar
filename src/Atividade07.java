import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz= new int[3][2];
        int [][]transposta=new int[2][3];
        System.out.println("Digite o valor da matriz 3x2: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.println("Matriz: " + linha + " coluna:  " + coluna);
                matriz[linha][coluna]=sc.nextInt();
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                transposta [coluna][linha] = matriz[linha][coluna];
            }
        }
        System.out.println("Matriz 3x2: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriz transposta 2x3: ");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(transposta[linha][coluna]+" ");

            }
            System.out.println();
        }
    }
}
