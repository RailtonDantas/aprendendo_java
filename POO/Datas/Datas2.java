package POO.Datas;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class Datas2 {
    public static void main(String[] args){
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataHoje = LocalDateTime.now();
        String dataFormatada = dataHoje.format(fmt1);
        System.out.println(dataFormatada);


        Instant formatandoInstant = Instant.now();
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println(fmt2.format(formatandoInstant));

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE.withZone(ZoneId.systemDefault());
        System.out.println(fmt4.format(formatandoInstant));
        
    }
}
