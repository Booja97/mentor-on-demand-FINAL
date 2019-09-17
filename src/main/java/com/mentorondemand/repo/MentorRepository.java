package com.mentorondemand.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.Mentor;
import com.mentorondemand.entity.MentorCalendar;
import com.mentorondemand.entity.Skills;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {
	Optional<Mentor> findById(long id);

	//MentorCalendar findByMentorId(long mentorId);

	//List<Mentor> findByFirstName(String firstname);

	List<Mentor> findBySkills(String skillName);
	
    @Query(value="select mentor from Mentor mentor where mentor.email=?1 ")
	Mentor findByEmail(String email);

	void deleteByMentorId(int mentorId);
	
	 @Query(value="select mentor from MentorCalendar mentor where mentor.course=?1")
	List<MentorCalendar> findBySearchItem(String searchItem); 

}
