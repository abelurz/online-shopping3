package abelurz.com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("saludo","Bienvenido Abel!");
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "saludo", required = false) String saludo) {
		if (saludo == null) {
			saludo = "Hola sin parametro";
		}
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("saludo",saludo);
		return mv;
	}

}
