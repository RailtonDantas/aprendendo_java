package POO.ExercicioComposicao.entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.text.ParseException;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double salary;    
    private String department;
    private List<Contratos> currentContracts;

    public Worker(String name , String department, WorkLevel level, Double salary){
        this.name = name;
        this.department = department;
        this.level = level;
        this.salary = salary;
        this.currentContracts = new ArrayList<>();
    }
    
    public double checkSalaryForThatDate(String date) throws ParseException{
        ZonedDateTime dateOrganized = stringToDate(date).toInstant().atZone(ZoneId.systemDefault());
        int month = dateOrganized.getMonthValue();
        int year = dateOrganized.getYear();
        double totalSalary =  0.0;

        for (Contratos currentContract : this.currentContracts){
            ZonedDateTime currentDate = currentContract.getDate().toInstant().atZone(ZoneId.systemDefault());
            int monthContract = currentDate.getMonthValue();
            int yearContract = currentDate.getYear();

            if (month == monthContract && year == yearContract) {
                totalSalary += currentContract.rendaDoContrato();
            }
        }

        return totalSalary;
    }

    public Date stringToDate(String date)  throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Date dateOrganized = sdf.parse(date);
        return dateOrganized;
    }

    public void addNewContract(Date monthContract, Integer hourPerDay, double salaryPerHour){
        Contratos novoContrato = new Contratos(monthContract, salaryPerHour, hourPerDay);
        currentContracts.add(novoContrato);
    }

    public void setName(String novoNome){
        this.name = novoNome;
    }

    public void setLevel(WorkLevel newLevel){
        this.level = newLevel;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    public void setDepartament(String newDepartament){
        this.department = newDepartament;
    }

    public String getName(){
        return this.name;
    }

    public WorkLevel getLevel(){
        return this.level;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getDepartament(){
        return this.department;
    }
    public List<Contratos> getContracts(){
        return this.currentContracts;
    }
}
