package com.meituan.saas.catering_management;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class CateringManagementApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(3, new Calculator().calculate("1 + 2"));
		assertEquals(3, new Calculator().calculate("1 + 2 + 3"));
	}

}
