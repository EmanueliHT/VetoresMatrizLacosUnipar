import java.util.Scanner;
public class Atividade09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[][] notas = new double[5][2];
            double[] medias = new double[5];


            for (int linha = 0; linha < 5; linha++) {
                System.out.println("Aluno " + (linha + 1));
                for (int coluna = 0; coluna < 2; coluna++) {
                    System.out.print("Nota " + (coluna + 1) + ": ");
                    notas[linha][coluna] = sc.nextDouble();
                }
                medias[linha] = (notas[linha][0] + notas[linha][1]) / 2;
            }


            System.out.println("Médias dos alunos:");
            for (int linha = 0; linha < 5; linha++) {
                System.out.println("Aluno " + (linha + 1) + ": " + medias[linha]);
            }


        }
    }


