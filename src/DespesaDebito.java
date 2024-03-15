import java.time.LocalDate;

public class DespesaDebito extends Despesa{
    public DespesaDebito(double valor, String nome, String categoria, LocalDate data, String descricao, double valor2) {
		super(valor, nome, categoria, data);
		valor = valor2;
	}
    
}