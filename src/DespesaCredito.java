public class DespesaCredito extends Despesa {
    protected int qtdparcelas;
    public DespesaCredito(double valor, String nome, String categoria, String data, int qtdparcelas, ContaCorrente conta) {
		super(valor, nome, categoria, data, conta);
		this.qtdparcelas = qtdparcelas;
	}
}
