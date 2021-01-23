package com.github.ynfeng.vehiclemaintenancereminder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class IndexTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void should_show_maintenance_items() throws Exception {
		mockMvc.perform(get("/index"))
			.andDo(print())
			.andExpect(xpath("/html/body/h1[1]").string("您的爱车"))
			.andExpect(xpath("/html/body/table/tbody/tr[1]/td[1]").string("Engine oil"))
			.andExpect(xpath("/html/body/table/tbody/tr[1]/td[2]").string("更换"))
			.andExpect(xpath("/html/body/table/tbody/tr[1]/td[3]").string("3 MONTHS"))
			.andExpect(xpath("/html/body/table/tbody/tr[1]/td[4]").string("2020-01-20"))
			.andExpect(xpath("/html/body/table/tbody/tr[2]/td[1]").string("Lighting system"))
			.andExpect(xpath("/html/body/table/tbody/tr[2]/td[2]").string("维护"))
			.andExpect(xpath("/html/body/table/tbody/tr[2]/td[3]").string("1 YEARS"))
			.andExpect(xpath("/html/body/table/tbody/tr[2]/td[4]").string("2021-01-05"));
	}
}
