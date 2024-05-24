import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int numeroConta = scanner.nextInt();
            if(numeroConta == 8){
              System.out.println("Numero da não é valido");
            }else{
              System.out.println("Numero de conta valido.");
            }            
        } catch (IllegalArgumentException e) {
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Numero de conta invalido. Digite exatamente 8 digitos.");
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static int Int(String numeroConta) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'Int'");
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."

        }
    }
}