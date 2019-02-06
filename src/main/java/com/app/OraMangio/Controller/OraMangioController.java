package com.app.OraMangio.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class OraMangioController {

    @RequestMapping("/")
    public ModelAndView index() {
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("index");
        return mav;
    }
    
    

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(String nome) {
       
    	if (nome==null) {
    		return "Ciao!!!";
    	}else {
    	return "Ciao " + nome;
    }}
    
}