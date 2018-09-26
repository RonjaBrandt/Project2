package project.pkg2.Employees;

import project.pkg2.Employees.Proffesions.Programmer;
import project.pkg2.Employees.Proffesions.Salesman;
import project.pkg2.Employees.Proffesions.Secretary;
import project.pkg2.Employees.Proffesions.Technician;
import project.pkg2.UI.Menu;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

import java.util.ArrayList;


import static project.pkg2.UI.Main.sc;

public class EmployeeList extends Employee {

    public static ArrayList<Employee> employList = new ArrayList<>();

    public EmployeeList(String name, int age, Gender gender, Title title, double salary, double bonus) {
        super(name, age, gender, title, salary, bonus);
    }


    public static void addEmployee() {

        boolean done = false;
        while (!done) {
            System.out.println("Please write the name of the new employee :");
            String name = sc.nextLine();
            int age = 0;
            while (age == 0) {
                try {
                    System.out.println("Age of the employee: ");
                    //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                    age = Integer.parseInt(sc.next());
                    sc.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, you can only use numbers."
                            + "\nInformation for the admin:"
                            + "\n" + e + "\n");
                    continue;
                }
            }

            Gender gender = null;
            int choiceGender;

            while (gender == null) {
                try {
                    System.out.println("Please state the gender of the employee : \n"
                            + "[1] for male.\n"
                            + "[2] for female.\n"
                            + "[3] for unspecified. ");
                    //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                    choiceGender = Integer.parseInt(sc.next());
                    sc.nextLine();
                    switch (choiceGender) {
                        case 1:
                            gender = Gender.MALE;
                            break;
                        case 2:
                            gender = Gender.FEMALE;
                            break;
                        case 3:
                            gender = Gender.OTHER;
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                            continue;
                    }
                } catch (NumberFormatException e1) {
                    System.out.println("Sorry, you can only use numbers."
                            + "\nInformation for the admin:"
                            + "\n" + e1 + "\n");
                    continue;
                }

            }

            int choiceProfession;
            double salary = 0;
            double bonus = 0;
            Title title = null;
            while (title == null) {
                System.out.println("Assing the correct title, please. "
                        + "\n[1] Programmer."
                        + "\n[2] Technician."
                        + "\n[3] Secretary."
                        + "\n[4] Salesdepartment.");
                try {
                    //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                    choiceProfession = Integer.parseInt(sc.next());
                    sc.nextLine();

                    switch (choiceProfession) {
                        case 1:
                            title = Title.PROGRAMMER;
                            Programmer programmer = new Programmer(name, age, gender, title, salary, bonus);

                            while (salary == 0) {
                                System.out.println("Enter the salary of the employee: ");
                                try {
                                    salary = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }

                            programmer.setSalary(salary);
                            salary = programmer.getSalary();

                            while (bonus == 0) {
                                System.out.println("Enter the the bonus for the employee in percentage, please: ");
                                try {
                                    bonus = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            programmer.setBonus(bonus);
                            programmer.setId();
                            break;
                        case 2:
                            title = Title.TECHNICIAN;
                            Technician technician = new Technician(name, age, gender, title, salary, bonus);
                            while (salary == 0) {
                                System.out.println("Enter the salary of the employee: ");
                                try {
                                    salary = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            technician.setSalary(salary);
                            salary = technician.getSalary();
                            while (bonus == 0) {
                                System.out.println("Enter the the bonus for the employee in percentage, please: ");
                                try {
                                    bonus = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            technician.setBonus(bonus);
                            technician.setId();
                            break;
                        case 3:
                            title = Title.SECRETARY;
                            Secretary secretary = new Secretary(name, age, gender, title, salary, bonus);
                            while (salary == 0) {
                                System.out.println("Enter the salary of the employee: ");
                                try {
                                    salary = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            secretary.setSalary(salary);
                            salary = secretary.getSalary();
                            System.out.println("Enter the the bonus for the employee in percentage, please: ");
                            while (bonus == 0) {
                                System.out.println("Enter the the bonus for the employee in percentage, please: ");
                                try {
                                    bonus = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            secretary.setId();
                            break;
                        case 4:
                            title = Title.SALESMAN;
                            Salesman salesman = new Salesman(name, age, gender, title, salary, bonus);
                            while (salary == 0) {
                                System.out.println("Enter the salary of the employee: ");
                                try {
                                    salary = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            salesman.setSalary(salary);
                            salary = salesman.getSalary();
                            while (bonus == 0) {
                                System.out.println("Enter the the bonus for the employee in percentage, please: ");
                                try {
                                    bonus = Double.parseDouble(sc.next());
                                    sc.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Sorry, you can only use numbers."
                                            + "\nInformation for the admin:"
                                            + "\n" + e + "\n");
                                }
                            }
                            salesman.setBonus(bonus);
                            salesman.setId();
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                            continue;
                    }
                } catch (NumberFormatException e2) {
                    System.out.println("Sorry, you can only use numbers."
                            + "\nInformation for the admin:"
                            + "\n" + e2 + "\n");
                    continue;
                }
            }


            Employee employee = new Employee(name, age, gender, title, salary, bonus) {
            };

            System.out.println("Do you want to add this employee: "
                    + "\n" + employee.toStringNoID());


            int choiceDone;
            boolean done2 = false;
            while (!done2) {
                try {
                    System.out.println("\n[1] Yes. | [2] No, I want to start over.");
                    //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                    choiceDone = Integer.parseInt(sc.next());
                    sc.nextLine();

                    switch (choiceDone) {
                        case 1:

                            employList.add(employee);

                            System.out.println("Employee created. Returning to the previous menu.");
                            EmployeeManagement.employeeManagementMenu();
                            break;
                        case 2:
                            continue;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                            continue;
                    }
                } catch (NumberFormatException e3) {
                    System.out.println("Sorry, you can only use numbers."
                            + "\nInformation for the admin:"
                            + "\n" + e3 + "\n");
                    continue;
                }
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }


    public static void deleteEmployeeMenu() {
        System.out.println("[1] Delete employee by name.\n"
                + "[2] Delete employee by ID.\n"
                + "[0] Back to main menu.");
        int choice;
        try {
            //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
            choice = Integer.parseInt(sc.next());
            sc.nextLine();

            switch (choice) {
                case 1:
                    deleteEmployeeByName();
                    break;
                case 2:
                    deleteEmployeeByID();
                    break;
                case 0:
                    Menu.startMenu();
                default:
                    System.out.println("Sorry, unrecognized option.\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Sorry, you can only use numbers."
                    + "\nInformation for the admin:"
                    + "\n" + e + "\n");
        }
    }


    public static void deleteEmployeeByName() {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the person you want to delete: ");
        while (!done) {

            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    index = employList.indexOf(employee);

                    System.out.println("Do you want to delete this employee named : " + name);
                    System.out.println("[1] Yes / [2] No, this is the wrong employee.");
                    test = false;
                    int choice;
                    try {
                        //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                        choice = Integer.parseInt(sc.next());
                        sc.nextLine();
                        switch (choice) {
                            case 1:
                                employList.remove(index);
                                System.out.println("The employees name has been updated.");
                                done = true;
                                break;
                            case 2:
                                deleteEmployeeByName();
                                /*System.out.println("Enter name on person you want to delete: ");*/
                                break;
                            default:
                                System.out.println("Sorry, unrecognized option.\n");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Sorry, you can only use numbers."
                                + "\nInformation for the admin:"
                                + "\n" + e + "\n");
                    }
                }
            }
            if (test) { // om den inte sätmmer första gången gör detta

                System.out.println("No employee found by the name of " + name + "."
                        + "\nReturning to previous menu.\n");
                EmployeeManagement.employeeManagementMenu();
            }
            EmployeeManagement.employeeManagementMenu();

        }


    }


    public static void deleteEmployeeByID() {
        boolean done = false;
        System.out.println("Enter the ID of the employee you want to delete: ");
        while (done == false) {
            int personID;
            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                personID = Integer.parseInt(sc.next());
                sc.nextLine();

                for (Employee employee : employList) {
                    if (employee.getId() == personID) {
                        System.out.println("Do you want to delete this employee: " + employee);
                        System.out.println("[1] Yes / [2] No, wrong employee.");


                        int choice;
                        try {
                            //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                            choice = Integer.parseInt(sc.next());
                            sc.nextLine();
                            switch (choice) {
                                case 1:
                                    employList.remove(employee);
                                    System.out.println("The employee has been removed.");
                                    done = true;
                                    break;
                                case 2:
                                    deleteEmployeeByID();
                                    /*System.out.println("Enter ID on person you want to delete: ");*/
                                    break;
                                default:
                                    System.out.println("Sorry, unrecognized option.\n");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Sorry, you can only use numbers."
                                    + "\nInformation for the admin:"
                                    + "\n" + e + "\n");
                        }
                    } else {
                        System.out.println("No employee found by the name of " + personID + "."
                                + "\nReturning to previous menu.\n");
                        EmployeeManagement.employeeManagementMenu();
                    }
                }
            } catch (NumberFormatException e1) {
                System.out.println("Sorry, you can only use numbers."
                        + "\nInformation for the admin:"
                        + "\n" + e1 + "\n");

            }

            EmployeeManagement.employeeManagementMenu();
        }
    }


    public static void updateNameOfEmployee() {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the employee you want to update: ");
        while (!done) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    index = employList.indexOf(employee);
                    System.out.println("New name of the employee: ");
                    String newName = sc.nextLine();
                    System.out.println("Do you want to set this employees name to:" + newName);
                    System.out.println("[1] Yes / [2] No.");
                    test = false;
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            Employee employee1 = new Employee(newName, employee.getAge(), employee.getGender(),
                                    employee.getTitle(), employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee1);
                            System.out.println("The name of the employee has been updated.");
                            done = true;
                            break;

                        case " 2":
                            updateNameOfEmployee();
                            /*System.out.println("ID on person you want to update: ");*/
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                    }
                }
            }
            if (test) { // om den inte sätmmer första gången gör detta

                System.out.println("No employee found by the name of " + name + "."
                        + "\nReturning to previous menu.\n");
                EmployeeManagement.employeeManagementMenu();
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }


    public static void updateAgeOfEmployee() {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the employee you want to update: ");
        while (!done) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    index = employList.indexOf(employee);
                    System.out.println("New age of the employee: ");
                    String newAge = sc.nextLine();


                    System.out.println("Do you want to set this employees age to: " + newAge);
                    System.out.println("[1] Yes / [2] No.");
                    test = false;
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            Employee employee1 = new Employee(employee.getName(), Integer.parseInt(newAge), employee.getGender(),
                                    employee.getTitle(), employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee1);
                            System.out.println("The age of the employee has been updated.");
                            done = true;
                            break;

                        case " 2":
                            updateAgeOfEmployee();
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                    }
                }
            }
            if (test) { // om den inte sätmmer första gången gör detta

                System.out.println("No employee found by the name of " + name + "."
                        + "\nReturning to previous menu.\n");
                EmployeeManagement.employeeManagementMenu();
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }


    public static void updateDepartmentOfEmployee() {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the employee you want to update: ");
        while (!done) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    index = employList.indexOf(employee);
                    System.out.println(employee.getName() + "s current department is : " + employee.getTitle()
                            +"\nWhat department would you like to transfer " + employee.getName() + " to?"
                            +"\n[1] " + Title.PROGRAMMER
                            +"\n[2] " + Title.SALESMAN
                            +"\n[3] " + Title.TECHNICIAN
                            +"\n[4] " + Title.SECRETARY);

                    test=false;
                    String choiceDepartment =sc.nextLine();
                    switch (choiceDepartment){
                        case "1":
                            Title newTitle1 = Title.PROGRAMMER;
                            Employee employee1 = new Employee(employee.getName(), employee.getAge(), employee.getGender(),
                                    newTitle1, employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee1);
                            System.out.println("The department of the employee has been updated.");
                            done = true;
                            break;
                        case "2":
                            Title newTitle2 = Title.SALESMAN;
                            Employee employee2 = new Employee(employee.getName(), employee.getAge(), employee.getGender(),
                                    newTitle2, employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee2);
                            System.out.println("The department of the employee has been updated.");
                            done = true;
                            break;
                        case "3":
                            Title newTitle3 = Title.TECHNICIAN;
                            Employee employee3 = new Employee(employee.getName(), employee.getAge(), employee.getGender(),
                                    newTitle3, employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee3);
                            System.out.println("The department of the employee has been updated.");
                            done = true;
                            break;
                        case "4":
                            Title newTitle4 = Title.SECRETARY;
                            Employee employee4 = new Employee(employee.getName(), employee.getAge(), employee.getGender(),
                                    newTitle4, employee.getSalary(), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee4);
                            System.out.println("The department of the employee has been updated.");
                            done = true;
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                    }

                }
            }
            if (test) { // om den inte stämmer första gången gör detta

                System.out.println("No employee found by the name of " + name + "."
                        + "\nReturning to previous menu.\n");
                EmployeeManagement.employeeManagementMenu();
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }

    public static void updateSalaryOfEmployee() {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the employee you want to update: ");
        while (!done) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    index = employList.indexOf(employee);
                    System.out.println("The current salary of this employee is : " + employee.getSalary());
                    System.out.println("Please enter the new salary of this employee : ");
                    String newSalary = sc.nextLine();
                    System.out.println("Do you want to set this employees age to: " + newSalary);
                    System.out.println("[1] Yes / [2] No.");
                    test = false;
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            Employee employee1 = new Employee(employee.getName(), employee.getAge(), employee.getGender(),
                                    employee.getTitle(), Double.parseDouble(newSalary), employee.getFinalBonus()) {
                            };
                            employList.set(index, employee1);
                            System.out.println("The salary of the employee has been updated.");
                            done = true;
                            break;

                        case "2":
                            updateSalaryOfEmployee();
                            break;
                        default:
                            System.out.println("Sorry, unrecognized option.\n");
                    }
                }
            }
            if (test) { // om den inte sätmmer första gången gör detta

                System.out.println("No employee found by the name of " + name + "."
                        + "\nReturning to previous menu.\n");
                EmployeeManagement.employeeManagementMenu();
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }








    public static void searchEmployeeByName () {
        boolean done = false;
        boolean test = true;
        System.out.println("Enter the id of the employee you want to update: ");
        while (!done) {
            String searchId = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(searchId)) {
                    test = false;
                    System.out.println("the employee by searchId : " + employee.getName() + " EXISTS.");
                    System.out.println(employee.toString());
                }
                if (test) { // om den inte sätmmer första gången gör detta

                    System.out.println("No employee found by the searchId of " + searchId + "."
                            + "\nReturning to previous menu.\n");
                    EmployeeManagement.employeeManagementMenu();
                }
            }
            EmployeeManagement.employeeManagementMenu();
        }

    }

    public static void searchEmployeeByID () {
        boolean done = false;
        boolean test = true;
        int index = 0;
        System.out.println("Enter the name of the employee you want to update: ");
        while (!done) {
            String name = sc.nextLine();
            for (Employee employee : employList) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    test = false;
                    index = employList.indexOf(employee);
                    System.out.println("the employee by name : " + employee.getName() + " EXISTS.");
                    System.out.println(employee.toString());
                }
                if (test) { // om den inte sätmmer första gången gör detta

                    System.out.println("No employee found by the name of " + name + "."
                            + "\nReturning to previous menu.\n");
                    EmployeeManagement.employeeManagementMenu();
                }
            }
            EmployeeManagement.employeeManagementMenu();
        }

    }



    public static void searchEmployeeByDepartment () {    // Lista alla employees per dep.
        ArrayList<Employee> programmers = new ArrayList<>();
        ArrayList<Employee> salesman = new ArrayList<>();
        ArrayList<Employee> secretary = new ArrayList<>();
        ArrayList<Employee> technician = new ArrayList<>();

        for (Employee employee : EmployeeList.employList) {
            if (employee.getTitle().equals(Title.PROGRAMMER)) {
                programmers.add(employee);
            }
            if (employee.getTitle().equals(Title.SALESMAN)) {
                salesman.add(employee);
            }
            if (employee.getTitle().equals(Title.SECRETARY)) {
                secretary.add(employee);
            }
            if (employee.getTitle().equals(Title.TECHNICIAN)) {
                technician.add(employee);
            }
        }

        System.out.println("Please select department."
                + "\n[1] Programmers."
                + "\n[2] Salesmen."
                + "\n[3] Secretaries."
                + "\n[4] Technicians. "
                + "\n[5] See the menu again."
                + "\n[0] Go back.");
        boolean gogo = true;
        while (gogo) {
            int choice;
            int progs = 0;
            int sales = 0;
            int techs = 0;
            int secre = 0;

            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                choice = Integer.parseInt(sc.next());
                sc.nextLine();
                switch (choice) {

                    case 1:   // prog
                        for (Employee employee : programmers) {
                            progs++;
                            System.out.println("In the category programmers we have : " + employee.toString());
                            searchEmployeeByDepartment();


                        }
                        break;
                    case 2: // sale
                        for (Employee employee : salesman) {
                            sales++;
                            System.out.println("In the category salesdepartment we have : " + employee.toString());
                            searchEmployeeByDepartment();


                        }
                        break;
                    case 3: // secre
                        for (Employee employee : secretary) {
                            secre++;
                            System.out.println("In the category secretarys we have : " + employee.toString());
                            searchEmployeeByDepartment();


                        }
                        break;
                    case 4: // tech
                        for (Employee employee : technician) {
                            techs++;
                            System.out.println("In the category technicians we have : " + employee.toString());
                            searchEmployeeByDepartment();


                        }
                        break;
                    case 5:
                        searchEmployeeByDepartment();
                        break;
                    case 0:
                        EmployeeManagement.employeeManagementMenu();
                        break;
                    default:
                        System.out.println("Sorry, unrecognized choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry,you can only use numbers."
                        + "\nInformation for the admin:"
                        + "\n" + e + "\n");
            }
        }
        EmployeeManagement.employeeManagementMenu();
    }

    public static void printAllEmployees () {
        for (Employee employee : employList) {
            System.out.println(employee.toString());
        }
        EmployeeManagement.employeeManagementMenu();
    }
}
