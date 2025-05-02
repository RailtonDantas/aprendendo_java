package POO.membrosEstaticos.entities;

public class Esfera {

    public static double volume(double raio){
        double volume = (4 * Math.PI * Math.pow(raio,2)) / 3;
        return volume;
    }
    
    public static double circunferencia(double raio){
        return 2 * Math.PI * raio;
    }
}
