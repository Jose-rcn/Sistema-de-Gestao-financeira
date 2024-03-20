import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opção = 0, qtdParcelas = 0, opcaoConta;
        double saldoNovaConta = 0,limiteNovaConta = 0, valorDespesa = 0;
        String nomeNovaConta, descricaoDespesa, data, categoriaDespesa;
        Scanner entradaTeclado = new Scanner(System.in);
        while (true) {
            System.out.println(CadastroConta.imprimirInformacoes());
            System.out.println("[1] Cadastra Conta corrente");
            System.out.println("[2] Registrar Despesa no débito");
            System.out.println("[3] Registrar Despesa no crédito");
            System.out.println("[4] Cadastrar assinatura");
            System.out.println("[5] Consultar Extratos");
            System.out.println("Escolha uma opção:");
            opção = entradaTeclado.nextInt();

            switch (opção) {
                case 1:
                    System.out.println("Digite o nome da conta corrente: ");
                    entradaTeclado.nextLine();
                    nomeNovaConta = entradaTeclado.nextLine();

                    System.out.println("Informe o saldo atual da conta: ");
                    saldoNovaConta = entradaTeclado.nextDouble();

                    System.out.println("Qual o limite atual do cartão:");
                    limiteNovaConta = entradaTeclado.nextDouble();
                    ContaCorrente novaContaCorrente = new ContaCorrente(nomeNovaConta,saldoNovaConta,limiteNovaConta);
                    CadastroConta.adicionarContaCorrente(novaContaCorrente);
                    System.out.println("Nova conta corrente cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite a descrição do gasto");
                    entradaTeclado.nextLine();
                    descricaoDespesa = entradaTeclado.nextLine();

                    System.out.println("Digite a categoria:");
                    entradaTeclado.nextLine();
                    categoriaDespesa = entradaTeclado.nextLine();
                    
                    System.out.println("Digite o valor:");
                    valorDespesa = entradaTeclado.nextDouble();

                    System.out.println("Informe a data:");
                    entradaTeclado.nextLine();
                    String dataDespesa = entradaTeclado.nextLine();

                    System.out.println(CadastroConta.getContaCorrenteCadastrada());
                    System.out.println("Selecione a conta associada:");
                    opcaoConta = entradaTeclado.nextInt();
                    ContaCorrente contaAssociada = CadastroConta.lista_cadastro_corrente.get(opcaoConta-1);

                    DespesaDebito debito = new DespesaDebito(valorDespesa,descricaoDespesa,categoriaDespesa,contaAssociada);
                    CadastroDespesa.adicionarDespesaDebito(debito);
                    System.out.println("Despesa Cadastrada com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite a descrição do produto:");
                    entradaTeclado.nextLine();
                    descricaoDespesa = entradaTeclado.nextLine();

                    System.out.println("Informe a categoria:");
                    entradaTeclado.nextLine();
                    categoriaDespesa = entradaTeclado.nextLine(); 
                
                    System.out.println("Informe o mes:");
                    int mes = entradaTeclado.nextInt();

                    System.out.println("Informe o ano:");
                    int ano = entradaTeclado.nextInt();
            
                    System.out.println("Digite o valor da parcela:");
                    valorDespesa = entradaTeclado.nextDouble();
                
                    System.out.println("Digite a quantidade de parcelas:");
                    qtdParcelas = entradaTeclado.nextInt();
                
                    System.out.println(CadastroConta.getContaCorrenteCadastrada());
                    opcaoConta = entradaTeclado.nextInt();
                    contaAssociada = CadastroConta.lista_cadastro_corrente.get(opcaoConta-1);
                    DespesaCredito credito = new DespesaCredito(valorDespesa, descricaoDespesa, categoriaDespesa,contaAssociada, qtdParcelas);
                    CadastroDespesa.adicionarDespesaCredito(credito);
                    System.out.println("Despesa Cadastrada com sucesso!");
                    if (CadastroExtrato.extratoCadastrado(mes, ano,contaAssociada)){
                        CadastroExtrato.getExtrato(mes,ano,contaAssociada).adicionarDespesaCredito(credito);
                        Extrato.adicionarCredito(CadastroExtrato.getExtrato(mes, ano, contaAssociada), credito);
                    }
                    else{
                        Extrato extratocadastra = new Extrato(mes, ano, contaAssociada);
                        extratocadastra.adicionarDespesaCredito(credito);
                        CadastroExtrato.adicionarExtrato(extratocadastra);
                        Extrato.adicionarCredito(extratocadastra, credito);
                    }
                    break;
                case 4:
        	        break;
                case 5:
                    System.out.println(CadastroExtrato.listarExtrato());
        	        break;
                default:
        	        System.out.println("Opção inválida, tente novamente com uma das opções possiveis.");
        	    break;
            }
        }
        
    }
    public void registroDespesa(){
    }
}