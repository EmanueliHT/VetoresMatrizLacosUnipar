public class Atividade06 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (linha == coluna) {
                    matriz[linha][coluna] = 1;
                } else {
                    matriz[linha][coluna] = 0;
                }
            }
        }

        System.out.println("Matriz Identidade 5x5:");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
