public class filme {
    private String nome;
    private int ano;
    public filme(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAno() + ")";
    }
}
