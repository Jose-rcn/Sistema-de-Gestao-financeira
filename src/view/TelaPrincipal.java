
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TelaPrincipal extends JFrame implements assets{

    public TelaPrincipal(){
        setTitle("Sistema de Gestão financeira");
        setVisible(true);
        setSize(altura_janela, largura_janela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        JLabel saldo = new JLabel();
        saldo.setText(String.valueOf(0));
        saldo.setBounds(0,0,100,100);
        saldo.setVisible(true);
        saldo.setFont(fonte_padrao);
        add(saldo);

        JButton btnCadastrarConta = new JButton("Cadastrar conta");
        assets.botaoPadrao(btnCadastrarConta,300,500);
        btnCadastrarConta.addActionListener(this::gerarTelaDeCadastroConta);
        add(btnCadastrarConta);

        JButton btnRegistrarDespesa = new JButton("Registrar Despesa");
        assets.botaoPadrao(btnRegistrarDespesa,300,300);
        btnRegistrarDespesa.addActionListener(this::gerarTelaDeCadastroDespesa);
        add(btnRegistrarDespesa);
    }
    public void gerarTelaDeCadastroConta(ActionEvent event){
        new TelaCadastroConta();
        setVisible(false);
    }
    public void gerarTelaDeCadastroDespesa(ActionEvent event){
        new TelaTipoDespesa();
        setVisible(false);
    }
    public static void atualizarSaldo(JLabel saldo) {
        // Obtém a instância da TelaPrincipal atual
        TelaPrincipal telaPrincipal = (TelaPrincipal) SwingUtilities.getWindowAncestor(SwingUtilities.getRootPane(saldo));
    }
}
