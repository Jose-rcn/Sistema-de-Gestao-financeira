public class DespesaCredito extends Despesa {
    protected int qtdparcelas;
    public DespesaCredito(double valor, String nome, String categoria, String data, int qtdparcelas) {
		super(valor, nome, categoria, data);
		this.qtdparcelas = qtdparcelas;
	}
}
