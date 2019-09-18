package com.spring.mentorondemand;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.mentorondemand.entity.Payments;
import com.mentorondemand.model.AdminModel;
import com.mentorondemand.model.CommissionModel;
import com.mentorondemand.model.MentorModel;
import com.mentorondemand.model.PaymentHistoryModel;
import com.mentorondemand.model.UserModel;

public class AdminTest extends AbstractTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getPaymentHistoryList() throws Exception {
		String uri = "/paymentHistoryList";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		PaymentHistoryModel[] paymentHistoryList = super.mapFromJson(content, PaymentHistoryModel[].class);
		assertTrue(paymentHistoryList.length > 0);
	}

	


	@Test
	public void getPaymentHistoryWithId() throws Exception {
		String uri = "/paymentHistoryList/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		PaymentHistoryModel[] paymentHistoryList = super.mapFromJson(content, PaymentHistoryModel[].class);
		assertTrue(paymentHistoryList.length > 0);
	}

	@Test
	public void getMentorList() throws Exception {
		String uri = "/mentorList";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		MentorModel[] mentorList = super.mapFromJson(content, MentorModel[].class);
		assertTrue(mentorList.length > 0);
	}

	@Test
	public void getUserList() throws Exception {
		String uri = "/userList";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		UserModel[] userList = super.mapFromJson(content, UserModel[].class);
		assertTrue(userList.length > 0);
	}

	@Test
	public void getSearchList() throws Exception {
		String uri = "/userSearchList/user1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		UserModel[] userList = super.mapFromJson(content, UserModel[].class);
		assertTrue(userList.length > 0);
	}

	@Test
	public void getMentorSearchList() throws Exception {
		String uri = "/mentorSearchList/mentordummy1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		MentorModel[] mentorList = super.mapFromJson(content, MentorModel[].class);
		assertTrue(mentorList.length > 0);
	}

	@Test
	public void createAdmin() throws Exception {
		String uri = "/adminDetails";
		AdminModel admin = new AdminModel("dummy", "dummy@gmail.com", "password", "9876543210", "true", "ADMIN");

		String inputJson = super.mapToJson(admin);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, "Admin is created successfully");
	}

	@Test
	public void addPayment() throws Exception {
		String uri = "/payment";
		Payments payment = new Payments();
		payment.setMentorId(1);

		String inputJson = super.mapToJson(payment);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, payment.toString());
	}

	@Test
	public void postPaymentHistory() throws Exception {
		String uri = "/paymentHistory";
		Payments payment = new Payments( 1, 1, "25", "50", "75", "100");

		String inputJson = super.mapToJson(payment);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, payment.toString());
	}

	@Test
	public void updateCommission() throws Exception {
		String uri = "/UpdateCommission";
		CommissionModel commission = new CommissionModel(20);

		String inputJson = super.mapToJson(commission);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, commission.toString());
	}

	@Test
	public void updateSlot() throws Exception {
		String uri = "/updateSlot";
		Payments payment = new Payments( 1, 1, "angular", "spring", "mysql", "oracle");

		String inputJson = super.mapToJson(payment);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, payment.toString());
	}

	@Test
	public void deleteMentor() throws Exception {
		String uri = "/deleteMentor/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		assertEquals(new ResponseEntity<>(" ", HttpStatus.OK), new ResponseEntity<>(" ", HttpStatus.OK));
	}

	@Test
	public void deleteUser() throws Exception {
		String uri = "/deleteMentor/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		assertEquals(new ResponseEntity<>(" ", HttpStatus.OK), new ResponseEntity<>(" ", HttpStatus.OK));
	}

}
