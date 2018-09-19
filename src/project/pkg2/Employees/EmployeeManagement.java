package project.pkg2.Employees;


import project.pkg2.Statistics.CalcStatistics;
import project.pkg2.UI.Main;
import project.pkg2.UI.Menu;


import static project.pkg2.UI.Main.sc;

public class EmployeeManagement {

    public static void menu2() {
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

        int choiceMenu2 = sc.nextInt();
        sc.nextLine();

        switch(choiceMenu2) {
            case 1:
                EmployeeList.addEmployee();
                break;
            case 2:
                EmployeeList.deleteMenu();
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

                // EmployeeManagement.searchEmployeeByDepartment();
                break;
            case 10:
              EmployeeList.printAllEmployees();
                break;
            /*
             *Takes the user back to the first menu i Main
             */
            case 0:
                Menu.menu1();
                break;
            default:
                System.out.println("Wrong in MEnu 2!");
        }
    }


}

