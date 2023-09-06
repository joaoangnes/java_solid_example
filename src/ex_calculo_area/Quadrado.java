package ex_calculo_area;

/**
 * A classe Quadrado representa um quadrado e estende a classe SuperClassFiguras.
 * Ela calcula a área e o perímetro do quadrado com base no comprimento de um lado.
 */
public class Quadrado extends SuperClassFiguras {
    // Propriedades do quadrado
    public Double lado;

    /**
     * Calcula a área do quadrado usando a fórmula lado^2.
     * @return A área do quadrado.
     */
    @Override
    public Double CalcArea(){
        // Realiza o cálculo da área do quadrado
        return Math.pow(this.lado, 2);
    }

    /**
     * Calcula o perímetro do quadrado usando a fórmula 4 * lado.
     * @return O perímetro do quadrado.
     */
    @Override
    public Double CalcPerimetro(){
        // Realiza o cálculo do perímetro do quadrado
        return 4 * this.lado;
    }
}

