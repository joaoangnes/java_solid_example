package heranca;

// Classe base para cartões
public abstract class Cartao implements I_Objeto_Financeiro {
    public String nome;
    public String numero;
    public String dt_vencimento;

    public boolean ValidarNome(){
        return true;
    }


    public boolean ValidarNumero(){
        return true;
    }


    public boolean ValidarDtVencimento(){
        return true;
    }

}
