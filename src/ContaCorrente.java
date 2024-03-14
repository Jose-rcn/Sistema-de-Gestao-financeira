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
    public ContaCorrente(String nome,String numero, double saldo, double LimiteCartao){
        super(nome,numero, saldo);
        this.LimiteCartao = LimiteCartao;
    }
    public ContaCorrente(){
    }
    public void cadastrar(){
        
    }





}
