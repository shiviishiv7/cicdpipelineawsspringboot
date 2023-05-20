package com.example.springbootciciaws.repo;

import com.example.springbootciciaws.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
