package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	
	@GetMapping("/happy")
	public String quiz1() {
		return "quiz1";
	}
	
	@GetMapping("/hello") 
	public String quiz2(Model model) {
		
		model.addAttribute("msg", "�ȳ��ϼ���~");
		return "quiz2";
	}
	
	@GetMapping("/nice/hi") 
	public String quiz3(Model model) {
		
		model.addAttribute("name", "���ÿ�");
		model.addAttribute("age", "26");
		model.addAttribute("addr", "�����ֽ�");
		return "quiz3";
	}
}
