package POO.encapsulamento;

public class Produto {
    // o padrão, é não deixar os atributos da classe expostos, logo, vc priva os atributos
    // e adiciona valores a eles através de setters, e pega valores deles através de getters
    private String nome;
    private int unidades;
    private double preco;

    public Produto(String nome, int unidades, double preco){
        this.nome = nome;
        this.unidades = unidades;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setUnidades(int unidades){
        this.unidades= unidades;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public int getUnidades(){
        return unidades;
    }
    public double getPreco(){
        return preco;
    }

}