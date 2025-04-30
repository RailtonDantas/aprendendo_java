package POO.problema_sem_poo;

import java.util.Locale;
import java.util.Scanner;

public class Problema {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do triângulo 1:");
        double areaTriangulo1 = calculaArea(sc);

        System.out.println("Digite os valores do triângulo 2:");
        double areaTriangulo2 = calculaArea(sc);
        
        mostraAreas(areaTriangulo1, areaTriangulo2);
        mostraAreaMaior(areaTriangulo1, areaTriangulo2);

        sc.close();
    }

    public static double calculaArea(Scanner sc){

        double lado = sc.nextDouble();
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();

        double perimetro = calculaPerimetro(lado, lado1, lado2);

        double areaAoQuadrado = perimetro * (perimetro - lado) * (perimetro - lado1) * (perimetro - lado2);
        double area = Math.sqrt(areaAoQuadrado);

        return area;
    }

    public static double calculaPerimetro(double a, double b, double c){
        return (a + b + c) / 2;
    }

    public static void mostraAreas(double area1, double area2){
        System.out.printf("Área triângulo 1: %.2f\n",area1);
        System.out.printf("Área triângulo 2: %.2f\n",area2);
    }

    public static void mostraAreaMaior(double area1, double area2){
        if (area1 >= area2) {
            System.out.println("Maior área: 1");
        }
        else{
            System.out.println("Maior área: 2");
        }
    }
}
