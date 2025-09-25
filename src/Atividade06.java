import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [5][5];
        System.out.println("Digite os elementos da matriz: ");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.println("Elemento " + linha+ "["+coluna+"]");
                matriz[linha][coluna] = sc.nextInt();
            }
        }


    }
}
