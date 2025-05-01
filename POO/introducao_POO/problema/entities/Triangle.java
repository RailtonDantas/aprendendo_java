package POO.introducao_POO.problema.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double calculaArea(){
        double perimetro = calculaPerimetro();
        double area = Math.sqrt(perimetro * (perimetro - a) * (perimetro - b) * (perimetro - c));
        return area;

    }
    public double calculaPerimetro(){
        return (a + b + c) / 2;
    }
}
