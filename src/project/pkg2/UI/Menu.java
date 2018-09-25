package project.pkg2.UI;

import project.pkg2.Employees.EmployeeManagement;
import project.pkg2.Statistics.Statistics;

import static project.pkg2.UI.Main.sc;


/**
 * Star menyn. Det första man ser när man kör programmet.
 */

public class Menu {
    public static void startMenu() {
        while (true) {
            System.out.println("Welcome to the employee program."
                    + "\n[1] Employee management."
                    + "\n[2] Employee statistics."
                    + "\n[0] Exit.");


            int choiceStartMenu;

            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                choiceStartMenu = Integer.parseInt(sc.next());
                sc.nextLine();

                switch (choiceStartMenu) {
                    case 1:
                        //Tar användaren till menyn för Employee Management.
                        EmployeeManagement.employeeManagementMenu();
                        break;
                    case 2:
                        //Tar användaren till menyn för statistik.
                        Statistics.menu3();
                        break;
                    case 0:
                        //Stänger av programmet.
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sorry, unrecognized option.\n");
                }
            } catch (Exception e) {
                System.out.println("Input invalid. Please input a number."
                        +"\nInformation for the admin:"
                        +"\n"+e+"\n");
            }
        }
    }
}
