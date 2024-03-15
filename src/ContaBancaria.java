public abstract class ContaBancaria {
    protected String numeroDaConta, nome;
    protected double saldo;

    public ContaBancaria(){
    }
    public ContaBancaria(String nome,String numero, double saldo){
        this.saldo = saldo;
        this.numeroDaConta = numero;
    }

    public String GetInformacoes(){
        String dados;
        dados = "Nome: " + this.nome + "\n" + "Numero: " + this.numeroDaConta + "\n" + "Saldo: " + this.saldo;
        return dados;
    }

}
