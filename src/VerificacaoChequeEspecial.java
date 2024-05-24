import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // Se o saque for menor ou igual ao saldo, a transação é realizada com sucesso.
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Calcula o saldo total disponível considerando o cheque especial
            double saldoTotal = saldo + limiteChequeEspecial;

            // Verifica se o saque ultrapassa o saldo total disponível (incluindo o cheque
            // especial)
            if (saque <= saldoTotal) {
                // Se o saque for menor ou igual ao saldo total disponível, a transação é
                // realizada com sucesso usando o cheque especial.
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                // Se o saque for maior que o saldo total disponível, o limite do cheque
                // especial foi excedido.
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
