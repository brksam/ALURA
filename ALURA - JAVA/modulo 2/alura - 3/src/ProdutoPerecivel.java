public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade){
        super(nome,preco,quantidade);
        this.dataValidade = dataValidade;

    }
    public String getDataValidade() {
        return dataValidade;
    }
    @Override
    public String toString() {
        return "Produto[" + "nome: " + this.getNome() + ", preco: " + this.getPreco() + ", quantidade: " + this.getQuantidade() +
                ", data de vencimento: "+ this.getDataValidade() + ']';
    }
}
