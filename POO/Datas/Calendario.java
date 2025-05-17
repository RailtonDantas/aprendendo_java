package POO.Datas;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class Calendario {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2022-09-23T13:32:59Z"));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        
    }
}
