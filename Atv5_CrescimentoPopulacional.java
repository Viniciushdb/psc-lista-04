import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            double populacaoA = lerPopulacao(scanner, "A");
            double populacaoB = lerPopulacao(scanner, "B");
            double taxaCrescimentoA = lerTaxaCrescimento(scanner, "A");
            double taxaCrescimentoB = lerTaxaCrescimento(scanner, "B");
            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA = populacaoA * (1 + taxaCrescimentoA);
                populacaoB = populacaoB * (1 + taxaCrescimentoB);
                anos++;
            }

            System.out.println("\nResultados:");
            System.out.println("População final do país A: " + String.format("%.0f", populacaoA));
            System.out.println("População final do país B: " + String.format("%.0f", populacaoB));
            System.out.println("Número de anos necessários: " + anos);

            System.out.print("\nDeseja realizar novo cálculo? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();
        } while (continuar == 'S');

        scanner.close();
    }

    private static double lerPopulacao(Scanner scanner, String pais) {
        double populacao;
        do {
            System.out.print("Digite a população do país " + pais + ": ");
            populacao = scanner.nextDouble();
            if (populacao <= 0) {
                System.out.println("Erro: A população deve ser maior que zero!");
            }
        } while (populacao <= 0);
        return populacao;
    }

    private static double lerTaxaCrescimento(Scanner scanner, String pais) {
        double taxa;
        do {
            System.out.print("Digite a taxa de crescimento do país " + pais + " (em %): ");
            taxa = scanner.nextDouble() / 100;
            if (taxa <= 0) {
                System.out.println("Erro: A taxa deve ser maior que zero!");
            }
        } while (taxa <= 0);
        return taxa;
    }
} 
