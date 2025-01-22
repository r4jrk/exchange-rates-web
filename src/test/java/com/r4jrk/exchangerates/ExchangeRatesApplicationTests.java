package com.r4jrk.exchangerates;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@ActiveProfiles("test")
class ExchangeRatesApplicationTests {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void contextLoads() {
		assertThat(restTemplate).isNotNull();
	}

}
