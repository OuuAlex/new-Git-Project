public class Employee {
    String firstName;
    String secondName;
    int experience;
    String jobTitle;
    double moneyAccount;
    Employee(String firstName, String secondName, int experience, String jobTitle, double moneyAccount){
        this.firstName = firstName;
        this.secondName = secondName;
        this.experience = experience;
        this.jobTitle = jobTitle;
        this.moneyAccount = moneyAccount;
    }
    public String toString (){
        return "имя: " + firstName +
                " фамилия:" + secondName +
                " стаж: " + experience +
                " дожность: " + jobTitle +
                " денежный счет: " + moneyAccount;
    }
}
