package project.pkg2.UI;

import project.pkg2.Employees.EmployeeManagement;
import project.pkg2.Statistics.Statistics;

import static project.pkg2.UI.Main.sc;


public class Menu {
    public static void startMenu(){
        while (true) {
            System.out.println("Welcome to the employee program."
                    + "\n[1] Employee management."
                    + "\n[2] Employee statistics."
                    + "\n[0] Exit.");

            int choiceMenu1 = sc.nextInt();
            sc.nextLine();

            switch (choiceMenu1) {
                case 1:
                    EmployeeManagement.menu2();
                    break;
                case 2:
                    Statistics.menu3();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong in Main");
                    continue;
            }
        }
    }
}
