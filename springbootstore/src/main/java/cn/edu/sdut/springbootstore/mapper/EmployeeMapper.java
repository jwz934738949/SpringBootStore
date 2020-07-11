package cn.edu.sdut.springbootstore.mapper;

import cn.edu.sdut.springbootstore.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> queryEmployees(Employee employee);

    Employee queryEmployeeById(int empid);

    Employee queryEmployeeByEmpname(String empname);

    Employee queryEmployeeBysellid(int sellid);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(int empid);
}
