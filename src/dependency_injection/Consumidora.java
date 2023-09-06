package dependency_injection;

public class Consumidora {
    private SuperClasse gerador;

    // Injeta a dependencia da classe consumidora, que necessita de uma classe que herda a SuperClasse
    public Consumidora(SuperClasse gerador) {
        this.gerador = gerador;
    }

    // Cria um método que irá buscar os conteudo das classes definidas na construção do objeto Consumidora
    public String getConteudo() {
        return this.gerador.GerarConteudo();
    }

}
