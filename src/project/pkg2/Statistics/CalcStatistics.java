package project.pkg2.Statistics;

import project.pkg2.Employees.Employee;
import project.pkg2.Employees.EmployeeList;
import project.pkg2.Utilitis.Gender;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;

public class CalcStatistics {

    public static void AverageWage() {
        double avrwage = 0;
        for (Employee employee : EmployeeList.employList ) {
            avrwage = avrwage + (employee.getSalary());
        }
        double finalecut = avrwage / EmployeeList.employList.size();
        System.out.println("The average pay in this company is : " + finalecut);
    }

    public static void manOrWoman() {

        ArrayList<Employee> man = new ArrayList<>();
        ArrayList<Employee> woman = new ArrayList<>();
        ArrayList<Employee> unspec = new ArrayList<>();

        for (Employee employee : EmployeeList.employList) {
            if (employee.getGender().equals(Gender.MALE)) {
                man.add(employee);
            }
            if (employee.getGender().equals(Gender.FEMALE)) {
                woman.add(employee);
            }
            if (employee.getGender().equals(Gender.OTHER)) {
                unspec.add(employee);
            }

        }
        System.out.println("There are " + man.size() + " men working here.");
        System.out.println("There are " + woman.size() + " women working here.");
        System.out.println("There are " + unspec.size() + " people working here.");

    }



    public static  void maxWage (){
        ArrayList<Double> wages = new ArrayList<>();
        for (Employee  employee: EmployeeList.employList) {
            wages.add(employee.getSalary());
        }
        Collections.sort(wages);
        double last = wages.get(wages.size()-1);
        System.out.println("The highest wage in this company is : " + last);
    }

    public static void minWage (){
        ArrayList<Double> wages = new ArrayList<>();
        for (Employee  employee: EmployeeList.employList) {
            wages.add(employee.getSalary());
        }
        Collections.sort(wages);
        System.out.println("The lowest wage in the company is : " + wages.get(0));
    }



    public static void totalBonus (){
        double sum =0;
        for (Employee employee: EmployeeList.employList) {
            sum = sum + employee.getFinalBonus();
        }
        System.out.println("You are paying a total of : " + sum + " as bonus to all employees.");
    }










    public static void percentagemen(){  // försök få dessa att funka per yrke tack!
        double men = 0;
        for (Employee employe: EmployeeList.employList) {
            if (employe.getGender().equals(Gender.MALE)){
                men ++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = men/count * 100;
        System.out.println("There are : " + sum   +" % of men working at this company.");
    }

    public static void percentageWomen(){
        double women = 0;
        for (Employee employe: EmployeeList.employList) {
            if (employe.getGender().equals(Gender.FEMALE)){
                women ++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = women/count * 100;
        System.out.println("There are : " + sum   +" % of women working at this company.");
    }

    public static void percentageUnspec(){
        double unspec = 0;
        for (Employee employe: EmployeeList.employList) {
            if (employe.getGender().equals(Gender.OTHER)){
                unspec ++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = unspec/count * 100;
        System.out.println("There are : " + sum   +" % of unspecified people working at this company.");
    }





    // Vi har kvar att göra PER YRKE!








    /*

6) män percentage of the various work categories (?) antal procent som jobbar som vad antagligen.
 Om man är man, hamna i listan manligaproggare, sedan skriver vi ut antal proggare x 100 och antal manliga proggare x 100 med procent tecken... (?)



 0 back 1 menu.
     */
}
