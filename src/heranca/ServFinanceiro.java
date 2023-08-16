package heranca;

public class ServFinanceiro {
    
    // Função para processar pagamento, utilizando o cartão base
    public void ProcessarPagto(I_Objeto_Financeiro servico){
       servico.pagar();
    }
}
