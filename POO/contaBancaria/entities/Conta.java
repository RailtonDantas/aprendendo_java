package POO.contaBancaria.entities;

public class Conta {
    private String nome;
    private final String numeroDaConta;
    private double depositoInicial = 0;
    private double saldo = 0;

    

    public Conta(String nome,String numeroConta, double depositoInicial){
        this.nome = nome;
        this.numeroDaConta = numeroConta;
        this.depositoInicial = depositoInicial;
        this.saldo = depositoInicial;
    }
    
    public Conta(String nome, String numeroConta){
        this.nome = nome;
        this.numeroDaConta = numeroConta;
        this.saldo = depositoInicial;
    }

    public String getNome(){
        return this.nome;
    }
    public String getNumeroDaConta(){
        return this.numeroDaConta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        this.saldo -= 5;
        this.saldo -= valor;
    }

    public static String geraNumeroDaConta(){
        String numConta = "";

        for (int i = 0; i < 4; i++) {
            numConta += String.valueOf((int)(Math.random() * 10));
        }

        return numConta;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.numeroDaConta);
        System.out.printf("Saldo: R$ %.2f Reais\n",this.saldo);
    }
}
