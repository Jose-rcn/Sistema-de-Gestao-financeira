public class DespesaDebito extends Despesa{
    public DespesaDebito(double valor, String nome, String categoria, ContaCorrente conta) {
		super(valor, nome, categoria, conta);
		ContaCorrente.descontarDebito(conta, valor);
	}
    
}