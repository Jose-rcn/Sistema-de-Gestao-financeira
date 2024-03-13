public class main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        DespesaCredito credito = new DespesaCredito();
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Cadastra Conta corrente");
            System.out.println("[2] Registrar Despesa no débito");
            System.out.println("[3] Registrar Despesa no crédito");
            System.out.println("[4] Cadastrar assinatura");
        }
    }
}