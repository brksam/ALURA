import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("--- TABUADA ---");
        System.out.println("Digite o número que deseja saber a tabuada: ");
        int num = s.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%d * %d = %d", num, i + 1, num * (i + 1)));
        }
    }
}
