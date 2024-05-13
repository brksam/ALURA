import java.util.Scanner;

public class Outroloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalNotas = 0;

        while (nota != 2) {
            System.out.println("Qual avalição do filme ou 2 para sair ");
            nota = s.nextDouble();
            if (nota != 2){
                media += nota;
                totalNotas++;
            }
        }
        System.out.println("Sua média foi: " + media/totalNotas);
    }
}
