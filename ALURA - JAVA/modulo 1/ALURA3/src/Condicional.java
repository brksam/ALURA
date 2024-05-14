public class Condicional {
    public static void main(String[] args) {
        int anoDelancamento = 2012;
        boolean inclusoPlano = false;
        double notaDofilme = 10;
        String plano = "plus";

        if (anoDelancamento >= 2022){
            System.out.println("Lançamento novo");
        }else {
            System.out.println("filme retrô");
        }
        if (inclusoPlano  || plano.equals("plus")){
            System.out.println("Seu pacote está incluso no plano");
        }else {
            System.out.println("Plano não incluso");
        }
    }
}