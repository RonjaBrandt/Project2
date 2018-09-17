package project.pkg2.UI;

import project.pkg2.Employees.EmployeeManagement;
import project.pkg2.Statistics.Statistics;

import java.util.Scanner;

public class Main {


    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       menu1();
    }

    public static void menu1(){
        while (true) {
            System.out.println("Welcome to the employee program\n"
                    + "1. Employee management\n"
                    + "2. Employee statistics\n"
                    + "0. Exit");

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
            }
        }

    }
}

