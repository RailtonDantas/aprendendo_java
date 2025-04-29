import java.util.Locale;

public class saida {
    public static void main(String[] args){
        Locale.setDefault(Locale.US); // isso converte faz meu programa rodar com o pedrão americano, ou seja, '.' como separador decimal

        System.out.println("teste"); // println tem quebra de linha
        System.out.print("teste print"); // print não tem
        System.out.print("teste print"); // print não tem

        double num = 4.89197391;

        System.out.printf("%n%.2f",num); // para formatar numeros no java, essa é a sintaxe
        // '%.(numero de casas decimais)f', pra botar quebra de linha,  só botar '%.2f\n' ou '%.2f%n'

        System.out.printf("%n%.2f",num);
        Locale.setDefault(Locale.US);
        System.out.printf("%n%.2f\n",num);

        // CONCATENAR EM JAVA

        int y = 43;
        System.out.print("Railton tem " + y + " Reais\n");
        // e tem essa forma
        System.out.printf("Railton tem %d reais %n",y);

        // pra conectar varios tipos, faz assim
        int idade = 23;
        String nome = "maria";
        double salario = 4024.56;

        System.out.printf("%s tem %d anos e ganha %.2f reais",nome,idade,salario);
    }   
}
