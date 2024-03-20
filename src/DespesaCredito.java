public class DespesaCredito extends Despesa {
    protected int qtdparcelas;
    public DespesaCredito(double valor, String nome, String categoria,ContaCorrente conta,int qtdparcelas) {
		super(valor, nome, categoria, conta);
		this.qtdparcelas = qtdparcelas;
	}
	public double getValorTotal(){
		return this.valor * this.qtdparcelas;
	}
}
