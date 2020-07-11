package cn.edu.sdut.springbootstore.entity;

import java.util.Date;

public class Employee {
    private int empid;
    private String empname, gender, emptel, salary;
    private int age;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmptel() {
        return emptel;
    }

    public void setEmptel(String emptel) {
        this.emptel = emptel;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", gender='" + gender + '\'' +
                ", emptel='" + emptel + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(int empid, String empname, String gender, String emptel, String salary, int age) {
        this.empid = empid;
        this.empname = empname;
        this.gender = gender;
        this.emptel = emptel;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }
}
