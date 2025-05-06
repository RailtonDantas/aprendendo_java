package POO.fixacaoListas.entities;
import java.util.ArrayList;
import java.util.List;



public class RecursosHumanos {
    private List<Funcionario> listaDeFuncionarios;

    public RecursosHumanos(){
        this.listaDeFuncionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario funcionarioAtual){
        this.listaDeFuncionarios.add(funcionarioAtual);
    }
    
    public void buscaFuncionario(int idFuncionario,double aumento){
        for (Funcionario funcionarioAtual : this.listaDeFuncionarios ){
            if (funcionarioAtual.getId() == idFuncionario){
                this.aumentaSalario(aumento, idFuncionario);
            }
        }
    }

    public void aumentaSalario(double aumento, int idFuncionario){
        for (Funcionario func : this.listaDeFuncionarios) {
            if (func.getId() == idFuncionario) {
                double novoSalario = func.getSalario() * (1 + aumento/100);
                func.setSalario(novoSalario);
            }
        }
        
    }
    public List<Funcionario> getListaFuncionarios(){
        return this.listaDeFuncionarios;
    }
}
