package POO.fixacaoListas.entities;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;

    public Funcionario(String nome, int id, double salario){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String toString(){
        String funcionario = String.format("%d, %s, R$ %.2f",this.id,this.nome,this.salario);
        return funcionario;
    }

    public String getNome(){
        return this.nome;
    }
    public int getId(){
        return this.id;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }



}
