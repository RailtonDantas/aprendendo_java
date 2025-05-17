package POO.enumeracoes.entities;
import POO.enumeracoes.entities.PedidoStatus;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.TimeZone;

public class Pedidos {
    private final Integer id;
    private PedidoStatus status;
    private final Date momento;

    public Pedidos(){
        this.id = null;
        this.status = null;
        this.momento = null;
    }

    public Pedidos(Integer id, PedidoStatus status,Date momento){
        this.id = id;
        this.status = status;
        this.momento = momento;
    }

    public void setStatus(PedidoStatus status){
        this.status = status;
    }
    public int getId(){
        return this.id;
    }
    public PedidoStatus getStatus(){
        return this.status;
    }
    public Date getMomento(){
        return this.momento;
    }

    public String toString(){
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        sdf1.setTimeZone(TimeZone.getDefault());
        String dataLocal = sdf1.format(this.momento);
        String resultadoFinal = String.format("Id: %d , Data: %s, Status: %s",this.id,dataLocal,this.status);
        return resultadoFinal;
    }
}
