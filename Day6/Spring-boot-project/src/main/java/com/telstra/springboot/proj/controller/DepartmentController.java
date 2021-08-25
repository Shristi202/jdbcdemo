package com.telstra.springboot.proj.controller;

import com.telstra.springboot.proj.entity.Department;
import com.telstra.springboot.proj.error.DepartmentNotFoundException;
import com.telstra.springboot.proj.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    // save api will got to this url
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        LOGGER.info("Inside the get dep by id method");
        return departmentService.saveDepartment(department);
    }

    // list of department we are returning
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
    return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
           departmentService.deleteDepartmentById(departmentId);
           return "Department Deleted Successfully";
    }

    // put method for updating records
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
           return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.findByDepartmentNameIgnoreCase(departmentName);
    }
}
