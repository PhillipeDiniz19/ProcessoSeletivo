import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario; // Inicializa o limite restante com o limite diário

        // Loop infinito para iterar sobre os saques
        while (true) {
            double valorSaque = scanner.nextDouble();

            switch ((int) valorSaque) {
                case 0:
                    System.out.println("Transacoes encerradas.");
                    scanner.close();
                    return; // Encerra o programa
                default:
                    if (valorSaque > limiteRestante) {
                        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                        scanner.close();
                        return; // Encerra o programa
                    } else {
                        limiteRestante -= valorSaque; // Atualiza o limite restante
                        System.out.println("Saque realizado. Limite restante: " + limiteRestante);
                    }
            }
        }
    }
}
