package com.mentorondemand.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Skills;
import com.mentorondemand.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByFirstName(String firstname);

	void deleteByUserId(int userId);

	

}
