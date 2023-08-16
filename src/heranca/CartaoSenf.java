package heranca;

// Classe especializada para Cartão Senf, extendendo da classe base Cartão
public class CartaoSenf extends Cartao{
    
    // Rescrevendo o metodo de validação de data de vencimento, para o Cartão Senf que é diferente do padrão
    @Override
    public boolean ValidarDtVencimento(){
        if (this.dt_vencimento.equalsIgnoreCase("2020")){
            return false;
        }
        return true;
    }

    @Override
    public boolean pagar() {
        // Lógica de processamento do pagamento em Cartão Senf
        System.out.println("Pagamento realizado com Cartão Senf");
        return true;
    }
}
