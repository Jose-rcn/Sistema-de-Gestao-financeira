public abstract class ContaBancaria {
    protected String numeroDaConta, nome;
    protected double Saldo;

    public ContaBancaria(){
    }
    public ContaBancaria(String nome,String numero, double saldo){
        this.Saldo = saldo;
        this.numeroDaConta = numero;
    }

}
