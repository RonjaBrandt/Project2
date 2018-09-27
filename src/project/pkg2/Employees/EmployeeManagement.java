package project.pkg2.Employees;


import project.pkg2.UI.Menu;


import static project.pkg2.UI.Main.sc;

public class EmployeeManagement {

    public static void employeeManagementMenu() {
        System.out.println("Employee Management menu :"
                + "\n[1] Register an employee."
                + "\n[2] Delete an employee."
                + "\n{3] Update the name of an employee."
                + "\n[4] Update the age of an employee."
                + "\n[5] Update the department of an employee."
                + "\n[6] Update the salary of an employee."
                + "\n[7] Search for an employee by name."
                + "\n[8] Search for an employee by ID."
                + "\n[9] Search for employees by department."
                + "\n[10] Display all employees."
                + "\n[0] Back to main menu.");
        while (true) {
            int choiceMenu2; // int för att välja i switch.
            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                choiceMenu2 = Integer.parseInt(sc.next());
                sc.nextLine();

                switch (choiceMenu2) {
                    case 1: // gör en ny employee
                        EmployeeList.addEmployee();
                        break;
                    case 2: // tar dig till menyn för att ta bort  anställda.
                        EmployeeList.deleteEmployeeMenu();
                        break;
                    case 3: // uppdaterar namn för en specifik anställd.
                        EmployeeList.updateNameOfEmployee();
                        break;
                    case 4: // uppdaterar åldern för en specifik anställd.
                        EmployeeList.updateAgeOfEmployee();
                        break;
                    case 5: // uppdaterar titeln för en anställd.
                        EmployeeList.updateDepartmentOfEmployee();
                        break;
                    case 6: // uppdaterar lön för en specifik anställd.
                        EmployeeList.updateSalaryOfEmployee();
                        break;
                    case 7: //  söker efter en anställd via namn.
                        EmployeeList.searchEmployeeByName();
                        break;
                    case 8: // söker efter en anställd via ID.
                        EmployeeList.searchEmployeeByID();
                        break;
                    case 9: // söker efter en ansätlld via titel / avdelning.
                        EmployeeList.searchEmployeeByDepartment();
                        break;
                    case 10: // visar alla anställda.
                        EmployeeList.printAllEmployees();
                        break;
                    case 0: // här går vi tillbaka till start av program.
                        Menu.startMenu();
                        break;
                    default:
                        System.out.println("Sorry, unrecognized choice.\n");
                        continue;
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

