
import java.util.Scanner;

public class App {
    
    public static class Estudante {
        public String nome;
        public String email;
        
        public Estudante(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }
        
        public String toString() {
            return nome + ", " + email;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante[] quartos = new Estudante[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        sc.nextLine();  // Consumir a nova linha pendente

        for (int i = 1; i <= n; i++) {
            System.out.println("Quarto #" + i + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            sc.nextLine();  // Consumir a nova linha pendente

            quartos[quarto] = new Estudante(nome, email);
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }

        sc.close();
    }
}