package POO.membrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

import POO.membrosEstaticos.entities.Esfera;

public class Estatico {
    public static final double PI = Math.PI;
    // final cria uma constante
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        System.out.printf("O valor do volume é %.2f ",Esfera.volume(raio));
        System.out.printf("\nO valor do circunferência é %.2f",Esfera.circunferencia(raio));
        System.out.printf("\nValor de PI: %.5f",PI);

        sc.close();

    }
}
