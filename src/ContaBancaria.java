public abstract class ContaBancaria {
    protected String nome;
    protected double saldo;

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
    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String GetInformacoes(){
        String dados;
        dados = "Nome: " + this.nome  + "\n" + "Saldo: " + this.saldo;
        return dados;
    }
    public void descontarDespesaDebito(DespesaDebito d){
        this.saldo = this.saldo - d.getValor();
    }

}
