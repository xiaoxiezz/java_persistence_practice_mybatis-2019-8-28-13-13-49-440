package tws.controller;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tws.mapper.EmployeeMapper;
import tws.model.Employee;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeMapper employeeMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployees(@RequestBody Employee employee){
        employeeMapper.insertEmployee(employee);
    }

    @GetMapping
    public List<Employee> searchEmployee(){
        return employeeMapper.searchEmployees();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployee(@RequestBody Employee employee){
       employeeMapper.updateEmployee(employee);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable("id") int id){
        employeeMapper.deleteEmployee(id);
    }
}
