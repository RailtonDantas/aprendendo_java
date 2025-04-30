import java.util.Scanner;

public class Ternario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean teste;
        teste = sc.nextBoolean();
        int y = (teste) ? 10 : 20;
        System.out.println(y);
        sc.close();
    }
}
