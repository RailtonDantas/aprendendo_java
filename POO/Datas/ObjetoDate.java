package POO.Datas;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ObjetoDate {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 17:42:12");
        Date y3 = sdf3.parse("25/06/2018");

        System.out.println(sdf1.format(y1));
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(new Date()); // mostra o instante atual
        
    }
}
