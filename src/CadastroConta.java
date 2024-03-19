import java.util.ArrayList;

public class CadastroConta {

    static ArrayList <ContaInvestimento> lista_cadastro_investimento = new ArrayList();
    static ArrayList <ContaCorrente> lista_cadastro_corrente = new ArrayList();


    static void adicionarContaCorrente(ContaCorrente conta){
        lista_cadastro_corrente.add(conta);
    }
    static void removerContaCorrente(ContaCorrente conta){
        lista_cadastro_corrente.remove(conta);
    }

    static String getContaCorrenteCadastrada(){
        String dados = "";
        for (int c = 0; c < lista_cadastro_corrente.size();c++){
            dados += "[" + c + "]" + lista_cadastro_corrente.get(c).nome + "\n";
        }
        return dados;
    }
    
}