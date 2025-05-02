package POO.construtores.entities;

public class Product {
    public String nome;
    public int unidades;
    public double preco;


    public Product(String name, int unidades, double preco){
        // o construtor, é o método com o mesmo nome da classe
        this.nome = name;
        this.unidades = unidades;
        this.preco = preco;
    
    }

    public Product(String name,double preco){ // sobrecarga, colocar dois metodos com o mesmo nome, porém com argumentos diferentes
        this.nome = name;
        this.preco = preco;
        unidades = 0;
    }

    public double precoEmEstoque(){
        return this.unidades * this.preco;
    }

    public String toString(){
        String produto = String.format("%s , R$ %.2f Reais, %d unidades, Preço Total: %.2f",nome,preco,this.unidades,this.precoEmEstoque()); 
        return produto;
    }

    public void adicionaProduto(int adicional){
        this.unidades += adicional;
    }
    public void retiraProduto(int retirada){
        this.unidades -= retirada;
    }
}
