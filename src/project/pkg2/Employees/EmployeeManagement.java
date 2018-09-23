package project.pkg2.Employees;


import project.pkg2.UI.Menu;


import static project.pkg2.UI.Main.sc;

public class EmployeeManagement {

    public static void employeeManagementMenu() {
        System.out.println("Employee Management menu :\n"
                + "[1] Register an employee.\n"
                + "[2] Delete an employee.\n"
                + "{3] Update the name of an employee.\n"
                + "[4] Update the birthdate of an employee.\n"
                + "[5] Update the department of an employee.\n"
                + "[6] Update the salary of an employee.\n"
                + "[7] Search for an employee by name.\n"
                + "[8] Search for an employee by ID.\n"
                + "[9] Search for employees by department.\n"
                + "[10} Display all employees.\n"
                + "[0] Back to main menu.");
        while (true) {
            int choiceMenu2;
            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                choiceMenu2 = Integer.parseInt(sc.next());
                sc.nextLine();

                switch (choiceMenu2) {
                    case 1:
                        EmployeeList.addEmployee();
                        break;
                    case 2:
                      //  EmployeeList.deleteEmployeeMenu();
                        EmployeeList.searchEmployeeByDepartment();
                        //EmployeeManagement.removeEmployee();
                        break;
                    case 3:
                        EmployeeList.updateNameOfEmployee();
                        // EmployeeManagement.updateNameOfEmployee();
                        break;
                    case 4:
                        EmployeeList.updateAgeOfEmployee();
                        // EmployeeManagement.updateBirthOfEmployee();
                        break;
                    case 5:
                        EmployeeList.updateDepartmentOfEmployee();
                        // EmployeeManagement.updateDepartmentOfEmployee();
                        break;
                    case 6:
                        EmployeeList.updateSalaryOfEmployee();
                        // EmployeeManagement.updateSalaryOfEmployee();
                        break;
                    case 7:
                        EmployeeList.searchEmployeeByName();
                        // EmployeeManagement.searchEmployeeByName();
                        break;
                    case 8:
                        EmployeeList.searchEmployeeByID();
                        // EmployeeManagement.searchEmployeeByID();
                        break;
                    case 9:
                        EmployeeList.searchEmployeeByDepartment();
                        // EmployeeManagement.searchEmployeeByDepartment();
                        break;
                    case 10:

                        EmployeeList.printAllEmployees();
                        break;
                    case 0:

                        Menu.startMenu();
                        break;
                    default:
                        System.out.println("Sorry, unrecognized choice.\n");
                        employeeManagementMenu();
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, you can only use numbers."
                        + "\nInformation for the admin:"
                        + "\n" + e + "\n");
                continue;
            }
        }
    }


}

