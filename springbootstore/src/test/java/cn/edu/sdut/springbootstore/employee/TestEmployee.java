package cn.edu.sdut.springbootstore.employee;

import cn.edu.sdut.springbootstore.SpringbootstoreApplicationTests;
import cn.edu.sdut.springbootstore.entity.Employee;
import cn.edu.sdut.springbootstore.service.EmployeeService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestEmployee extends SpringbootstoreApplicationTests {
    @Resource
    private EmployeeService employeeService;

    @Test
    public void testQueryEmployees() {
        Employee employee = new Employee();
        List<Employee> employees = this.employeeService.queryEmployees(employee);
        employees.forEach(emp -> System.out.println("emp = " + emp));
    }

    @Test
    public void testQueryEmployeeById() {
        int empid = 2;
        Employee employee = this.employeeService.queryEmployeeById(empid);
        System.out.println("employee = " + employee);
    }

    @Test
    public void testQueryEmployeeByEmpname() {
        String empname = "田宇";
        Employee employee = this.employeeService.queryEmployeeByEmpname(empname);
        System.out.println("employee = " + employee);
    }

    @Test
    public void addEmployee() {
        Employee employee = new Employee(0, "李煜", "1", "0010234", "4000", 25);
        this.print(this.employeeService.addEmployee(employee));
    }

    @Test
    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setEmpid(3);
        employee.setEmpname("李曦");
        employee.setGender("2");
        employee.setAge(20);
        employee.setEmptel("123456");
        employee.setSalary("3500");
        this.print(this.employeeService.updateEmployee(employee));
    }

    @Test
    public void testDeleteEmployee() {
        int empid = 1;
        this.print(this.employeeService.deleteEmployee(empid));
    }
}
