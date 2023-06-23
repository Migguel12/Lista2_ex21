import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int valorSaque;

        System.out.print("Digite o valor que deseja sacar (entre 10 e 600 reais): ");
        valorSaque = ler.nextInt();
        System.out.println("");

        ler.close();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor inválido. O valor mínimo de saque é de 10 reais e o máximo é de 600 reais.");
            return;
        }

        int[] notasDisponiveis = {100, 50, 10, 5, 1};
        int[] quantidadeNotas = new int[5];

        for (int i = 0; i < notasDisponiveis.length; i++) {
            quantidadeNotas[i] = valorSaque / notasDisponiveis[i];
            valorSaque %= notasDisponiveis[i];
        }

        System.out.println("Quantidade de notas fornecidas:");
        for (int i = 0; i < notasDisponiveis.length; i++) {
            System.out.println(notasDisponiveis[i] + " reais: " + quantidadeNotas[i] + " nota(s)");
        }
    }
}
