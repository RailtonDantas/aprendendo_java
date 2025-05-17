package POO.enumeracoes.aplication;
import POO.enumeracoes.entities.PedidoStatus;
import POO.enumeracoes.entities.Pedidos;
import java.util.Date;

public class Pedido {
    public static void main(String[] args){
        Pedidos pedido = new Pedidos(1590,PedidoStatus.PROCESSING,new Date());
        System.out.println(pedido.toString());
    }
}
