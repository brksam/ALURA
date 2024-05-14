import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual avalição do filme: ");
            nota = s.nextDouble();
            media += nota;
        }
        System.out.println("Sua média foi: " + media/3);
    }
}
