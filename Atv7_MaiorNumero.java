import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nO maior número digitado foi: " + maior);
        scanner.close();
    }
} 
