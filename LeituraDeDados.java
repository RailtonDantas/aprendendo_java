import java.util.Scanner;
import java.util.Locale;

public class LeituraDeDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // tem q instanciar um objeto da classe scanner, pra isso, tem que importar o java.util.scanner

        String x ;
        x = sc.next(); // pra pegar string no input
        char carac = x.charAt(0); // pra pegar o caractere da string

        System.out.println("Você digitou o caractere " + carac); 
        System.out.println("Você digitou a palavra " + x); 
        double y ;
        y = sc.nextDouble(); // pra pegar double no input
        System.out.println("Vc digitou um double " + y);
  
        int a;
        a = sc.nextInt();
        System.out.println("Voce printou um inteiro " + a);

        // // PEGAR VARIOS INPUTS NA MESMA LINHA
        String ab;
        int ac;
        double ad;

        ab = sc.next();
        ac = sc.nextInt();
        ad = sc.nextDouble();

        System.out.println(ab);
        System.out.println(ac);
        System.out.println(ad);


        // Como ler uma linha inteira

        String linhaAt;
        String linhaAt2;
        String linhaAt3;
        sc.nextLine(); // pra consumir a quebra de linha pendente

        linhaAt = sc.nextLine();
        linhaAt2 = sc.nextLine();
        linhaAt3 = sc.nextLine();

        System.out.println(linhaAt);
        System.out.println(linhaAt2);
        System.out.println(linhaAt3);

        sc.close();
    }
    
}
