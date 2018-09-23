package project.pkg2.Statistics;


import project.pkg2.UI.Menu;

import static project.pkg2.UI.Main.sc;

public class Statistics {
    public static void statisticsMenu() {
        while (true) {
            System.out.println("Employee Statistics menu :\n"
                    + "[1] To see the average salary of this company.\n"
                    + "[2] To see the maximum salary of this company.\n"
                    + "{3] To see the  minimum salary of this company.\n"
                    + "[4] To see the total cost of the bonus for this company.\n"
                    + "[5] To see how many are women in this company.\n"
                    + "[6] To see how many are mem in this company.\n"
                    + "[0] Back to main menu.");

            int choiceStatisticsMenu;
            try {
                //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                choiceStatisticsMenu = Integer.parseInt(sc.next());
                sc.nextLine();

                switch (choiceStatisticsMenu) {
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
            } catch (NumberFormatException e) {
                System.out.println("Sorry, you can only use numbers."
                        + "\nInformation for the admin:"
                        + "\n" + e + "\n");
            }
        }



    }
}
