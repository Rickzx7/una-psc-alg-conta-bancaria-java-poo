import java.util.Scanner;

public class bancoMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void iniciar() {
        System.out.println("=== CRIAÇÃO DE CONTA BANCÁRIA ===");
        System.out.print("Informe o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Informe o saldo inicial: R$ ");
        double saldoInicial = Double.parseDouble(scanner.nextLine());

        contaBanco conta = new contaBanco(nome, numeroConta, saldoInicial);
        System.out.println("Conta bancária criada com sucesso.");

        String opcao;

        do {
            System.out.println("\n=== MENU BANCO ===");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[Q] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine().toUpperCase();

            switch (opcao) {
                case "1":
                    System.out.print("Informe o valor para depósito: R$ ");
                    double valorDep = Double.parseDouble(scanner.nextLine());
                    conta.depositar(valorDep);
                    break;
                case "2":
                    System.out.print("Informe o valor para saque: R$ ");
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    conta.sacar(valorSaque);
                    break;
                case "3":
                    conta.exibirSaldo();
                    break;
                case "Q":
                    System.out.println("Encerrando o sistema bancário...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (!opcao.equals("Q"));
    }
}
