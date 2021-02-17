package Scenario_one;

public class Employee {

    int employee_id;
    int working_hour;
    String shift;

    Employee(int emp_id, int wrk_hour, String sh) {
        employee_id = emp_id;
        working_hour = wrk_hour;
        shift = sh;
    }

    void Check_Document_Status(Document the_doc) {
        if (the_doc.status == "Good") {
            System.out.println("We can deal.");
        }

        if (the_doc.status == "Done") {
            System.out.println("Proceed.");
        }
    }
}
