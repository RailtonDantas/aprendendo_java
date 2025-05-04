package POO.contaBancaria.aplication;
import java.util.Scanner;
import POO.contaBancaria.entities.Conta;
import java.util.Locale;

public class Main {
    public void main(String[] args){
        Locale.setDefault(Locale.US);
        System.out.println(Conta.geraNumeroDaConta());
        Scanner sc = new Scanner(System.in);

        System.out.println("------BEM VINDO AO BANCO-----");
        System.out.println("Primeiro, você deve criar sua conta.");
        System.out.println("Insira os dados abaixo");

        System.out.print("Nome do usuário da conta: ");
        String nomeCliente = sc.nextLine();
        
        System.out.print("Você gostaria de colocar um deposito inicial? (Sim/Não) ");
        String depositoInicial = sc.next();

        String numeroDaConta = Conta.geraNumeroDaConta();
        Conta contaDoCliente = new Conta(nomeCliente,numeroDaConta);
  

        if (depositoInicial.trim().equalsIgnoreCase("Sim")){
            System.out.print("Quanto? ");
            double valorInicial = sc.nextDouble();
            contaDoCliente = new Conta(nomeCliente,numeroDaConta,valorInicial);
        }

        while (true) {
            System.out.println();
            System.out.println("Consultar seus dados (1)");
            System.out.println("Depósito (2)");
            System.out.println("Saque (3)");
            System.out.println("Alterar nome (4)");
            System.out.println("Sair (5)");
            System.out.print("Qual operação deseja fazer? ");
            int operacao = sc.nextInt();
            System.out.println();

            if (operacao == 5) break;
            switch (operacao) {
                case 1:
                    contaDoCliente.mostrarDados();
                    break;
                case 2:
                    System.out.print("Qual o valor do depósito? ");
                    double deposito = sc.nextDouble();
                    contaDoCliente.deposito(deposito);
                    contaDoCliente.mostrarDados();
                    break;

                case 3:
                    System.out.print("Qual o valor do saque? ");
                    double saque = sc.nextDouble();
                    contaDoCliente.saque(saque);
                    contaDoCliente.mostrarDados();
                    break;

                case 4:
                    System.out.print("Digite o novo nome: ");
                    sc.nextLine();
                    String novoNome = sc.nextLine();
                    contaDoCliente.setNome(novoNome);
                    contaDoCliente.mostrarDados();
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}
