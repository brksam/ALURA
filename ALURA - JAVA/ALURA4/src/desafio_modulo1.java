import java.util.Scanner;

public class desafio_modulo1 {
    public static void main(String[] args) {
        String nome = "Samuel";
        String tipoConta = "Corrente";
        double saldo = 2500;

        Scanner s = new Scanner(System.in);
        System.out.println("************************");
        System.out.println("Dados Iniciais do cliente: ");

        System.out.println("Nome:              " + nome);
        System.out.println("Tipo da conta:     " + tipoConta);
        System.out.println("Saldo inicial:     R$ " + saldo);
        System.out.println("************************");
        int opcao;
        do {
            System.out.println("Operações");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir valor");
            System.out.println("0 - sair");
            System.out.println(" ");
            System.out.println("Digite a opção desejada");
            opcao = s.nextInt();

             if (opcao == 1){
                 System.out.println("O saldo atual da sua conta é: R$ "+ saldo);
             }else if (opcao == 2){
                 System.out.println("Valor a receber: ");
                 double valorReceber = s.nextDouble();
                 saldo += valorReceber;
                 System.out.println("Saldo atualizado: R$ " + saldo);
             } else if (opcao == 3) {
                 System.out.println("Valor a transferir: ");
                 double valorTransferir = s.nextDouble();
                 if (valorTransferir > saldo){
                     System.out.println("saldo insuficiente!");
                 }else {
                     saldo -= valorTransferir;
                     System.out.println("Saldo atualizado: R$ " + saldo);
                 }
             } else if (opcao == 0) {
                 System.out.println("Obrigado por entrar.");
             } else {
                 System.out.println("Número Ínvalido");
             }
        } while (opcao != 0);
        s.close();
    }
}
