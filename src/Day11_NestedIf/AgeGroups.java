package Day11_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 1;
        String st = "";
        if (age >= 0 && age <= 150) {
            st = ( age < 21) ? "Teeneger" : (age >= 21 && age < 55) ? "Adult" : "senior";

        } else {
            System.out.println("invalid number");
        }
        System.out.println(st);

    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */