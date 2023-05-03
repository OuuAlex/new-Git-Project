import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam","Marcovich",1,"courier",500);
        Employee adam = new Employee("Adam","Sandler",26,"actor",10000);
        Employee quentin = new Employee("Quentin", "Tarantino",35, "motion picture producer",50000);
        LinkedList<Employee> employees = new LinkedList<>(List.of(sam,adam,quentin));
        Firma firma1 = new Firma("20th Century Studios",employees);
        System.out.println(firma1);
        firma1.paySelaryToAll();
        System.out.println(firma1);

    }
}