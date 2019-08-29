package tws.mapper;

import org.apache.ibatis.annotations.*;
import tws.model.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Insert("insert into employee values(#{employee.id}, #{employee.name}, #{employee.age})")
    void insertEmployee(@Param("employee")Employee employee);

    @Select("select * from employee")
    List<Employee> searchEmployees();

    @Update("update employee set name = #{employee.name}, age = #{employee.age} where id = #{employee.id}")
    void updateEmployee(@Param("employee")Employee employee);

    @Delete("delete from employee where id = #{id}")
    void deleteEmployee(@Param("id") int id);

}
