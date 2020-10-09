package com.akku.myController;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akku.myModels.LoginData;
import com.akku.myService.userService;

@Controller
public class testController {
	
	@Autowired
	userService service;
	
	@RequestMapping("/")
	public String First(Model m) {
		m.addAttribute("obj", new LoginData());
		return "registrationPage";
	}
	
	@RequestMapping("/processRegistration")
	public ModelAndView processReg(@Valid @ModelAttribute("obj") LoginData user, BindingResult br) {
		if(service.registerUser(user)) {
			if(br.hasErrors()) {
				System.out.println(br.toString());
				return new ModelAndView("registrationPage","msg","Fields must be filled properly");
			}
			return new ModelAndView("processRegistration","objUser",new LoginData());
		}
		
		return new ModelAndView("registrationPage","msg","Registration failed !!!");
	}
	
	@RequestMapping("/startPage")
	public String loginCheck(@ModelAttribute("obj")LoginData user,Model model) {
//		if(user.getUserName().equals("") || user.getUserEmail().equals("") || user.getUserPhoneNumber().equals("")) {
//			model.addAttribute("msg","Form Incomplete !");
//			return "login";
//		}else {
//			
//		}
		return "startPage";
	}
	
	@ModelAttribute("states")
	public Map<String,String> stateNames() {
		Map<String,String> state = new HashMap<>();
		state.put("DL", "Delhi");
		state.put("PB", "Punjab");
		state.put("HR", "Haryana");
		state.put("UK", "Uttrakhand");
		return state;
	}
}
