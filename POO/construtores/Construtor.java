package POO.construtores;

import java.util.Locale;
import java.util.Scanner;
import POO.construtores.entities.Product;

public class Construtor {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------Digite os valores do produto------");

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite a quantidade do produto: ");
        int unidades = sc.nextInt();
        
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextInt();

        Product produto = new Product(nome, unidades,preco);
        Product produto2 = new Product("carro",1000);
        System.out.println(produto);
        System.out.println(produto2);
        
        System.out.print("Quantas unidades quer adicionar? ");
        produto.adicionaProduto(sc.nextInt());
        System.out.println(produto);
        
        
        System.out.print("Quantas unidades quer retirar? ");
        produto.retiraProduto(sc.nextInt());
        System.out.println(produto);


        sc.close();
    }
}
