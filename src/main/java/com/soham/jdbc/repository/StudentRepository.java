package com.soham.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soham.jdbc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
