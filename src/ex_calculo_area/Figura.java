package ex_calculo_area;

/**
 * A classe Figura atua como um invólucro para calcular a área e o perímetro de figuras que estendem a classe SuperClassFiguras.
 */
public class Figura {
    private SuperClassFiguras figura;

    /**
     * Construtor da classe Figura.
     * @param figura Uma instância de uma classe que estende SuperClassFiguras.
     */
    public Figura(SuperClassFiguras figura) {
        this.figura = figura;
    }

    /**
     * Calcula a área da figura chamando o método CalcArea da figura encapsulada.
     * @return A área da figura.
     */
    public Double CalcArea(){
        return this.figura.CalcArea();
    }

    /**
     * Calcula o perímetro da figura chamando o método CalcPerimetro da figura encapsulada.
     * @return O perímetro da figura.
     */
    public Double CalcPerimetro(){
        return this.figura.CalcPerimetro();
    }
}

