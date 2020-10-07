package myController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping("/")
	public String First(Model m) {
		m.addAttribute("obj", new LoginData());
		return "registrationPage";
	}
	
	@RequestMapping("/processRegistration")
	public String processReg(Model m) {
		m.addAttribute("obj", new LoginData());
		return "processRegistration";
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
