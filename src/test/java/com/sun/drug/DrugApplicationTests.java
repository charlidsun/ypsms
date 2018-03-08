package com.sun.drug;

import com.sun.drug.controller.DrugsController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DrugApplicationTests {

	private MockMvc mvc;

	public DrugApplicationTests(MockMvc mvc) {
		this.mvc = mvc;
	}

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new DrugsController()).build();
	}

	@Test
	public void contextLoads() throws Exception{

		RequestBuilder request = null;

	}

}
