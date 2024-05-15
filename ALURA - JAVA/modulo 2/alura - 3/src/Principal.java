import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> lstProdutos = new ArrayList<>();
        Produto p1 = new Produto("Arroz", 29,100);
        Produto p2 = new Produto("feijão",  9.98,100);
        Produto p3 = new Produto("Arroz", 7.19,100);
        Produto p4 = new ProdutoPerecivel("Arroz", 7.19,100, "20/03/20");

        lstProdutos.add(p1);
        lstProdutos.add(p2);
        lstProdutos.add(p3);
        lstProdutos.add(p4);

        for(Produto p : lstProdutos){
            System.out.println(p);
        }
    }
}
