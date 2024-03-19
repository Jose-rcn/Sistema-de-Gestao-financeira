import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public interface assets{
    Color cor_principal = new Color(130, 223, 173);
    Font fonte_padrao = new Font("Arial",Font.BOLD,16);
    int altura_janela = 800;
    int largura_janela = 800;

    static void botaoPadrao(JButton button, int x, int y){
        final int altura = 50, largura = 200;
        button.setBounds(x,y,largura,altura);
        button.setFont(fonte_padrao);
        button.setForeground(new Color(0, 0, 0));
        button.setBackground(cor_principal);
    }
    static void caixaDeTextoPadrao(JTextField caixa, int x, int y){
        final int largura = 400, altura = 40;
        caixa.setBounds(x,y,largura,altura);
        caixa.setFont(fonte_padrao);
    }
}
