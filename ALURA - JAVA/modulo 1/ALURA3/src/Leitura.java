import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = s.nextLine();
        System.out.println("Qual foi o ano de lancamento?");
        int ano = s.nextInt();
        System.out.println("Qual avalição do filme: ");
        double avaliacao = s.nextDouble();
        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
        s.close();
    }
}
