import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = new Random().nextInt(100);
        int tentativas = 0;
        System.out.println("ADVINHE O NÚMERO QUE ESTOU PENSANDO DE 1 A 100 (EM ATÉ 5 TENTATIVAS)...");
        for (int i = 0; i <= 5; i++, tentativas++) {
            int numEscolhido = s.nextInt();
            if (numEscolhido == r && tentativas < 4){
                System.out.println("VOCÊ ACERTOU!!");
                break;
            }else if (numEscolhido > r && tentativas < 4){
                System.out.println("VOCÊ ERROU, O NÚMERO QUE EU ESCOLHI É MENOR");
                System.out.println("tentativas restantes: " + (5 - (i + 1)));
            } else if (numEscolhido < r && tentativas < 4) {
                System.out.println("VOCÊ ERROU, O NÚMERO QUE EU ESCOLHI É MAIOR");
                System.out.println("tentativas restantes: " + (5 - (i + 1)));
            }else {
                System.out.println("VOCÊ PERDEU HAHAHHAHAHH");
                System.out.println("O NÚMERO QUE EU ESCOLHI FOI: " + r);
                break;
            }
        }
    }
}
