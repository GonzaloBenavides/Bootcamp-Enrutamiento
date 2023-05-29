package cl.gonzalobenavides.enrutamiento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DojoController {
	
	@RequestMapping("/{dojo}")
	@ResponseBody
	public String getDojo(@PathVariable String dojo) {
		if(dojo.equals("dojo")) 
			return "¡El Dojo es increíble!";
		else if(dojo.equals("burbank-dojo")) 
			return "El Dojo Burbank está localizado al sur de California.";
		else if(dojo.equals("san-jose")) 
			return "El Dojo SJ es el cuartel general.";
		else return "/error";
	}
	
}
