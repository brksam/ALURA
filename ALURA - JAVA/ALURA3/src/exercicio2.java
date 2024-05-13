import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo: ");
        int num = s.nextInt();
        if (num > 0){
            System.out.println("Número positivo");
        } else if (num < 0) {
            System.out.println("Número negativo");
        }else {
            System.out.println("Número Ínvalido");
        }
    }
}
