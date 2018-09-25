
package project.pkg2.Employees;


import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

import java.lang.reflect.Array;
import java.util.Arrays;


public abstract class Employee {

    private String name;
    private Title title;
    private double salary;
    private static double bonus;
    private double finalBonus = 0;
    private int age;
    private Gender gender;
    private  int id;
    private  int nextID=0;


    public Employee(String name, int age, Gender gender, Title title, double salary, double bonus)  {
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
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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

        return finalBonus;

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public  double getFinalBonus() {
        return finalBonus;
    }

    public  int getId() {
        id =nextID;
        nextID++;
        return nextID;
    }

    public  void  setId() {
        this.id = nextID;

    }

    @Override
    public String toString(){

        return "\nInformation about the employee with the Employee ID: "+ getId()
                + "\nName: " + getName()
                + "\nAge: " + getAge()
                + "\nGender: " + getGender()
                + "\nHired as:"
                + "\nTitle: " + getTitle()
                + "\nSalary: " + getSalary() + " kr/month"
                + "\nBonus: " + getBonus() + " % and in kronor : "+ calcBonus(getSalary())
                +"\n*************************************\n";
    }


    public String toStringNoID(){

        return "\nName: " + getName()
                + "\nAge: " + getAge()
                + "\nGender: " + getGender()
                + "\nHired as:"
                + "\nTitel: " + getTitle()
                + "\nSalary: " + getSalary() + " kr/month"
                + "\nBonus: " + getBonus() + " % and in kronor: "+ calcBonus(getSalary())
                +"\n*************************************\n";
    }
}
