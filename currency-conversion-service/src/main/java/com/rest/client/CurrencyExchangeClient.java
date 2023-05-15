package com.rest.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rest.model.CurrencyConversion;

//@FeignClient(name="currency-exchange-service", url= "localhost:8000")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeClient {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to);
}
