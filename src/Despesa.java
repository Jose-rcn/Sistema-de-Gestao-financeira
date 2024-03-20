public abstract class Despesa {
    protected double valor;
    protected String nome, categoria, data;
    protected ContaCorrente contaAssociada;
    public Despesa(double valor, String nome, String categoria, ContaCorrente conta){
        this.valor = valor;
        this.nome = nome;
        this.categoria = categoria;
        this.contaAssociada = conta;
    }

    public double getValor() {
        return this.valor;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCategoria() {
        return this.categoria;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
