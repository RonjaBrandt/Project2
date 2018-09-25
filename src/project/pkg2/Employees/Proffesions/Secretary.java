
package project.pkg2.Employees.Proffesions;

import project.pkg2.Employees.Employee;
import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

import static project.pkg2.UI.Main.sc;


public class Secretary extends Employee {

    private double salary;
    private double bonus;
    private Title title;
    private double min =100;
    private double max =1000;

    public Secretary(String name, int age, Gender gender, Title title, double salary, double bonus) {
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
                    System.out.println("The salary must be higher then " + min + "kr");
                } else if (salary > max) {
                    System.out.println("The salary can't be higher then " + max + "kr");
                }
                salary=sc.nextDouble();
            }else{
                rightSalary=true;
            }

        }while (rightSalary==false);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getBonus() {
        return (salary/100)* bonus;
    }

    @Override
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
