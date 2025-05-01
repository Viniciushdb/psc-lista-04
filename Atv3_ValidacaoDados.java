import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);
        
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);
        
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);
        
        scanner.nextLine();
        
        char sexo;
        do {
            System.out.print("Digite o sexo (f/m): ");
            sexo = scanner.nextLine().toLowerCase().charAt(0);
        } while (sexo != 'f' && sexo != 'm');
        
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scanner.nextLine().toLowerCase().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && 
                 estadoCivil != 'v' && estadoCivil != 'd');
        
        System.out.println("\nDados validados com sucesso:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
        scanner.close();
    }
} 
