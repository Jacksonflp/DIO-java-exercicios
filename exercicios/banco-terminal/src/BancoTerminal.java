public class BancoTerminal {
    public static void main(String[] args) {

        System.out.println("--- Cenário 1 ---");
        // Cenário 1: Saldo suficiente
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("Valor solicitado: R$ " + valorSolicitado);

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo atual: R$ " + saldo);

        System.out.println("\n--- Cenário 2 ---");
        // Cenário 2: Saldo insuficiente
        saldo = 15.0;
        valorSolicitado = 22.0;

        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("Valor solicitado: R$ " + valorSolicitado);

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo atual: R$ " + saldo);
    }
}
