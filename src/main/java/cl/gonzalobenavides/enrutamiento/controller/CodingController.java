package cl.gonzalobenavides.enrutamiento.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CodingController {
	
	@RequestMapping("/coding")
	@ResponseBody
	public String getCoding() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	@ResponseBody
	public String getCodingPython() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("/coding/java")
	@ResponseBody
	public String getCodingJava() {
		return "¡Java/Spring es mejor!";
	}

}
