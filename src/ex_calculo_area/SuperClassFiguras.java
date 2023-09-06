package ex_calculo_area;

/**
 * A classe abstrata SuperClassFiguras é uma classe base para representar figuras geométricas.
 * Ela fornece implementações padrão para os métodos de cálculo de área e perímetro.
 */
public abstract class SuperClassFiguras {

    /**
     * Calcula a área da figura.
     * @return A área da figura (por padrão, 0.0).
     */
    public Double CalcArea(){
        return 0.0;
    }

    /**
     * Calcula o perímetro da figura.
     * @return O perímetro da figura (por padrão, 0.0).
     */
    public Double CalcPerimetro(){
        return 0.0;
    }
}
