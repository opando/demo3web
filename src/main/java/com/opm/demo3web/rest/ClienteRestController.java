package com.opm.demo3web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opm.demo3web.model.Cliente;
import com.opm.demo3web.repository.ClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping(value="/cliente", method=RequestMethod.POST)
	public Cliente registrarCliente(@RequestBody Cliente cliente) {
					
		Cliente c = clienteRepository.save(cliente);
				
		return c;
	}
	
	@RequestMapping(value="/cliente/{id}", method=RequestMethod.GET)
	public Cliente obtenerCliente(@PathVariable String id) {
		
		Cliente c = clienteRepository.findOne(id);
		
		return c;
	}
	
}
