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
                //Räknar ut medellönen
                CalcStatistics.AverageWage();
                break;
            case 2:
                //Räknar ut den med högst lön
                CalcStatistics.maxWage();
                break;
            case 3:
                //Räknar ut den med minst lön
                CalcStatistics.minWage();
                break;
            case 4:
                //Räknar ut den totala bonusen inom företaget
                CalcStatistics.totalBonus();
                break;
            case 5:
                //Räknar ut hur många procent som är kvinnor i företaget
                CalcStatistics.percentageWomen();
                break;
            case 6:
                //Räknar ut hur många procent som är män i företaget
                CalcStatistics.percentageMen();
                break;
            case 0:
                //Går tillbaka till huvudmenyn
                Menu.startMenu();
                break;
            default:
                System.out.println("Wrong entry!");
        }
    }



}
