package ex_calculo_area;

public class Circulo extends SuperClassFiguras{
    // Propiedades do circulo
    public Double raio;
    private Double pi = 3.14;
    
    @Override
    public Double CalcArea(){
        // Realiza o calculo de area do circulo
        return 2 * this.pi * this.raio;
    }


    @Override
    public Double CalcPerimetro(){
        // Realiza o calculo do perimetro do circulo
        return this.pi * Math.pow(this.raio, 2);
    }
}
