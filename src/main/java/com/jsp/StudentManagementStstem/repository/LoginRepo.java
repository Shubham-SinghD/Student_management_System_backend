package com.jsp.StudentManagementStstem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.StudentManagementStstem.entity.LoginData;
@Repository
public interface LoginRepo extends JpaRepository<LoginData, String> {

	Optional<LoginData> findByEmailIgnoreCase(String email);
	LoginData findByMobile(long mobile);

}
