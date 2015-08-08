package com.github.pratzn.af.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public abstract class AbstractController {
	
	@ModelAttribute
	protected void setupModel(){
		
	}

}
