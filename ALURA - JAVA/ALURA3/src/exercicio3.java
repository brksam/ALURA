import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("--- Comparação de 2 número inteiros ---");
        System.out.println("Digite o primeiro número");
        int num1 = s.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = s.nextInt();
        if (num1 == num2){
            System.out.println("Os dois números são iguais");
        }else if (num1 > num2){
            System.out.println("São diferentes");
            System.out.println(num1 + " maior que " + num2);
        }else {
            System.out.println("São diferentes");
            System.out.println(num2 + " maior que " + num1);
        }
    }
}
