package POO.forEach;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] lista = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] teste = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.equals(lista,teste));

        for (int a : lista) {
            System.out.println(a);
        }

    }
}
