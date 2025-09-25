import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = ' ';
            }
        }

        boolean jogador = true;


        System.out.println("Tabuleiro Inicial:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("[" + tabuleiro[linha][coluna] + "]");
            }
            System.out.println();
        }


        System.out.print("Linha (0-2): ");
        int linha = sc.nextInt();
        System.out.print("Coluna (0-2): ");
        int coluna = sc.nextInt();

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
            System.out.println("Posição inválida! Você perde a vez.");
        } else {
            tabuleiro[linha][coluna] = jogador ? 'X' : 'O';
            jogador = !jogador;
        }


        System.out.println("Tabuleiro Final:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println("Fim de jogo!");
        sc.close();
    }
}



