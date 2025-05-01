import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            if (scanner.hasNextFloat()) {
                nota = scanner.nextFloat();
                if (nota >= 0 && nota <= 10) {
                    System.out.println("Nota válida: " + nota);
                    break;
                } else {
                    System.out.println("Valor inválido. A nota deve estar entre 0 e 10.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); // descarta a entrada inválida
            }
        }

        scanner.close();
    }
}
