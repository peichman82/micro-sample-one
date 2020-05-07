package es.peichman.jos.samples.micro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.peichman.jos.samples.micro.clients.SampleClient;

@RestController
public class SampleController {

	@Autowired
	private SampleClient sampleClient;

	@GetMapping("/testme")
	public String callService() {
		return "Service-one: " + sampleClient.getRegards();
	}
}
