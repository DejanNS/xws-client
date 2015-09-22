package org.firma.client.controller;

import org.firma.client.oxm.proverastanja.ProveraStanjaResponse;
import org.firma.client.service.FirmaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

	private final FirmaClientService firmaClientService;

	@Autowired
	public MainController(FirmaClientService firmaClientService) {
		super();
		this.firmaClientService = firmaClientService;
	}

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String getIndexPage() {

		// Show the subscribe page
		// This will resolve to /WEB-INF/jsp/index.jsp

		return "index";
	}

	@RequestMapping(value = "/proverastanja", method = RequestMethod.GET)
	public ProveraStanjaResponse proveraStanja() {

		ProveraStanjaResponse response = firmaClientService.proveraStanja();

		return response;
	}
}
