

package project.pkg2.Employees.Proffesions;


import project.pkg2.Employees.Employee;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

import static project.pkg2.UI.Main.sc;

public class Programmer extends Employee {

    private double salary;
    private double bonus;
    private Title title;
    private double min =24500;
    private double max =48000;




    private int depId = 10;

    public Programmer(String name, int age, Gender gender, Title title, double salary, double bonus) {
        super(name, age, gender, title, salary, bonus);
        this.title =Title.PROGRAMMER;
    }


    public Title getTitle() {
        super.setTitle(title);
        return title;
    }
    @Override
    public void setTitle(Title title) {
        this.title = title;
    }

    public double getSalary() {
        boolean rightSalary = false;
        do{
            if(salary<min||salary>max) {
                if (salary < min) {
                    System.out.println("The salary must be higher then " + min + "kr.");
                } else if (salary > max) {
                    System.out.println("The salary can't be higher then " + max + "kr.");
                }

                try {
                    //Ser om användare matar in en siffra eller bokstav i inputen. Om ej siffra fångas det upp av catch.
                    salary = Double.parseDouble(sc.next());
                    sc.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("Sorry, you can only use numbers."
                            + "\nInformation for the admin:"
                            + "\n" + e + "\n");
                }
            }else{
                rightSalary=true;
            }

        }while (!rightSalary);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {

        return bonus;
    }
    @Override
    public double calcBonus(double salary){
        double finalBonus = salary /100 *bonus;
        return finalBonus;
    }


    @Override
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDepIdP() {
        return getDepIdP();
    }


    public void setId(){
        nextID++;
    }
}

