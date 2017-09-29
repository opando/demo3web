package com.opm.demo3web.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opm.demo3web.model.Cliente;
import com.opm.demo3web.repository.ClienteRepository;

@Controller
@RequestMapping("/wp")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping("/index")
	public String showIndex( Model model ) {
		System.out.println("### index");
		
		List<Cliente> lista = (List<Cliente>) clienteRepository.findAll();
		System.out.println("size :" + lista.size());
		
		model.addAttribute("clientes", lista);
		
		
		return "clienteslist";
	}
	
	
	@RequestMapping("/clienteForm")
	public String showClienteForm() {
		
		return "clienteform";
	}
}
