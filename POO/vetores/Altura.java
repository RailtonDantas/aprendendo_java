package POO.vetores;
import java.util.Scanner;
import java.util.Locale;

public class Altura {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeAlturas = sc.nextInt();

        double[] alturas = new double[quantidadeAlturas];
        double somaAlturas = 0;

        for (int i = 0; i < quantidadeAlturas; i++) {
            alturas[i] = sc.nextDouble();
            somaAlturas += alturas[i];
        }
        System.out.printf("Average Height = %.2f",somaAlturas / quantidadeAlturas);
        sc.close();
    }

    
}
