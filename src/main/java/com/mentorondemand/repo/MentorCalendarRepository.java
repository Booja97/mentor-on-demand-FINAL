package com.mentorondemand.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mentorondemand.entity.MentorCalendar;
@Repository
public interface MentorCalendarRepository extends CrudRepository<MentorCalendar, Long> {

	List<MentorCalendar> findByMentorId(long mentorId);

//	MentorCalendar findByMentorId(long mentorId);

}
