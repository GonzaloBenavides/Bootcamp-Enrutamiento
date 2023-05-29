package cl.gonzalobenavides.enrutamiento.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	
	@RequestMapping("/coding")
	public String getCoding() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String getCodingPython() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("/coding/java")
	public String getCodingJava() {
		return "¡Java/Spring es mejor!";
	}

}
