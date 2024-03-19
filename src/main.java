import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opção = 0;
        double saldoNovaConta = 0,limiteNovaConta = 0;
        String nomeNovaConta, numeroNovaConta;
        Scanner entradaTeclado = new Scanner(System.in);
        while (true) {
            System.out.println("[1] Cadastra Conta corrente");
            System.out.println("[2] Registrar Despesa no débito");
            System.out.println("[3] Registrar Despesa no crédito");
            System.out.println("[4] Cadastrar assinatura");
            System.out.println("Escolha uma opção:");
            opção = entradaTeclado.nextInt();

            switch (opção) {
                case 1:
                    System.out.println("Digite o nome da conta corrente: ");
                    nomeNovaConta = entradaTeclado.nextLine();
                    entradaTeclado.nextLine();
                    System.out.println("Digite o numero da conta: ");
                    numeroNovaConta = entradaTeclado.nextLine();
                    System.out.println("Informe o saldo atual da conta: ");
                    saldoNovaConta = entradaTeclado.nextDouble();
                    System.out.println("Qual o limite atual do cartão:");
                    limiteNovaConta = entradaTeclado.nextDouble();
                    ContaCorrente novaContaCorrente = new ContaCorrente(nomeNovaConta,numeroNovaConta,saldoNovaConta,limiteNovaConta);
                    CadastroContaBancaria.adicionarContaBancaria(novaContaCorrente);
                    System.out.println("Nova conta corrente cadastrada com sucesso!");
                    System.out.println(novaContaCorrente.GetInformacoes());
                    
                    break;
            }
            break;
        }
    }
}