import java.util.ArrayList;

public class Extrato {
    private int mes, ano;
    private ContaBancaria conta;
    private ArrayList <DespesaCredito> extrato_despesas_credito = new ArrayList<>();
    private ArrayList <Assinaturas> extrato_assinaturas = new ArrayList<>();


    public Extrato(int m, int a, ContaBancaria c){
        this.conta = c;
        this.mes = m;
        this.ano = a;
        // for (Assinaturas assinatura: CadastroDespesa.listarAssinaturas(c)){
        //     extrato_assinaturas.add(assinatura);
        // }
    }
    public void adicionarDespesaCredito(DespesaCredito d){
        extrato_despesas_credito.add(d);
    }

}
