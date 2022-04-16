package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class DemoApplicationTests {
	@Mock
	DemoApplication demoApplication;

	@Test
	void contextLoads() {
		String[] arr = new String[0];
		verify(demoApplication,times(1)).main(arr);
	}

}
