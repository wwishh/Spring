package spring.mvc.munje;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import spring.data.dto.MunjeDto;

@Controller
public class InfoController {
	
	@GetMapping("/info/form")
	public String form() {
		return "info/infoForm";
	}
	
	@PostMapping("/info/result")
	public String result(@ModelAttribute("dto") MunjeDto dto) {
		return "info/infoWrite";
	}
}
