import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 10 números: " );
        int numero = scanner.nextInt();


        if (numero%2==0){
            System.out.println("O número é Par "+numero);
        } else {
            System.out.println("O número é Impar "+numero);
        }
    }
}
