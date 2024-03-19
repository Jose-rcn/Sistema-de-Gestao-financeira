import java.awt.Color;

import javax.swing.JFrame;


public class TelaCadastroConta extends JFrame implements assets{
    public TelaCadastroConta(){
        setTitle("Cadastro de conta Bancária");
        setVisible(true);
        setSize(altura_janela, largura_janela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0));
    }

    
}