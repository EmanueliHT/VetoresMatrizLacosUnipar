import java.util.Random;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        int[] numero = new int[15];
        Random ler = new Random(System.in);

        for (int i = 0; i < numero.length; i++){
            numero[i] = ler.nextInt(100)+1;

        }

    }
}
