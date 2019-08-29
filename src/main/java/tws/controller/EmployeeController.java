package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.mapper.EmployeeMapper;
import tws.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @PostMapping
    public void addEmployees(@RequestBody Employee employee){
        employeeMapper.insertEmployee(employee);
    }
}
