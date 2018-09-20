package project.pkg2.Statistics;


import project.pkg2.UI.Menu;

import static project.pkg2.UI.Main.sc;

public class Statistics {
    public static void menu3() {
        System.out.println("Employee Statistics\n"
                + "1. Average wage at the company\n"
                + "2. Maximum salary in the company\n"
                + "3. Minimum salary in the  company\n"
                + "4. Total bonus\n"
                + "5. Women in percentage in the company\n"
                + "6. Men percentage in the company\n"
                + "0. Back to main menu");

        int choiceMenu3 = sc.nextInt();
        sc.nextLine();

        switch(choiceMenu3) {
            case 1:
                CalcStatistics.AverageWage();
                //    EmployeeStatistics.avgWageAtCompany();
                break;
            case 2:
                //    EmployeeStatistics.maxSalaryAtCompany();
                break;
            case 3:
                //    EmployeeStatistics.minSalaryeAtCompany();
                break;
            case 4:
                //    EmployeeStatistics.totalBonus();
                break;
            case 5:
                //    EmployeeStatistics.womanInPercentAtCompany();
                break;
            case 6:
                // EmployeeStatistics.menInPerscentAtCompany();
                break;
            case 0:
                Menu.startMenu();
                break;
            default:
                System.out.println("Wrong in menu 3!");
        }
    }



}
