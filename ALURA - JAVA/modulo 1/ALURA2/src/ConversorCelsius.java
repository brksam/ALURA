import java.util.Scanner;

public class ConversorCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius;
        int fahrenheit;

        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int opcao = s.nextInt();
        if (opcao == 1){
            System.out.println("Digite a temperatura (em Celsius): ");
            celsius = s.nextDouble();
            fahrenheit = (int) (celsius * 1.8) + 32;
            System.out.println("Sua temperatura em Fahrenheit: " + fahrenheit);
        }else if (opcao == 2){
            System.out.println("Digite a temperatura (em Fahrenheit): ");
            fahrenheit = s.nextInt();
            celsius = (fahrenheit -32) /1.8;
            System.out.println("Sua temperatura em Celsius: " + celsius);
        }
    }
}
