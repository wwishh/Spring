package spring.mvc.wish;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String start() {
		return "start"; //return "form"
	}
	
	@GetMapping("/login/form")
	public String form() {
		return "form";
	}
	
	@GetMapping("/login/read")
	public String process(Model model, @RequestParam(value = "myid") String id, 
			@RequestParam(value = "mypass") String pass) { //@RequestParam ��������
		
		model.addAttribute("id", id);
		
		String msg = "";
		
		if(pass.equals("1234"))
			msg = "�α��� ����!!!";
		else
			msg = "�α��� ����!!!";
		
		model.addAttribute("msg", msg);
		
		return "result";
	}
}
