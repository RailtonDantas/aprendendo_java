package parte_basica;
import java.util.Scanner;
public class Funcoes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = meuMax(a,b,c);
        mostrarNaTela(maior);

        sc.close();
    }

    public static int meuMax(int a,int b,int c){
        if (a > b && a > c) {
            return a;
        }
        else if (b > c) {
            return b;
        }
        else{
            return c;
        }
    }

    public static void mostrarNaTela(int maior){
        System.out.println("O maior número é " + maior);
    }
}
