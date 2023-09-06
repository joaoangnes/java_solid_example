package ex_calculo_area;

/**
 * A classe Circulo representa um círculo e estende a classe SuperClassFiguras.
 * Ela calcula a área e o perímetro do círculo com base no raio.
 */
public class Circulo extends SuperClassFiguras {
    // Propriedades do círculo
    public Double raio;
    private final Double pi = 3.14159;
    
    /**
     * Calcula a área do círculo usando a fórmula pi * raio^2.
     * @return A área do círculo.
     */
    @Override
    public Double CalcArea(){
        // Realiza o cálculo da área do círculo
         return this.pi * Math.pow(this.raio, 2);
    }

    /**
     * Calcula o perímetro do círculo usando a fórmula 2 * pi * raio.
     * @return O perímetro do círculo.
     */
    @Override
    public Double CalcPerimetro(){
        // Realiza o cálculo do perímetro do círculo
        return 2 * this.pi * this.raio;
    }
}
