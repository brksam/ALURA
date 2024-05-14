public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                '}';
    }
}
