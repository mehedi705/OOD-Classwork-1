package Scenario_one;

/**
 * main
 */
public class main_driver {

    public static void main(String[] args) {

        Employee Mehedi = new Employee(390, 10, "Day"); // Arrenged by (ID, Working hour, Shift)
        Employee Ismail = new Employee(427, 8, "Night");

        Admin admin1 = new Admin();

        Document doc1 = new Document("Good");
        Document doc2 = new Document("Done");

        // About Mehedi
        System.out.println("Employee : Mehedi");
        System.out.println("ID : " + Mehedi.employee_id);
        System.out.println("Working hour : " + Mehedi.working_hour);
        System.out.println("Shift : " + Mehedi.shift);

        // Admin check Mehedi's working hour
        System.out.print("Working Status : ");
        admin1.Check_Working_Hour(Mehedi);

        System.out.println();

        // About Ismail
        System.out.println("Employee : Ismail");
        System.out.println("ID : " + Ismail.employee_id);
        System.out.println("Working hour : " + Ismail.working_hour);
        System.out.println("Shift : " + Ismail.shift);

        // Admin check Ismail's working hour
        System.out.print("Working Status : ");
        admin1.Check_Working_Hour(Ismail);

        System.out.println();

        // Employee's can check document status
        System.out.print("doc1 : ");
        Mehedi.Check_Document_Status(doc1);

        System.out.print("doc2 : ");
        Ismail.Check_Document_Status(doc2);

        System.exit(0);
    }
}