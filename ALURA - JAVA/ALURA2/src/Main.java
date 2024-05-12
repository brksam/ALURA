public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Jogos Vorazes");

        int anoDelancamento = 2012;
        System.out.println("Ano do lançamento: " + anoDelancamento);

        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.printf("Média das Avaliações: %.2f \n", media);

        // 3 ASPAS (DUPLAS) COMENTA EM BLOCO
        String sinopse = """ 
                Sinopse: Na região antigamente conhecida como América do Norte, a Capital de Panem controla 12 distritos e 
                os força a escolher um garoto e uma garota, conhecidos como tributos, para competir em um 
                evento anual televisionado. Todos os cidadãos assistem aos temidos jogos, no qual os jovens 
                lutam até a morte, de modo que apenas um saia vitorioso. A jovem Katniss Everdeen, do Distrito 
                12, confia na habilidade de caça e na destreza com o arco, além dos instintos aguçados, 
                nesta competição mortal.
                """;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2); // CASTING (TRANSFORMAR UM TIPO)
        System.out.println(classificacao);
    }
}
