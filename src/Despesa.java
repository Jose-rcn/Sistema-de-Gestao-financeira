import java.time.LocalDate;

public abstract class Despesa {
    protected double valor;
    protected String nome, categoria;
    protected String data;
    public Despesa(double valor, String nome, String categoria, String data){
        this.valor = valor;
        this.nome = nome;
        this.categoria = categoria;
        this.data = data;
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
