import java.util.Scanner;

public class DesafioNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número positivo (n): ");
        int n = scanner.nextInt();

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("\nContagem crescente de 0 até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("\nContagem decrescente de " + n + " até 0:");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nExibição do nome:");
        if (nome.length() > 6) {
            for (int i = 0; i < n; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println(nome);
        }

        scanner.close();
    }
}