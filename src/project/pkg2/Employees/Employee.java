
package project.pkg2.Employees;


import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

public abstract class Employee {

    private String name;
    private Title title;
    private double salary;
    private static double bonus;
    private int age;
    private Gender gender;



    private static int id;

    private static int nextId=0;

    public Employee(String name, int age, Gender gender, Title title,double salary, double bonus)  {
        this.id = Employee.nextId;
        Employee.nextId++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.title=title;
        this.salary=salary;
        this.bonus=bonus;

    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {

        return bonus;
    }
    public double calcBonus(double salary){
        double finalBonus = salary /100 *bonus;


        System.out.println("The bonus of this employee is : " + finalBonus);
        return finalBonus;

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public static int getID() {
        return id;
    }
//public abstract String toString();
}
