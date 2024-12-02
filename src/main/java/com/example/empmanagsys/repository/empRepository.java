package com.example.empmanagsys.repository;

import com.example.empmanagsys.entity.emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepository extends JpaRepository<emp,Long> {
}
