package ex_calculo_area;

public class Quadrado extends SuperClassFiguras{
    // Propiedades do triangulo
    public Double lado;

    @Override
    public Double CalcArea(){
        // Realiza o calculo da area do quadrado
        return Math.pow(this.lado, 2);
    }


    @Override
    public Double CalcPerimetro(){
        // Realiza o calculo do perimetro do quadrado
        return 4 * this.lado;
    }
}
