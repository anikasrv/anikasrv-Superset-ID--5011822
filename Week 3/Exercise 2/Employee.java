// src/main/java/com/example/EmployeeManagementSystem/model/Department.java
package com.example.EmployeeManagementSystem.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
