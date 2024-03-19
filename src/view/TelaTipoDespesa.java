import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;

public class TelaTipoDespesa  extends JFrame implements assets{
    public TelaTipoDespesa(){
        setTitle("Tipo de despesa");
        setVisible(true);
        setSize(altura_janela, largura_janela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);


        JButton btnCadastraAssinaturas = new JButton("Assinatura");
        assets.botaoPadrao(btnCadastraAssinaturas, 300, 162);
        btnCadastraAssinaturas.addActionListener(this::gerarTelaCadastroCredito);
        add(btnCadastraAssinaturas);

        JButton btnCadastraCredito = new JButton("Compra no crédito");
        assets.botaoPadrao(btnCadastraCredito, 300, 374);
        btnCadastraCredito.addActionListener(this::gerarTelaCadastroAssinaturas);
        add(btnCadastraCredito);

        JButton btnCadastraDebito = new JButton("Compra no débito");
        assets.botaoPadrao(btnCadastraDebito, 300, 586);
        btnCadastraDebito.addActionListener(this::gerarTelaCadastroDebito);
        add(btnCadastraDebito);
    }
    public void gerarTelaCadastroAssinaturas(ActionEvent event){

    }
    public void gerarTelaCadastroCredito(ActionEvent event){

    }
    public void gerarTelaCadastroDebito(ActionEvent event){
        TelaCadastroDébito tela = new TelaCadastroDébito();
        setVisible(false);
    }    
}