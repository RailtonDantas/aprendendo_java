package POO.vetores.entities;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        String produto = String.format("Nome: %s \n Preço: %.2f",this.nome,this.preco);
        return produto;
    }

    public double getPreco(){
        return this.preco;
    }
}
