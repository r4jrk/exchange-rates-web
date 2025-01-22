package com.r4jrk.exchangerates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ExchangeRatesClient {
    
    private final WebClient webClient;

    public ExchangeRatesClient(WebClient.Builder webClientBuilder) {
        this.webClient = 
            webClientBuilder
                .baseUrl("http://api.nbp.pl/api/exchangerates/rates/a/EUR/2025-01-15/?format=json").build();
    }

	private static final Logger log = LoggerFactory.getLogger(ExchangeRatesClient.class);

    public NbpApiResponse getExchangeRates() {
        log.info("Jestem w ExchangeRatesClient");
        return webClient.get()
                // .uri(uriBuilder -> uriBuilder
                //         .path("/greet")
                //         .queryParam("name", name)
                //         .build())
                .retrieve()
                .bodyToMono(NbpApiResponse.class) // Replace with your response type if JSON
                .block(); // Synchronous, blocks until result is received
    }
}