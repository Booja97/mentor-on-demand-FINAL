package com.mentorondemand.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.entity.Login;
import com.mentorondemand.entity.Mentor;
import com.mentorondemand.entity.MentorCalendar;
import com.mentorondemand.entity.MentorSkills;
import com.mentorondemand.repo.LoginRepository;
import com.mentorondemand.repo.MentorCalendarRepository;
import com.mentorondemand.repo.MentorRepository;
import com.mentorondemand.repo.MentorSkillRepository;
import com.mentorondemand.repo.ProposalRequestRepository;
import com.mentorondemand.repo.TrainingRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class MentorController {

	@Autowired
	MentorRepository mentorRepo;
	
	@Autowired
	MentorCalendarRepository mentorCalendarRepo;
	
	@Autowired
	MentorSkillRepository skillRepo;

	 @Autowired 
     LoginRepository loginRepo;
	 
	@Autowired
	MentorCalendarRepository calendarRepo;
	
	@Autowired
	ProposalRequestRepository proposalRequestRepo;

	@Autowired
	TrainingRepository trainingRepo;

	@PostMapping(value = "/mentor/register")
	public Mentor postCustomer(@RequestBody Mentor mentor) {

		
		Mentor mentorInsert = mentorRepo.save(new Mentor(mentor.getUserName(),mentor.getEmail(),mentor.getPassword(),mentor.getContactNumber(),mentor.getLinkedInUrl(),mentor.getRegDateTime(),mentor.getSkills(),mentor.getRole()));
		 Login loginDetails= loginRepo.save(new Login(mentor));
		return mentorInsert; 	
		

	}
	

	@DeleteMapping("/mentor/deleteSkill")
	public ResponseEntity<String> deleteAllCustomers(@RequestBody MentorSkills mentorSkills) {
		System.out.println("Delete All Customers...");

		skillRepo.deleteByMentorId(mentorSkills.getMentorId());

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@PostMapping(value = "/mentor/addSkill")
	public MentorSkills mentorAddSkill(@RequestBody MentorSkills mentorSkills) {

		MentorSkills mentorSkillInsert = skillRepo.save(new MentorSkills(mentorSkills.getMentorId(),
				mentorSkills.getSkillName(), mentorSkills.getYearsOfExperience(), mentorSkills.getRegDateTime(),
				mentorSkills.getTrainingsDelivered(), mentorSkills.getFacilities()));
		return mentorSkillInsert;

	}
	@PostMapping("/mentor/getMentorId/{email}")
	public Long getMentorId(@PathVariable("email") String email) {
		System.out.println("Delete Customer with ID = " + email + "...");

		Mentor mentor=mentorRepo.findByEmail(email);
		

		return mentor.getMentorId();
	}

	@PostMapping(value="mentor/getMentorSkills/{mentorId}")
	public Optional<MentorSkills> getMentorSkills(@PathVariable("mentorId") Long mentorId) {
	Optional<MentorSkills> mentorSkills=skillRepo.findById(mentorId);
	return mentorSkills;
	}
	
	@PutMapping(value = "mentor/update")
	public void updateByAge(@RequestBody MentorSkills mentorSkills) {

		  skillRepo.updateSkill(mentorSkills.getMentorId(),mentorSkills.getSkillName(),mentorSkills.getRegDateTime(),mentorSkills.getYearsOfExperience(),mentorSkills.getTrainingsDelivered(),mentorSkills.getFacilities());
	}


	@DeleteMapping("/mentor/rejection/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		proposalRequestRepo.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}
	
}
