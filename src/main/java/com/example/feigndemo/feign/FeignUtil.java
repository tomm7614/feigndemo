package com.example.feigndemo.feign;

import com.example.feigndemo.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "feignDemo", url = "http://localhost:8080/api2/departments")
public interface FeignUtil {

    @GetMapping
    public List<Department> getDepartment();
}
