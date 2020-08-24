package com.sakaiwebservicesoap.controlador;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sakaiwebservicesoap.modelo.login;

@Controller
@RequestMapping("/crearLogin")
public class controlador {




	@RequestMapping("/muestraLogin")
	public   String muestraLogin() {
		
		
		return"index.jsp";
	}
	@RequestMapping("/procesarLogin")
	public String procesarLogin() {
		
		
		return"principal.jsp";
		
	}
	
	
	@RequestMapping("/muestralogin")
	public String muestraformulario(Model modelo) {
		
	login elogin=new login();	
	
	modelo.addAttribute("elogin",elogin);
		
	return "ConfirmacionSakaiLogin"	;
	}
	
	

	@RequestMapping("/procesarLogin")
	public String procesarLogin(@Valid @ModelAttribute("elogin") login elogin , 
			BindingResult  resulatdoValidacion) {
		
		if (resulatdoValidacion.hasErrors()) {
			
			return "ConfirmacionSakaiLogin";
			
		}else {
		
		return "SakaiLogin";}
		
	}
}
