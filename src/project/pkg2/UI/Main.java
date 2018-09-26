package project.pkg2.UI;


import java.util.Scanner;

public class Main {

    /*
     * Scanner för som återanvänds i alla andra classer.
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Menu.startMenu();
    }
}

