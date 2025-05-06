package POO.vetores.aplication;

import java.util.Scanner;
import java.util.Locale;
import POO.vetores.entities.Produto;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] produtos = new Produto[n];
        double precoTotal = 0.0;
        
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = sc.nextDouble();

            Produto produtoAtual = new Produto(nome, preco);
            precoTotal += produtoAtual.getPreco();

            produtos[i] = produtoAtual;
        }
        System.out.printf("Average price = %.2f",precoTotal / n);
        sc.close();
    }
}
