import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Samuel", 19);
        Pessoa p2 = new Pessoa("Miguel", 20);
        Pessoa p3 = new Pessoa("Julio cesar", 20);

        lstPessoas.add(p1);
        lstPessoas.add(p2);
        lstPessoas.add(p3);

        System.out.println("Tamanho da lista Pessoas: " + lstPessoas.size());
        System.out.println("Primeira pessoa na lista de pessoas: " + lstPessoas.get(0).getNome() + " - Sua idade: " + lstPessoas.get(0).getIdade());
        System.out.println("listando PESSOAS: ");
        for (Pessoa pessoa: lstPessoas){
            System.out.println(pessoa);
        }
    }
}
