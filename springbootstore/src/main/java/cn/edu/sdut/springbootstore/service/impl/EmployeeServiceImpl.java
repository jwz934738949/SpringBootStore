package cn.edu.sdut.springbootstore.service.impl;

import cn.edu.sdut.springbootstore.entity.Employee;
import cn.edu.sdut.springbootstore.mapper.EmployeeMapper;
import cn.edu.sdut.springbootstore.mapper.SellMapper;
import cn.edu.sdut.springbootstore.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Resource
    private SellMapper sellMapper;

    @Override
    public List<Employee> queryEmployees(Employee employee) {
        return this.employeeMapper.queryEmployees(employee);
    }

    @Override
    public Employee queryEmployeeById(int empid) {
        return this.employeeMapper.queryEmployeeById(empid);
    }

    @Override
    public Employee queryEmployeeByEmpname(String empname) {
        return this.employeeMapper.queryEmployeeByEmpname(empname);
    }

    @Override
    public int addEmployee(Employee employee) {
        return this.employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return this.employeeMapper.updateEmployee(employee);
    }

    @Transactional
    @Override
    public int deleteEmployee(int empid) {
        this.sellMapper.deleteSellByEmpid(empid);
        return this.employeeMapper.deleteEmployee(empid);
    }

    @Override
    public Employee queryEmployeeBysellid(int sellid){
        return this.employeeMapper.queryEmployeeBysellid(sellid);
    }
}
