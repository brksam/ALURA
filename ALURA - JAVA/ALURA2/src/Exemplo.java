public class Exemplo {
    public static void main(String[] args) {
        double precoOriginal = 19.40;
        double percentualDesconto = 0.1;
        double desconto = precoOriginal * percentualDesconto;
        double valorFinal = precoOriginal - desconto;
        System.out.println(String.format("Valor final do produto foi: %.2f" ,valorFinal));
        System.out.println("Seu desconto(10%): " + desconto);
    }
}
