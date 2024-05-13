import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num = s.nextInt();
        if (num % 2 == 0){
            System.out.println("Esté número é par");
        } else if ((num % 2 != 0)){
            System.out.println("Esté número é ímpar");
        }
    }
}
