import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opção = 0, qtdParcelas = 0;
        double saldoNovaConta = 0,limiteNovaConta = 0, valorDespesa = 0;
        String nomeNovaConta, numeroNovaConta, descricaoDespesa, data;
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
                    entradaTeclado.nextLine();
                    nomeNovaConta = entradaTeclado.nextLine();
                    System.out.println("Digite o numero da conta: ");
                    numeroNovaConta = entradaTeclado.nextLine();
                    System.out.println("Informe o saldo atual da conta: ");
                    saldoNovaConta = entradaTeclado.nextDouble();
                    System.out.println("Qual o limite atual do cartão:");
                    limiteNovaConta = entradaTeclado.nextDouble();
                    ContaCorrente novaContaCorrente = new ContaCorrente(nomeNovaConta,numeroNovaConta,saldoNovaConta,limiteNovaConta);
                    CadastroConta.adicionarContaCorrente(novaContaCorrente);
                    System.out.println("Nova conta corrente cadastrada com sucesso!");
                    System.out.println(novaContaCorrente.GetInformacoes());
                    break;
                case 2:
                    System.out.println("Digite a descrição do gasto");
                    entradaTeclado.nextLine();
                    descricaoDespesa = entradaTeclado.nextLine();
                    System.out.println("Digite o valor do gasto");
                    valorDespesa = entradaTeclado.nextDouble();
                    //DespesaDebito debito = new DespesaDebito(descricaoDespesa, valorDespesa);
                    break;
                case 3:
                    System.out.println(CadastroConta.getContaCorrenteCadastrada());
                    System.out.println("Digite a descrição do produto:");
                    entradaTeclado.nextLine();
                    descricaoDespesa = entradaTeclado.nextLine();

                    System.out.println("Informe a data:");
                    entradaTeclado.nextLine();
                    data = entradaTeclado.nextLine();

                    System.out.println("Digite o valor da parcela:");
                    valorDespesa = entradaTeclado.nextDouble();

                    System.out.println("Digite a quantidade de parcelas:");
                    qtdParcelas = entradaTeclado.nextInt();
                    
                    int opcaoConta = entradaTeclado.nextInt();
                    //DespesaCredito credito = new DespesaCredito(valorDespesa, descricaoDespesa, "crédito", data, qtdParcelas );
                    break;
        	
                case 4:
        	        break;
                case 5:
        	        break;
                default:
        	        System.out.println("Opção invalida, tente novamente com uma das opções possiveis.");
        	    break;
            }
        }
    }
}