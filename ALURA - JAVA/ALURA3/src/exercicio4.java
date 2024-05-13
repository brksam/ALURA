import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        System.out.println("1. Calcular a área do quadrado");
        System.out.println("2. Calcular a área do círculo");
        opcao = s.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double lado = s.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                double raio = s.nextDouble();
                double areaCirculo = 3.14 * (raio *  raio);
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
                System.out.println("valor ínvalido");
                break;
        }
    }
}
