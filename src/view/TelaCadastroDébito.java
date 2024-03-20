import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TelaCadastroDébito extends JFrame implements assets{
    JTextField valor = new JTextField("");
    JTextField categoria = new JTextField();
    JFormattedTextField campoData = new JFormattedTextField();
    public TelaCadastroDébito(){
        setTitle("Sistema de Gestão financeira");
        setSize(altura_janela, largura_janela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        JLabel label_valor = new JLabel("Insira o valor");
        label_valor.setBounds(100,80,300,20);
        label_valor.setFont(fonte_padrao);
        label_valor.setVisible(true);
        add(label_valor);
        
        JLabel label_categoria = new JLabel("Insira a categoria da despesa");
        label_categoria.setBounds(100,180,300,20);
        label_categoria.setFont(fonte_padrao);
        label_categoria.setVisible(true);
        add(label_categoria);
        
        assets.caixaDeTextoPadrao(valor, 100, 100);
        add(valor);
        
        assets.caixaDeTextoPadrao(categoria, 100, 200);
        add(categoria);
        try{
            MaskFormatter mascaraData = new MaskFormatter("##/##/####");
            campoData = new JFormattedTextField(mascaraData);
            campoData.setValue(getActualDateString());
            campoData.setBounds(100, 250, 200, 30);
            add(campoData);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        JButton FinalizarCadastro = new JButton("Finalizar Cadastro");
        assets.botaoPadrao(FinalizarCadastro, 200, 600);
        add(FinalizarCadastro);
        FinalizarCadastro.addActionListener(this::finalizar);
        setVisible(true);
    }
    public void finalizar(ActionEvent event){
        JOptionPane.showMessageDialog(null, "Despesa Cadastrada com sucesso!");
        setVisible(false);
        new TelaPrincipal();
    }
    public String getActualDateString(){
        LocalDate data_atual = LocalDate.now();
        String dataFormatada = data_atual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return dataFormatada;
    }
}
