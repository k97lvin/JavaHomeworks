package Switch_Statements.ScrumTeam;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void isTesting(){
        System.out.println(name + " is testing");
    }


}
