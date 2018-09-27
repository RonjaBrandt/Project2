package project.pkg2.Statistics;

import project.pkg2.Employees.Employee;
import project.pkg2.Employees.EmployeeList;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;
import static project.pkg2.UI.Main.sc;

import java.util.Collections;
import java.util.ArrayList;


public class CalcStatistics {

    public static void AverageWage() {
        double avrwage = 0;
        for (Employee employee : EmployeeList.employList) {
            avrwage = avrwage + (employee.getSalary());
        }
        double finalecut = avrwage / EmployeeList.employList.size();
        System.out.println("The average salary of this company is : " + finalecut);
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


    public static void maxWage() {
        ArrayList<Double> wages = new ArrayList<>();
        for (Employee employee : EmployeeList.employList) {
            wages.add(employee.getSalary());
        }
        Collections.sort(wages);
        double last = wages.get(wages.size() - 1);
        System.out.println("The highest salary of this company is : " + last);
    }

    public static void minWage() {
        ArrayList<Double> wages = new ArrayList<>();
        for (Employee employee : EmployeeList.employList) {
            wages.add(employee.getSalary());
        }
        Collections.sort(wages);
        System.out.println("The lowest salary of the company is : " + wages.get(0));
    }


    public static void totalBonus() {
        double totalSum = 0;
        double programmerSum = 0;
        double salesmenSum= 0;
        double technicianSum = 0;
        double secretarySum = 0;
        int choice;
        while(true){
            System.out.println("Choose how you want to see total bonus:"
                    + "\n[1] Total bonus for all employees."
                    + "\n[2] Total bonus for all Programmers."
                    + "\n{3] Total bonus for all Salesmen."
                    + "\n[4] Total bonus for all Technicians."
                    + "\n[5] Total bonus for all Secretaries."
                    + "\n[0] Return to previous menu.");
            try{
                choice= Integer.parseInt(sc.next());
                sc.nextLine();
                switch (choice){

                    case 1:
                        double temp = 0;
                        for (Employee employee : EmployeeList.employList) {
                           temp += employee.getBonus();

                        }
                        System.out.println("You are paying a total of : " + temp + " as bonus to all employees.");

                        break;
                    case 2:
                        double temp2 =0;
                        for (Employee employee : EmployeeList.employList) {
                            if (employee.getTitle().equals(Title.PROGRAMMER)) {
                                temp2 += employee.getBonus();
                            }
                        }
                        System.out.println("You are paying a total of : " + temp2
                                +" as bonus to all programmers.");
                        break;
                    case 3:
                         double temp3 = 0;
                        for (Employee employee : EmployeeList.employList) {
                            if (employee.getTitle().equals(Title.SALESMAN)) {
                                temp3 += employee.getBonus();
                            }
                        }
                        System.out.println("You are paying a total of : " + temp3
                                +" as bonus to all programmers.");
                        break;
                    case 4:
                        double temp4 = 0;
                        for (Employee employee : EmployeeList.employList) {
                            if (employee.getTitle().equals(Title.TECHNICIAN)) {
                                temp4+= employee.getBonus();
                            }
                        }
                        System.out.println("You are paying a total of : " + temp4
                                +" as bonus to all programmers.");
                        break;
                    case 5:
                        double temp5 = 0;
                        for (Employee employee : EmployeeList.employList) {
                            if (employee.getTitle().equals(Title.SECRETARY)) {
                                temp5+= employee.getBonus();
                            }
                        }
                        System.out.println("You are paying a total of : " + temp5
                                +" as bonus to all programmers.");
                        break;
                    case 0:
                        Statistics.statisticsMenu();
                        break;
                    default:
                        System.out.println("Sorry, unrecognized choice.\n");
                }
            }catch (Exception e){
                System.out.println("Sorry, you can only use numbers."
                        + "\nInformation for the admin:"
                        + "\n" + e + "\n");
                continue;
            }
        }
    }


    public static void percentageMen() {
        double men = 0;
        for (Employee employe : EmployeeList.employList) {
            if (employe.getGender().equals(Gender.MALE)) {
                men++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = men / count * 100;
        System.out.println("There are : " + sum + " % of men working at this company.");
    }

    public static void percentageWomen() {
        double women = 0;
        //Söker igenom företaget & om den hittar en kvinna så plussas det på 1 i variabeln "woman"
        for (Employee employe : EmployeeList.employList) {
            if (employe.getGender().equals(Gender.FEMALE)) {
                women++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = women / count * 100;
        System.out.println("There are : " + sum + " % of women working at this company.");
    }

    public static void percentageUnspec() {
        double unspec = 0;
        for (Employee employe : EmployeeList.employList) {
            if (employe.getGender().equals(Gender.OTHER)) {
                unspec++;
            }
        }
        double count = EmployeeList.employList.size(); // antal anställda
        double sum = unspec / count * 100;
        System.out.println("There are : " + sum + " % of unspecified people working at this company.");
    }


    public static void sortByTitle() {
        double count = EmployeeList.employList.size();
        double progmale = 0;
        double progfemale  = 0;
        double progothers = 0;
        double salem = 0;
        double salef = 0;
        double saleo = 0;
        double secm = 0;
        double secf = 0;
        double seco = 0;
        double tecm = 0;
        double tecf = 0;
        double teco = 0;
        ArrayList<Employee> programmers = new ArrayList<>();
        ArrayList<Employee> salesman = new ArrayList<>();
        ArrayList<Employee> secretary = new ArrayList<>();
        ArrayList<Employee> technician = new ArrayList<>();
        for (Employee employee : EmployeeList.employList) {

            //Sorterar in de anställda i repsektive områden
            if ( employee.getTitle().equals(Title.PROGRAMMER)) {
                programmers.add(employee);
            }
            if ( employee.getTitle().equals(Title.SALESMAN)) {
                salesman.add(employee);
            }
            if ( employee.getTitle().equals(Title.SECRETARY)) {
                secretary.add(employee);
            }
            if ( employee.getTitle().equals(Title.TECHNICIAN)) {
                technician.add(employee);
            }
        }
        //Söker igenom alla programmerare & sorteras in i listor baserade på kön
        for (Employee proggare: programmers)
        {
            if (proggare.getGender().equals(Gender.MALE)){
                progmale ++ ;
            }
            if (proggare.getGender().equals(Gender.FEMALE)){
                progfemale ++ ;
            }
            if (proggare.getGender().equals(Gender.OTHER)){
                progothers ++ ;
            }
        }
        //Söker igenom alla säljare & sorteras in i listor baserade på kön
        for (Employee seller: salesman)
        {
            if (seller.getGender().equals(Gender.MALE)){
                salem++ ;
            }
            if (seller.getGender().equals(Gender.FEMALE)){
                salef ++ ;
            }
            if (seller.getGender().equals(Gender.OTHER)){
                saleo ++ ;
            }
        }
        //Söker igenom alla sekreterare & sorteras in i listor baserade på kön
        for (Employee secre: secretary)
        {
            if (secre.getGender().equals(Gender.MALE)){
                secm ++ ;
            }
            if (secre.getGender().equals(Gender.FEMALE)){
                secf ++ ;
            }
            if (secre.getGender().equals(Gender.OTHER)){
                seco ++ ;
            }
        }
        //Söker igenom alla tekniker & sorteras in i listor baserade på kön
        for (Employee tech: technician)
        {
            if (tech.getGender().equals(Gender.MALE)){
                tecm ++ ;
            }
            if (tech.getGender().equals(Gender.FEMALE)){
                tecf ++ ;
            }
            if (tech.getGender().equals(Gender.OTHER)){
                teco ++ ;
            }
        }
        //Räknar ut hur många procent av respektive kön i respektive område det finns
        double sumprog1 = progmale / programmers.size() * 100;
        double sumprog2 = progfemale / programmers.size() * 100;
        double somprog3 = progothers / programmers.size() * 100;

        double sumsale1 = salem / programmers.size() * 100;
        double sumsale2 = salef / programmers.size() * 100;
        double sumsale3 = saleo / programmers.size() * 100;

        double sumsec1 = secm / programmers.size() * 100;
        double sumsec2 = secf / programmers.size() * 100;
        double sumsec3 = seco / programmers.size() * 100;

        double sumtec1 = tecm / programmers.size() * 100;
        double sumtec2 = tecf / programmers.size() * 100;
        double sumtec3 = teco / programmers.size() * 100;

        System.out.println("There are currently " + programmers.size()  +" programmers employed.\n"
                + sumprog1 + "% are male.\n" +sumprog2+ "% are female.\n" + somprog3 + "% of other.");

        System.out.println("There are currently " + salesman.size()  +" salesmen employed.\n"
                + sumsale1 + "% are male.\n" +sumsale2+ "% are female.\n" + sumsale3 + "% of other.");

        System.out.println("There are currently " + secretary.size()  +" secretarys employed.\n"
                + sumsec1 + "% are male.\n" +sumsec2+ "% are female.\n" + sumsec3 + "% of other.");

        System.out.println("There are currently " + technician.size()  +" technicians employed.\n"
                + sumtec1 + "% are male.\n" +sumtec2+ "% are female.\n" + sumtec3 + "% of other.");
    }
}









