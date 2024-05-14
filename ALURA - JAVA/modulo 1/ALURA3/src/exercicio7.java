import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fatorial = 1;
        System.out.println("Digite um número: ");
        double num = s.nextDouble();
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
