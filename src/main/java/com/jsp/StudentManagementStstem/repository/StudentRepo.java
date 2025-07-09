package com.jsp.StudentManagementStstem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.StudentManagementStstem.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	Optional<Student> findBySectionAndRollno( String section,Long rollno);

	List<Student> findBySection(String section);
}
