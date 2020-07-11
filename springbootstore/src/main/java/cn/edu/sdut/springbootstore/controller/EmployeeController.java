package cn.edu.sdut.springbootstore.controller;

import cn.edu.sdut.springbootstore.entity.Employee;
import cn.edu.sdut.springbootstore.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    public static String SUCCESS = "redirect:queryEmployees";

    @RequestMapping("queryEmployees")
    public String queryEmployees(Employee employee, ModelMap modelMap) {
        List<Employee> employees = this.employeeService.queryEmployees(employee);
        modelMap.put("employees", employees);
        return "employee/listEmployee";
    }

    @RequestMapping("toAddEmployee")
    public String toAdd() {
        return "employee/addEmployee";
    }

    @RequestMapping("doAddEmployee")
    public String doAdd(Employee employee) {
        this.employeeService.addEmployee(employee);
        return SUCCESS;
    }

    @RequestMapping("detailEmployee")
    public String detailEmployee(int empid, ModelMap modelMap) {
        Employee employee = this.employeeService.queryEmployeeById(empid);
        modelMap.put("employee", employee);
        return "employee/detailEmployee";
    }

    @RequestMapping("toUpdateEmployee")
    public String toUpdate(int empid, ModelMap modelMap) {
        Employee employee = this.employeeService.queryEmployeeById(empid);
        modelMap.put("employee", employee);
        return "employee/updateEmployee";
    }

    @RequestMapping("doUpdateEmployee")
    public String doUpdate(Employee employee) {
        this.employeeService.updateEmployee(employee);
        return SUCCESS;
    }

    @RequestMapping("deleteEmployee")
    public String deleteEmployee(int empid) {
        this.employeeService.deleteEmployee(empid);
        return SUCCESS;
    }
}
