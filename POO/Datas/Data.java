package POO.Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args){
        LocalDate teste = LocalDate.now(); // LocalDate é para trabalhar com horário local sem horas, apenas datas
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("teste, intanciado com LocalDate: " + teste);

        LocalDateTime teste2 = LocalDateTime.now(); // LocalDateTime também é para horário local, porém, trabalha com horas
        System.out.println("teste, instanciado com LocalDateTime: " + teste2);

        Instant teste3 = Instant.now(); // instant trabalha com fuso horário, ou seja, hora global
        Instant teste5 = Instant.parse("2022-12-03T20:10:50.90-06:30");
        LocalDate teste6 = LocalDate.parse("22/07/2025",fmt); // eu posso colocar um padrão que eu quero pra formatar
        // nesse caso, o fmt é o pattern que eu quero que o parse siga;
        System.out.println(teste3);
        System.out.println(teste5);
        System.out.println(teste6);


        LocalDate dataAtual = LocalDate.of(2025,12,23);
        System.out.println(dataAtual);

    }   
}
