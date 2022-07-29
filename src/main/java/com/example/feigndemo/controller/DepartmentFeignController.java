package com.example.feigndemo.controller;

import com.example.feigndemo.feign.FeignUtil;
import com.example.feigndemo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentFeignController {
    @Autowired
    private FeignUtil feignUtil;

    @GetMapping
    public List<Department> getDepartments(){
        return feignUtil.getDepartment();
    }
}
