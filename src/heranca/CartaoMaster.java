package heranca;

// Classe especializada para Cartão Master, extendendo da classe base Cartão
public class CartaoMaster extends Cartao{

    @Override
    public boolean pagar() {
        // Lógica de processamento do pagamento em Cartão Master
        System.out.println("Pagamento realizado com Cartão Master");
        return true;
    }
    
}
