package POO.BoxingUnboxingWrapper;

public class Assunto {
    public static void main(String[] args){
        int x = 10;
        Object obj = x; // isso é o boxing
        System.out.println(x);

        int y = (int) obj; // isso é o unboxing
        System.out.println(y);

        // Wrapper classes são as classe que buscam representar os tipos primitivos, por exemplo:
        Number a = 3;
        int ab = 10;
        Integer teste = ab; // dessa forma, eu posso fazer o unboxing sem ter que fazer castig dps
        int teste2 = teste; // assim
        System.out.println(a);
        System.out.println(teste);
        System.out.println(teste2);
    }
}
