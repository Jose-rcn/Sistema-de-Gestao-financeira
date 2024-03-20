import java.util.ArrayList;

public class CadastroConta {

    static ArrayList <ContaInvestimento> lista_cadastro_investimento = new ArrayList<>();
    static ArrayList <ContaCorrente> lista_cadastro_corrente = new ArrayList<>();


    static void adicionarContaCorrente(ContaCorrente conta){
        lista_cadastro_corrente.add(conta);
    }
    static void removerContaCorrente(ContaCorrente conta){
        lista_cadastro_corrente.remove(conta);
    }

    static String getContaCorrenteCadastrada(){
        String dados = "";
        for (int c = 0; c < lista_cadastro_corrente.size();c++){
            dados += "[" + (c+1) + "]" + lista_cadastro_corrente.get(c).nome + "\n";
        }
        return dados;
    }
    static void atualizarLimiteDisponivel(){
        for (ContaCorrente conta:lista_cadastro_corrente){
            double limiteUsado = 0;
            for (DespesaCredito d: CadastroDespesa.lista_cCreditos){
                limiteUsado += d.getValorTotal();
            }
            for (Assinatura a: CadastroDespesa.lista_cAssinaturas){
                limiteUsado += a.getValor();
            }
            conta.setLimiteDisponivel(conta.getLimiteCartao() - limiteUsado);
        }
    }
    static String imprimirInformacoes(){
        String dados = "";
        atualizarLimiteDisponivel();
        for (ContaCorrente conta:lista_cadastro_corrente){
            dados += "-=-=-=-=-=-=-=-=-=-=-=-=-==-==-=-=-=-=\n";
            dados += "Conta: " + conta.getNome() + "\n";
            dados += "Saldo: " + conta.getSaldo() + "\n";
            dados += "Limite: " + conta.getLimiteCartao() + "\n";
            dados += "Limite Disponivel: " + conta.getLimiteDisponivel() + "\n";
            dados += "-=-=-=-=-=-=-=-=-=-=-=-=-==-==-=-=-=-=\n";
        }
        return dados;
    }
    
}