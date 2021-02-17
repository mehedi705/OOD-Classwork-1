package Scenario_one;

public class Admin {

    void Check_Working_Hour(Employee the_employee) {
        if (the_employee.working_hour > 8) {
            System.out.println("New work assignment.");
        } else {
            System.out.println("Do previous work.");
        }
    }
}
