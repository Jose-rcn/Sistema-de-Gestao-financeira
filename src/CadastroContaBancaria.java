import java.util.ArrayList;

public class CadastroContaBancaria {

    static ArrayList <ContaBancaria> lista_cadastro_conta = new ArrayList();


    static void adicionarContaBancaria(ContaBancaria conta){
        lista_cadastro_conta.add(conta);
    }
    static void removerContaBancaria(ContaBancaria conta){
        lista_cadastro_conta.remove(conta);
    }
    
}