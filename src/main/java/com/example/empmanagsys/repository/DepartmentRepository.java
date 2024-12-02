package com.example.empmanagsys.repository;

import com.example.empmanagsys.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
