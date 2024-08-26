// src/main/java/com/example/EmployeeManagementSystem/model/Employee.java
package com.example.EmployeeManagementSystem.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}

