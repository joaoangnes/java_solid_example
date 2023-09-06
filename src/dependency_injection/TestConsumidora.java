package dependency_injection;

public class TestConsumidora {

    public static void main(String[] args) {

        ConcretaA ca = new ConcretaA();
        ConcretaB cb = new ConcretaB();
        cb.t = "Curitiba";

        Consumidora c = new Consumidora(ca);

        System.out.println(c.getConteudo());

    }
    
}
