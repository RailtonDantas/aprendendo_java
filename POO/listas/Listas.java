package POO.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){
        List <Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        lista.add(34);
        lista.addLast(10);
        lista.remove(lista.size() - 1);
        lista.removeIf(x -> x < 4);
    
        for (int i = 0; i < 20; i++) {
            int numAleatorio = (int)(Math.random() * 10);   
            lista.add(numAleatorio);
        }

        List<Integer> filtrados = new ArrayList<>();
        filtrados = lista.stream().filter(x -> x > 4 && x < 9).collect(Collectors.toList());
        System.out.println(filtrados);

        System.out.println(lista);
    }
}
