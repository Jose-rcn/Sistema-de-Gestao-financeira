import java.util.ArrayList;

public class ContaCorrente extends ContaBancaria{
    private double LimiteCartao, LimiteChequeEspecial;
    ArrayList<ContaCorrente> contas_cadastradas = new ArrayList<>();

    public double getLimiteCartao() {
        return this.LimiteCartao;
    }

    public void setLimiteCartao(double LimiteCartao) {
        this.LimiteCartao = LimiteCartao;
    }

    public double getLimiteChequeEspecial() {
        return this.LimiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double LimiteChequeEspecial) {
        this.LimiteChequeEspecial = LimiteChequeEspecial;
    }
    public ContaCorrente(String nome, double saldo, double LimiteCartao){
        super(nome, saldo);
        this.LimiteCartao = LimiteCartao;
    }
    static void descontarDebito(ContaCorrente conta,double valor){
        conta.saldo += conta.saldo - valor;
    }
}
