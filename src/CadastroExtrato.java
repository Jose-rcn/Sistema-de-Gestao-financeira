import java.util.ArrayList;

public class CadastroExtrato {
    static ArrayList<Extrato> listaExtratos = new ArrayList<>();

    static void adicionarExtrato(Extrato e){
        listaExtratos.add(e);
    }
    static void removerContaCorrente(Extrato e){
        listaExtratos.remove(e);
    }
    static boolean extratoCadastrado(int mes, int ano, ContaCorrente conta){
        for(Extrato e:listaExtratos){
            if (e.getAno() == ano && e.getMes() == mes){
                return true;
            }
        }
        return false;
    }
    static Extrato getExtrato(int mes, int ano, ContaCorrente conta){
        for(Extrato e:listaExtratos){
            if (e.getAno() == ano && e.getMes() == mes){
                return e;
            }
        }
        return null;
    }
    static String listarExtrato(){
        String dados = "=-=-=-=-=-=-=-=-=-=-==-=-==-=-\n";
        double total = 0;
        for(Extrato e :listaExtratos){
            total += e.getValor();
        }
        dados += total + "\n";
        for(Extrato e :listaExtratos){
            dados += e.getDespesas();
        }
        return dados;
    } 
}
