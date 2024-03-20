import java.util.ArrayList;

public class Extrato {
    private double valor;
    private int mes, ano;

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ContaBancaria getConta() {
        return this.conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public ArrayList<DespesaCredito> getExtrato_despesas_credito() {
        return this.extrato_despesas_credito;
    }

    public void setExtrato_despesas_credito(ArrayList<DespesaCredito> extrato_despesas_credito) {
        this.extrato_despesas_credito = extrato_despesas_credito;
    }

    public ArrayList<Assinatura> getExtrato_assinaturas() {
        return this.extrato_assinaturas;
    }

    public void setExtrato_assinaturas(ArrayList<Assinatura> extrato_assinaturas) {
        this.extrato_assinaturas = extrato_assinaturas;
    }
    private ContaBancaria conta;
    private ArrayList <DespesaCredito> extrato_despesas_credito = new ArrayList<>();
    private ArrayList <Assinatura> extrato_assinaturas = new ArrayList<>();


    public Extrato(int m, int a, ContaBancaria c){
        this.conta = c;
        this.mes = m;
        this.ano = a;
        for (Assinatura assinatura: CadastroDespesa.getLista_cAssinaturas()){
            this.valor += assinatura.getValor();
        }
    }
    public void adicionarDespesaCredito(DespesaCredito d){
        extrato_despesas_credito.add(d);
    }
    public String getDespesas(){
        String dados = "";
        for(DespesaCredito d :extrato_despesas_credito){
            dados += d.getNome()+ " - " +d.getValor()+ "\n";
        }
        return dados;
    }
    static void adicionarCredito(Extrato e,DespesaCredito d){
        e.valor = e.valor + d.getValor();
    }

}
