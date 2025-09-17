import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Agencia! ");
        String Agencia = scanner.nextLine();

        System.out.print("Por favor , digite o numero da conta: ");
        int Numero = scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String NomeCliente = scanner.next();

        System.out.print("Digite o saldo da conta bancaria: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia +", conta " + Numero +" e seu saldo " + Saldo +
                " ja esta disponivel para saque.");

        scanner.close();
    }
}
