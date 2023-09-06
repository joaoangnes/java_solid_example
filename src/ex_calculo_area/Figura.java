package ex_calculo_area;

public class Figura {
    private SuperClassFiguras figura;

    public Figura(SuperClassFiguras figura) {
        this.figura = figura;
    }

    public Double CalcArea(){
        return this.figura.CalcArea();
    }

    public Double CalcPerimetro(){
        return this.figura.CalcPerimetro();
    }

}
