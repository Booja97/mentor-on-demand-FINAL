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

import com.mentorondemand.model.MentorModel;

public class MentorTest extends AbstractTest {

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void getMentorSkills() throws Exception {
		String uri = "mentor/getMentorSkills/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		MentorModel[] mentorSkillList = super.mapFromJson(content, MentorModel[].class);
		assertTrue(mentorSkillList.length > 0);
	}

	@Test
	public void registerMentor() throws Exception {
		String uri = "/mentor/register";
		MentorModel mentor = new MentorModel("mentor","mentor@gmail.com", "mentor", "94357345786","mentor@gmail.com",
				"02/04/1997","java", "mentor");

		String inputJson = super.mapToJson(mentor);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		String content = mvcResult.getResponse().getContentAsString();
		assertEquals(content, mentor.toString());
	}

	

	@Test
	public void rejectMentor() throws Exception {
		String uri = "/mentor/rejection/1";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		assertEquals(new ResponseEntity<>(" ", HttpStatus.OK),
				new ResponseEntity<>(" ", HttpStatus.OK));
	}

}
