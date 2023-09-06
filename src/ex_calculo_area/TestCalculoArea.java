package ex_calculo_area;

public class TestCalculoArea {
    
    public static void main(String[] args) {
        
        // Instancia o objeto Triangulo
        Triangulo tr = new Triangulo();
        tr.base = 2.0;
        tr.altura = 3.0;
        tr.lado01 = 2.0;
        tr.lado02 = 2.0;
        tr.lado03 = 2.0;
    
        Figura f = new Figura(tr);

        System.err.println("Area do Triangulo: "+ f.CalcArea());
        System.err.println("Perimetro do Triangulo: "+ f.CalcPerimetro());
    }
}
