import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<filme> lstFilme = new ArrayList<>();
        filme f1 = new filme("os 100", 2023);
        filme f2 = new filme("teste 2", 2020);
        filme f3 = new filme("teste 3", 1950);

        lstFilme.add(f1);
        lstFilme.add(f2);
        lstFilme.add(f3);

        System.out.println(lstFilme);
    }
}
