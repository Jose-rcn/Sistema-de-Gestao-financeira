public abstract class ContaBancaria {
    protected String numeroDaConta;
    protected double Saldo;

    public ContaBancaria(){
    }
    public ContaBancaria(String numero, double saldo){
        this.Saldo = saldo;
        this.numeroDaConta = numero;
    }

}
