package parte_basica;

public class cast {
    public static void main(String[] args){
      int x,y;
      double resultado = 0.0;
      x = 5;
      y = 2;

      resultado = x / y; // aqui, como é uma divisão de 2 numeros inteiros, ele vai querer retornar numeros inteiros, logo, isso
      // retorna 2
      // para resolver isso, basta declarar x,y como double, ou fazer o casting:
      resultado = (double) x / y; // isso é o casting, a conversão explicita de tipos
      System.out.println(resultado);

      // EXEMPLO
      double a = 5.0;
      int b = 2;

      b = (int) a; // da erro pois b é int e a é double, logo, não da pr aconverter int para double dessa forma
      //tem que fazer o casting
      System.out.println(a);
      System.out.println(b);
      
      
    }
}
