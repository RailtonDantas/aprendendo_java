package POO.fixacaoListas.apllication;
import POO.fixacaoListas.entities.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos empregados serão cadastrados? ");
        int quantidadeFuncionarios = sc.nextInt();

        RecursosHumanos rhEmpresa = new RecursosHumanos();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("\nEmpregado " + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionarioAtual = new Funcionario(nome, id, salario);
            rhEmpresa.adicionaFuncionario(funcionarioAtual);
        }
        sc.nextLine();

        System.out.print("\nDigite o Id do funcionário que receberá um aumento: ");
        int idFuncionario = sc.nextInt();

        System.out.print("Digite a porcentagem do aumento: ");
        double porcentagem = sc.nextDouble();

        rhEmpresa.aumentaSalario(porcentagem, idFuncionario);

        for (Funcionario func : rhEmpresa.getListaFuncionarios()){
            System.out.println(func);
        }
        sc.close();
    }
}
