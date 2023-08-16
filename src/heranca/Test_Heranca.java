package heranca;

public class Test_Heranca {
     
    public static void main(String[] args) {
        CartaoMaster cm = new CartaoMaster(); // Construtor Cartão Master
        System.out.println(cm.nome);
        System.out.println(cm.dt_vencimento); 
        System.out.println(cm.ValidarNome());        

        CartaoSenf cs = new CartaoSenf(); // Construtor Cartão Senf
        cs.dt_vencimento = "2020";
        System.out.println(cs.ValidarDtVencimento());

        Pix pix = new Pix();

        ServFinanceiro sf = new ServFinanceiro();
        sf.ProcessarPagto(cm);
        sf.ProcessarPagto(cs);
        sf.ProcessarPagto(pix);
    }
}
