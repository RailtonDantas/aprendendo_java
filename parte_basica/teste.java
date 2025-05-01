package parte_basica;
import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int consumo;
        int conta = 50;
        consumo = sc.nextInt();

        if (consumo <= 100) {
            System.out.println("O valor a pagar é 50 reais");
        }
        else{
            int diferenca = consumo - 100;
            conta += diferenca * 2;
            System.out.printf("O valor a pagar é %d reais",conta);
        }
        
        sc.close();


    }
}
