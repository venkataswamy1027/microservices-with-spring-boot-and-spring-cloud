package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
