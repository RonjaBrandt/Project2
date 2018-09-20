package project.pkg2.Employees;


import project.pkg2.UI.Menu;


import static project.pkg2.UI.Main.sc;

public class EmployeeManagement {

    public static void employeeManagementMenu() {
        System.out.println("Employee Management\n"
                + "1. Register employee\n"
                + "2. Delete employee\n"
                + "3. Update name of employee\n"
                + "4. Update the birthdate of employee\n"
                + "5. Update the department of employee\n"
                + "6. Update salary of employee\n"
                + "7. Search employee by name\n"
                + "8. Search employee by ID\n"
                + "9. Search employee by department\n"
                + "10. Display all employees\n"
                + "0. Back to main menu");
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
                        EmployeeList.deleteEmployeeMenu();
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
                        //Stänger av programmet.
                        Menu.startMenu();
                        break;
                    default:
                        System.out.println("Wrong in MEnu 2!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input invalid. Please input a number."
                        + "\nInformation for the admin:"
                        + "\n" + e + "\n");
            }
        }
    }


}

