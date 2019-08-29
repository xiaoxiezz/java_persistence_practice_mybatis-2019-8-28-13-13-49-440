package tws.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.model.Employee;

@Mapper
public interface EmployeeMapper {
    @Insert("insert into employee values(#{employee.id}, #{employee.name}, #{employee.age})")
    void insertEmployee(@Param("employee")Employee employees);
}
