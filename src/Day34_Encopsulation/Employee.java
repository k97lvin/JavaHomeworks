package Day34_Encopsulation;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private char gender;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == "") {
            return;
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 150) {
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            return;
        }
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, double salary) {
       setName(name);
       setAge(age);
       setGender(gender);
       setSalary(salary);

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/* Create an Employee Class:
            private variables:
                name, gender, age, salary

            Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be zero , negative or greater than 150
                4. salary can not be zero or negative


 */