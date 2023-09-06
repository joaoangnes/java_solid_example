package dependency_injection;

public class ConcretaA extends SuperClasse{
    @Override
    public String GerarConteudo() { 
        return "Texto para o uso dentro de um docx.";
    }
}
