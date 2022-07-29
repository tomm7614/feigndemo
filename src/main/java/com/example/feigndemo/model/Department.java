package com.example.feigndemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
    private Long id;
    private String name;
    private String address;
    private String code;
}