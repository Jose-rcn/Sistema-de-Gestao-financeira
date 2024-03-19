public abstract class ContaBancaria {
    protected String numeroDaConta, nome;
    protected double saldo;

    public String getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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
    public void descontarDespesaDebito(DespesaDebito d){
        this.saldo = this.saldo - d.getValor();
    }

}
