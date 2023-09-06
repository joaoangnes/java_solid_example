package dependency_injection;

public class ConcretaB extends SuperClasse{
    public String t;
    
    @Override
    public String GerarConteudo(){
        return "<H2> " + t + "</H2>";
    }
    
}
