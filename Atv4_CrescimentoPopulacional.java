public class CrescimentoPopulacional {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA = populacaoA * (1 + taxaCrescimentoA);
            populacaoB = populacaoB * (1 + taxaCrescimentoB);
            anos++;
        }

        System.out.println("População final do país A: " + String.format("%.0f", populacaoA));
        System.out.println("População final do país B: " + String.format("%.0f", populacaoB));
        System.out.println("Número de anos necessários: " + anos);
    }
} 
