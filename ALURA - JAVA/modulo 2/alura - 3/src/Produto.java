public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto[" + "nome: " + this.getNome() + ", preco: " + this.getPreco() + ", quantidade: " + this.getQuantidade() + ']';
    }
}
