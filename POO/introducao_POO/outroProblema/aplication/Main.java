package POO.introducao_POO.outroProblema.aplication;
import java.util.Locale;
import java.util.Scanner;

import POO.introducao_POO.outroProblema.entities.Produto;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Produto novoProduto = new Produto();

        novoProduto.cadastraProduto(sc);
        novoProduto.mostraProduto();
        novoProduto.adicionaProduto(sc);
        novoProduto.retiraProduto(sc);
        novoProduto.dadosAtualizados();
        sc.close();
    }    
}
