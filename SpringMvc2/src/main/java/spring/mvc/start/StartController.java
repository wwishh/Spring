package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
	
	//start.jsp�� �������� �޼ҵ�(forward)
	@GetMapping("/") //pom.xml���� ���� 5.2.9�� �ٲٱ�
	public String start(Model model) {
		
		//Model: reqpuest�� �����͸� �����ϱ����� �������̽�
		//�������� �ϴ� request.setAttribute�� ����
		
		model.addAttribute("name", "�迵ȯ");
		model.addAttribute("addr", "����� ������");
		
		return "start"; //WEB-INF/day1005/start.jsp
	}
}
