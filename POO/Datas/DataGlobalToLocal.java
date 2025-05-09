package POO.Datas;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataGlobalToLocal {
    public static void main(String[] args){

       Instant tempo = Instant.parse("2025-05-09T01:12:17Z");
       //DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
       System.out.println(tempo);

    //    for (String s : ZoneId.getAvailableZoneIds()){
    //         System.out.println(s);
    //    }

       LocalDate dataAtual = LocalDate.ofInstant(tempo, ZoneId.systemDefault());
       LocalDate dataAtual2 = LocalDate.ofInstant(tempo, ZoneId.of("Pacific/Guadalcanal"));
       System.out.println(dataAtual);
       System.out.println(dataAtual2);

       Instant teste = Instant.now();
       DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("Pacific/Guadalcanal"));

       System.out.println(teste);
       System.out.println(fmt2.format(teste));
    }
}
