package org.firma.client.service.impl;

import javax.annotation.Resource;

import org.firma.client.oxm.proverastanja.ProveraStanjaRequest;
import org.firma.client.oxm.proverastanja.ProveraStanjaResponse;
import org.firma.client.service.FirmaClientService;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service("FirmaClientService")
public class FirmaClientServiceImpl implements FirmaClientService {

	@Resource(name = "webServiceTemplate")
	private WebServiceTemplate webServiceTemplate;

	@Override
	public ProveraStanjaResponse proveraStanja() {
		ProveraStanjaRequest request = new ProveraStanjaRequest();
		request.setBrojRacuna("310-04001071221-35");
		ProveraStanjaResponse response = (ProveraStanjaResponse) webServiceTemplate.marshalSendAndReceive(request);

		return response;
	}


}
