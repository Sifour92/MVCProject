package com.controller;

import com.dao.EmployeeDAO;
import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showEmployees(Model model) {

        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("allemps",employees);
        return "all-employees";
    }
@RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employees-info";
}
@RequestMapping("/saveEmployee")
public String saveEmployee(@ModelAttribute("employee")Employee emp) {
        employeeService.saveEmployee(emp);
        return "redirect:/";
}

@RequestMapping("/updateInfo")
public String updateEmployee(@RequestParam("empId")int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
return "employees-info";
}

@RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId")int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
}
}
