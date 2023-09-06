package ex_calculo_area;

public class Triangulo extends SuperClassFiguras{
    // Propiedades do triangulo
    public Double base;
    public Double altura;
    public Double lado01;
    public Double lado02;
    public Double lado03;

    @Override
    public Double CalcArea(){
        // Realiza o calculo da area do triangulo
        return (this.base * this.altura)/2;
    }


    @Override
    public Double CalcPerimetro(){
        // Realiza o calculo do perimetro do triangulo
        return this.lado01 + this.lado02 + this.lado03;
    }
}
