package POO.ExercicioComposicao.entities;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Contratos {
    private Date inicioContrato;
    private Double valorPorHora;
    private Integer horasDeTrabalho;

    public Contratos(Date inicioContrato, Double valorPorHora, Integer horasDeTrabalho){
        this.inicioContrato = inicioContrato;
        this.valorPorHora = valorPorHora;
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public Date getDate(){
        return this.inicioContrato;
    }

    public double rendaDoContrato(){
        return this.valorPorHora * this.horasDeTrabalho;
    }

    public double getValorPorHora(){
        return this.valorPorHora;
    }
    public Integer getHorasDeTrabalho(){
        return this.horasDeTrabalho;
    }

    public static Date formataData(String inicioContrato) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = sdf.parse(inicioContrato);

        return dataFormatada;
    }
}
