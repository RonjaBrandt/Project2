
package project.pkg2.Employees;


import project.pkg2.Utilitis.Gender;
import project.pkg2.Utilitis.Title;

public abstract class Employee {

    private String name;
    private Title title;
    private double salary;
    private static double bonus;
    private double finalBonus;
    private int age;
    private Gender gender;
    private static int id;
    private static int nextID =0;

    public Employee(String name, int age, Gender gender, Title title,double salary, double bonus)  {
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
    public static int getID() {
        return id;
    }

    public int[] setId(Title title) {
        this.title=title;
        Employee.id = nextID;
        boolean updateID=false;
        int proffID = 0;
        do {
            if (title.equals(Title.PROGRAMMER)){
                proffID=10;
                nextID++;
                updateID =true;
            } if (title.equals(Title.SECRETARY)){
                proffID=20;
                nextID++;
                updateID =true;
            } if (title.equals(Title.SALESMAN)){
                proffID=30;
                nextID++;
                updateID =true;
            } if (title.equals(Title.TECHNICIAN)){
                proffID=40;

                nextID++;
                updateID =true;
            }

        }   while (updateID=false);
        return new int[] {proffID, nextID};
    }
}
