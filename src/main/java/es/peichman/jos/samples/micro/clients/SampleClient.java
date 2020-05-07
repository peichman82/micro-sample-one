package es.peichman.jos.samples.micro.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "micro-sample-two")
public interface SampleClient {

	@GetMapping("/regards")
	public String getRegards();
}
