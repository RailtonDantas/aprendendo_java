package POO.Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.Instant;

public class Operacoes {
    public static void main(String[] args){
        LocalDate d01 = LocalDate.parse("2023-04-05");
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate teste = d01.minusDays(10);
        System.out.println(teste);

        Instant teste2 = d03.plus(20,ChronoUnit.HOURS);
        System.out.println(d03);
        System.out.println(teste2);

        Duration duracao = Duration.between(d03, teste2);// duration só funciona para datas que possuem horas/minutos e etc
        System.out.println(duracao.toMinutes());
    }   
}
