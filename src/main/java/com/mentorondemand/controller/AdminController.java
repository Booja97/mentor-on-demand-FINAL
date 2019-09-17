package com.mentorondemand.controller;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.entity.Admin;
import com.mentorondemand.entity.Commission;
import com.mentorondemand.entity.Login;
import com.mentorondemand.entity.Mentor;
import com.mentorondemand.entity.PaymentHistory;
import com.mentorondemand.entity.Payments;
import com.mentorondemand.entity.Skills;
import com.mentorondemand.entity.User;
import com.mentorondemand.repo.AdminRepository;
import com.mentorondemand.repo.CommissionRepository;
import com.mentorondemand.repo.LoginRepository;
import com.mentorondemand.repo.MentorRepository;
import com.mentorondemand.repo.PaymentHistoryRepository;
import com.mentorondemand.repo.PaymentRepository;
import com.mentorondemand.repo.SkillRepository;
import com.mentorondemand.repo.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class AdminController {
	 @Autowired
	  AdminRepository adminRepo;
     @Autowired 
       LoginRepository loginRepo;
     @Autowired 
     SkillRepository skillRepo;
     @Autowired
     CommissionRepository commissionRepo;
     @Autowired
     PaymentRepository paymentRepo;
     @Autowired
     PaymentHistoryRepository paymentHistoryRepo;
     @Autowired
     MentorRepository mentorRepo;
     @Autowired
     UserRepository userRepo;
		
        @PostMapping(value="/adminDetails")
		public String getAdminDetails(@RequestBody Admin admin) {
			Admin adminDetails = adminRepo.save(new Admin(admin.getName(),admin.getEmail(),admin.getPassword(),admin.getContact(),admin.getStatus(),admin.getRole()));
		    Login loginDetails= loginRepo.save(new Login(admin));
			return "Successfully Inserted"; 	
		}
		@PostMapping(value = "/addSkill")
		public Skills addskill(@RequestBody Skills skill) {

			Skills addSkill = skillRepo.save(new Skills(skill.getSkillName(),skill.getBaseAmount()));
			return addSkill;
		}
		@PostMapping(value = "/UpdateCommission")
		public Commission updateCommission(@RequestBody Commission commission) {

		Commission updateCommission = commissionRepo.save(new Commission(commission.getCommissionPercentage()));
			return updateCommission;
		}
		@PostMapping(value = "/payment")
		public Payments paymentDetails(@RequestBody  Payments payments) {

		Payments paymentList = paymentRepo.save(new Payments(payments.getMentorId(),payments.getSkillId(),payments.getSlot1(),payments.getSlot2(),payments.getSlot3(),payments.getSlot4() ));
	   return paymentList;
		}
		@PostMapping(value = "/paymentHistory")
		public PaymentHistory paymentHistory(@RequestBody  PaymentHistory paymentHistory) {

		PaymentHistory paymentHistoryList = paymentHistoryRepo.save(new PaymentHistory(paymentHistory.getUserId(),paymentHistory.getSkillId(),paymentHistory.getPaymentAmount()));
	    return paymentHistoryList;
		}
		
		@GetMapping("/paymentHistoryList")
		public List<PaymentHistory> getAllPaymentHistory() {
			System.out.println("Get all PaymentHistory...");

			List<PaymentHistory> paymentHistory = new ArrayList<>();
			paymentHistoryRepo.findAll().forEach(paymentHistory::add);

			return paymentHistory;
		}
		@GetMapping("/mentorList")
		public List<Mentor> getAllMentor() {
			System.out.println("Get all Mentors.");

			List<Mentor> mentor = new ArrayList<>();
			mentorRepo.findAll().forEach(mentor::add);

			return mentor;
		}
		@GetMapping("/userList")
		public List<User> getAllUser() {
			System.out.println("Get all users.");

			List<User> user = new ArrayList<>();
			userRepo.findAll().forEach(user::add);

			return user;
		}
		
		@GetMapping("/userSearchList/{firstname}")
		public List<User> getUser(@PathVariable String firstname) {
			
			List<User> users = userRepo.findByFirstName(firstname);
			
			return users;
		}
		
		
		@DeleteMapping("/deleteMentor/{mentorId}")
        public void deleteMentor(@PathVariable int mentorId) {
			
			 mentorRepo.deleteByMentorId(mentorId);
			
			
		}
		@DeleteMapping("/deleteUser/{userId}")
        public void deleteUser(@PathVariable int userId) {
			
			 userRepo.deleteByUserId(userId);
			
			
		}
		
}