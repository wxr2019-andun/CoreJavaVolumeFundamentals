package reelFour;

import java.util.Date;
import java.util.Objects;

/**
 * Description:
 * GET-version:
 * Date:2020-12-23  18:05
 * Author: wxr
 */

public class Employee implements Cloneable{
    //?
//    public Employee clone() throws CloneNotSupportedException{
//        return (Employee)super.clone();
//    }

    //深克隆？
    public Employee clone() {

        try {
            Employee clone  = (Employee)super.clone();
            clone.hireDay = (Date) hireDay.clone();//可变对象？
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }



    private String name;
    private double salary;
    private Date hireDay;


    public Employee() {
    }

    public Employee(String name, double salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    public int hashCode(){
        return Objects.hash(name ,  salary, hireDay);
    }
    public boolean equals(Object otherObject){

        if (this == otherObject) return true;

        if(otherObject == null)return false;

        if (getClass()  !=  otherObject.getClass())  return false;

        Employee employee = (Employee) otherObject;
        return Objects.equals(name, employee.name) &&  salary == employee.salary && Objects.equals(hireDay, employee.hireDay);
    }
}

