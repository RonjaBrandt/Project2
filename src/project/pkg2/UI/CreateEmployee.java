package project.pkg2.UI;


import project.pkg2.Employees.Employee;
import project.pkg2.Employees.EmployeeList;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;


public class CreateEmployee {

    public static void  createEmployeeList(){

        Employee employee1 = new Employee("Ronja", 28, Gender.FEMALE, Title.PROGRAMMER,38500,10) {};
        Employee employee2 = new Employee("Oscar", 27, Gender.MALE, Title.PROGRAMMER,36500,15) {};
        Employee employee3 = new Employee("Chrille", 26, Gender.MALE, Title.PROGRAMMER,30500,10) {};
        Employee employee4 = new Employee("Nayl", 32, Gender.OTHER, Title.PROGRAMMER,42000,5) {};

        Employee employee5 = new Employee("Victoria", 32, Gender.OTHER, Title.TECHNICIAN,28500,10) {};
        Employee employee6 = new Employee("Amir", 45, Gender.MALE, Title.TECHNICIAN,32500,15) {};
        Employee employee7 = new Employee("Klara", 26, Gender.FEMALE, Title.TECHNICIAN,30500,11) {};
        Employee employee8 = new Employee("Sam", 22, Gender.OTHER, Title.TECHNICIAN,40000,2) {};

        Employee employee9 = new Employee("Mohamed", 35, Gender.OTHER, Title.SALESMAN,28500,10) {};
        Employee employee10 = new Employee("Charlie", 27, Gender.FEMALE, Title.SALESMAN,36500,15) {};
        Employee employee11 = new Employee("Calle", 26, Gender.MALE, Title.SALESMAN,30500,10) {};
        Employee employee12 = new Employee("Najem", 32, Gender.MALE, Title.SALESMAN,42000,5) {};

        Employee employee13 = new Employee("Hanna", 55, Gender.OTHER, Title.SECRETARY,38508,10) {};
        Employee employee14 = new Employee("Christoffer", 64, Gender.MALE, Title.SECRETARY,25500,20) {};
        Employee employee15 = new Employee("Raed", 21, Gender.MALE, Title.SECRETARY,33520,10) {};
        Employee employee16 = new Employee("Jens", 37, Gender.OTHER, Title.SECRETARY,42500,17) {};

        EmployeeList.employList.add(employee1);
        EmployeeList.employList.add(employee2);
        EmployeeList.employList.add(employee3);
        EmployeeList.employList.add(employee4);

        EmployeeList.employList.add(employee5);
        EmployeeList.employList.add(employee6);
        EmployeeList.employList.add(employee7);
        EmployeeList.employList.add(employee8);

        EmployeeList.employList.add(employee9);
        EmployeeList.employList.add(employee10);
        EmployeeList.employList.add(employee11);
        EmployeeList.employList.add(employee12);

        EmployeeList.employList.add(employee13);
        EmployeeList.employList.add(employee14);
        EmployeeList.employList.add(employee15);
        EmployeeList.employList.add(employee16);
    }


}

