package com.r4jrk.exchangerates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //TODO: Add a Swagger to the project
public class ExchangeRatesRestController {

	private static final Logger log = LoggerFactory.getLogger(ExchangeRatesClient.class);

    @Autowired
    private ExchangeRatesClient exchangeRatesClient;

    @GetMapping("/exchangerates")
    public NbpApiResponse getExchangeRates(Model model) {
        log.info("Jestem w EchangeRatesRestControllerze");
        NbpApiResponse nbpApiResponse = exchangeRatesClient.getExchangeRates();
        log.info(nbpApiResponse.toString());
        return nbpApiResponse;
	}
}