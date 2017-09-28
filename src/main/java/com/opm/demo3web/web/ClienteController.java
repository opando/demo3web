package com.opm.demo3web.web;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wp")
public class ClienteController {
	
	@RequestMapping
	public String getIndex() {
		
		return "clientes";
	}
}
