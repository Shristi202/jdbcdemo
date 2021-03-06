package com.telstra.springboot.proj.repository;

import com.telstra.springboot.proj.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//long is the primary key type
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
       public Department findByDepartmentName(String departmentName);
       public Department findByDepartmentNameIgnoreCase(String departmentName);

}
