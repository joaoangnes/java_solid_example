package heranca;

public class Cliente {

    // Para ser possivel criar um construtor personalizado, porém preciso do construtor padrão, preciso especificar o construtor default
    Cliente(){}


    // Construtor personalizado
    Cliente(String cpf){
        if(cpf.equals("888")){
            this.nome = "João Arthur";
            this.Cpf = cpf;
        }
    }

    private String nome;
    private String Cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }
}
