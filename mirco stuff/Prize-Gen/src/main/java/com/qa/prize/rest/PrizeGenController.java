package com.qa.prize.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.prize.service.PrizeGenService;

@RestController
@RequestMapping("/prizegen")
public class PrizeGenController {

	private PrizeGenService service;

	public PrizeGenController(PrizeGenService service) {
		this.service = service;
	}

	@GetMapping("/generate/{accountNumber}")
	public Double genPrize(@PathVariable String accountNumber) {
		return this.service.genPrize(accountNumber);
	}

}
