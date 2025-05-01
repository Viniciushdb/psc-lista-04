import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 5;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println("\nResultados:");
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        
        scanner.close();
    }
} 
