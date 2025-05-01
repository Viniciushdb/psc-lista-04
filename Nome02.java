import java.util.Scanner;

public class Nome02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;
        
        do {
            System.out.print("Digite o nome de usuário: ");
            nome = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
            
            if (senha.equals(nome)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário!");
                System.out.println("Por favor, tente novamente.\n");
            }
        } while (senha.equals(nome));
        
        System.out.println("\nCadastro realizado com sucesso!");
        scanner.close();
    }
} 
