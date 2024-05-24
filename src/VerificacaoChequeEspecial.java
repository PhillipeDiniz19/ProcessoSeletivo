import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponivel
        if (saque <= saldo) {
            // Saque dentro do saldo disponivel
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            if (saque <= saldo + limiteChequeEspecial) {
                // Saque dentro do cheque especial
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                // Saque ultrapassa tanto o saldo quanto o cheque especial
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
