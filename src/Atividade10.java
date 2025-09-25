import java.util.Scanner;
import java.util.Random;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char[][] mar = new char[7][7];

        for (int linha = 0; linha < 7; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                mar[linha][coluna] = '-';
            }
        }

        int navios = 3;
        int encontrados = 0;
        while (navios > 0) {
            int linhaNavio = rand.nextInt(7);
            int colunaNavio = rand.nextInt(7);
            if (mar[linhaNavio][colunaNavio] != 'N') {
                mar[linhaNavio][colunaNavio] = 'N';
                navios--;
            }
        }

        System.out.println("Batalha Naval! Tente acertar os 3 navios.");

        while (encontrados < 3) {
            System.out.print("Digite linha (0-6): ");
            int linha = sc.nextInt();
            System.out.print("Digite coluna (0-6): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 6 || coluna < 0 || coluna > 6) {
                System.out.println("Posição inválida!");
                continue;
            }

            if (mar[linha][coluna] == 'N') {
                System.out.println("Acertou!");
                mar[linha][coluna] = 'X';
                encontrados++;
            } else if (mar[linha][coluna] == '-') {
                System.out.println("Água!");
                mar[linha][coluna] = 'O';
            } else {
                System.out.println("Já tentou essa posição!");
            }

            for (int linhaExib = 0; linhaExib < 7; linhaExib++) {
                for (int colunaExib = 0; colunaExib < 7; colunaExib++) {
                    char mostrar = (mar[linhaExib][colunaExib] == 'N') ? '-' : mar[linhaExib][colunaExib];
                    System.out.print(mostrar + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Parabéns! Você acertou todos os navios!");
        sc.close();
    }
}
