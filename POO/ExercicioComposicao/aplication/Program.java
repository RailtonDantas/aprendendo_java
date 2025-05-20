package POO.ExercicioComposicao.aplication;
import POO.ExercicioComposicao.entities.Contratos;
import POO.ExercicioComposicao.entities.Worker;
import POO.ExercicioComposicao.entities.WorkLevel;
import java.text.ParseException;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name: ");
        String departament = sc.nextLine();

        System.out.println("Enter Worker data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        WorkLevel level = WorkLevel.valueOf(sc.next());
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker currentWorker = new Worker(name,departament,level,salary);

        System.out.print("How many contracts to this worker: ");
        int numberOfContracts = sc.nextInt();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.printf("Enter data of contract number #%d in the system \n",i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            System.out.print("Hourly rate: ");
            double hourlyRate = sc.nextDouble();
            System.out.print("Duration (hours: ");
            int durationHours = sc.nextInt();

            currentWorker.addNewContract(Contratos.formataData(date),durationHours,hourlyRate);
        }
        sc.nextLine();

        System.out.print("Enter a date to see the worker's salary for that month (MM/YYYY): ");
        String dateToCheck = sc.nextLine();
        double fullSalary = currentWorker.checkSalaryForThatDate(dateToCheck) + currentWorker.getSalary();
        System.out.printf("O salário foi %.2f",fullSalary);


        
        sc.close();
    }
}
