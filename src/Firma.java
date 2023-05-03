import java.util.LinkedList;

public class Firma {
    String title;
    LinkedList<Employee> employees;

    Firma(String title, LinkedList<Employee> employees) {
        this.title = title;
        this.employees = employees;
    }

    public String toString() {
        return "Фирма: " + title + " работники:" + employees;
    }

    //Создайте в классе фирма метод public void paySelaryToAll()
    // - этот метод должен увеличивать количество денег на счету у каждого сотрудника на 3000;
    public void paySelaryToAll() {
        for (Employee employee : employees) {
            if (employee.experience > 2) {
                employee.moneyAccount += 3000 + 3000 * 0.02 * employee.experience;
            } else {
                employee.moneyAccount += 3000;
            }
        }
    }
}


