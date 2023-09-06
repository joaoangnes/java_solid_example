package ex_calculo_area;

/**
 * A classe Triangulo representa um triângulo e estende a classe SuperClassFiguras.
 * Ela calcula a área e o perímetro do triângulo com base em sua base, altura e comprimentos dos lados.
 */
public class Triangulo extends SuperClassFiguras {
    // Propriedades do triângulo
    public Double base;
    public Double altura;
    public Double lado01;
    public Double lado02;
    public Double lado03;

    /**
     * Calcula a área do triângulo usando a fórmula (base * altura) / 2.
     * @return A área do triângulo.
     */
    @Override
    public Double CalcArea(){
        // Realiza o cálculo da área do triângulo
        return (this.base * this.altura) / 2;
    }

    /**
     * Calcula o perímetro do triângulo somando os comprimentos dos três lados.
     * @return O perímetro do triângulo.
     */
    @Override
    public Double CalcPerimetro(){
        // Realiza o cálculo do perímetro do triângulo
        return this.lado01 + this.lado02 + this.lado03;
    }
}

