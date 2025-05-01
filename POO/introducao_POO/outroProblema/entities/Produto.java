package POO.introducao_POO.outroProblema.entities;

import java.util.Scanner;

public class Produto {
    public String nomeProduto;
    public int unidadesProduto;
    public double precoProduto;

    public void cadastraProduto(Scanner sc){
        System.out.println("Adicione os dados do produto: ");

        System.out.print("Nome: ");
        nomeProduto = sc.next();

        System.out.print("Preço: ");
        precoProduto = sc.nextDouble();

        System.out.print("Unidades: ");
        unidadesProduto = sc.nextInt();


    }

    public void mostraProduto(){
        double precoTotal = precoProduto * unidadesProduto;
        System.out.printf("%s, R$ %.2f Reais, %d unidades, Total R$ %.2f",nomeProduto,precoProduto,unidadesProduto,precoTotal);
    }

    public void adicionaProduto(Scanner sc){
        System.out.print("\nQuantos produtos quer adicionar? ");
        int quantidadeAdicional = sc.nextInt();
        unidadesProduto += quantidadeAdicional;
        mostraProduto();
    }

    public void retiraProduto(Scanner sc){
        System.out.print("\nQuantos produtos quer retirar? ");
        int quantidadeRetirar = sc.nextInt();
        unidadesProduto -= quantidadeRetirar;
        mostraProduto();
    }
    public void dadosAtualizados(){
        System.out.print("\nDados Atualizados: ");
        this.mostraProduto();
    }
}
