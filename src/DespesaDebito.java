public class DespesaDebito extends Despesa{
    public DespesaDebito(double valor, String nome, String categoria, String data, ContaCorrente conta) {
		super(valor, nome, categoria, data, conta);
		ContaCorrente.descontarDebito(conta, valor);
	}
    
}