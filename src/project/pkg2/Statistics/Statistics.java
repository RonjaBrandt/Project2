package project.pkg2.Statistics;

import project.pkg2.UI.Main;

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
                Main.menu1();
                break;
            default:
                System.out.println("Wrong in menu 3!");
        }
    }




    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
