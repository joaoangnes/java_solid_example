package heranca;

public class Pix implements I_Objeto_Financeiro {
    public String copia_e_cola;

    @Override
    public boolean pagar() {
        // Lógica de processamento do pagamento em Pix
        System.out.println("Pagamento realizado via Pix");
        return true;
    }
}
