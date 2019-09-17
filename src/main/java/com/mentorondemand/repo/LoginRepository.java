package com.mentorondemand.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Login;
import com.mentorondemand.entity.Technologies;
@Repository
public interface LoginRepository extends CrudRepository<Login, String> {

	//List findByEmail(String username);
	
	@Query("Select l From Login l where l.email = :email and l.password = :password")
	List<Login> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
}
