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



    public static ArrayList maxWage (){
        int räkna =0 ;
        ArrayList<Double> wages = new ArrayList<>();

        for (Employee  employee: EmployeeList.employList) {
            räkna ++;
            wages.add(employee.getSalary());
        }  //  maximum wage , bubble sort. skicka höger om dom är större.
        Collections.sort(wages);
        System.out.println(wages);
        return wages;
    }

    public static ArrayList minWage (){ // inte klar.

        int räkna =0 ;
        ArrayList<Double> wages = new ArrayList<>();

        for (Employee  employee: EmployeeList.employList) {
            räkna ++;
            wages.add(employee.getSalary());
        }  //  maximum wage , bubble sort. skicka höger om dom är större.
        Collections.sort(wages);
        System.out.println(wages);
        return wages;
    }








    /*

    Employee statistics.


.

3) min wage ^

4) total bonus, plussa ihop alla bonusars slutgiltiga summa.
"Bonus payment overall and in various professional roles."




6) män percentage of the various work categories (?) antal procent som jobbar som vad antagligen.
 Om man är man, hamna i listan manligaproggare, sedan skriver vi ut antal proggare x 100 och antal manliga proggare x 100 med procent tecken... (?)



 0 back 1 menu.
     */
}
