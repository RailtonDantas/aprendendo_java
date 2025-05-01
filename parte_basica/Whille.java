package parte_basica;
import java.util.Scanner;

public class Whille {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        while (true){
            int x = sc.nextInt();
            if (x == 0) break;
            soma += x;
        }
        System.out.println(soma);

        sc.close();
    }
}
