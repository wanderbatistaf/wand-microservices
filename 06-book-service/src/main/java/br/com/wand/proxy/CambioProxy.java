package br.com.wand.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.wand.response.Cambio;

@FeignClient(name = "cambio-service", url = "localhost:8000")
public interface CambioProxy {
	
	//http://localhost:8000/cambio-service/5/USD/BRL
	@GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(
			@PathVariable("amount") Double amount,
			@PathVariable("from") String from,
			@PathVariable("to") String to
			);

}
