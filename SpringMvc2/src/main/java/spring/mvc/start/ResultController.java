package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	@GetMapping("/apple/list") //list�ڿ� .do�� �ٸ� Ȯ���ڸ� ������ �� ȣ���
	public String result1(Model model) {
		
		model.addAttribute("name", "���ÿ�");
		model.addAttribute("age", "26");
		return "result1";
	}
	
	
	@GetMapping("/banana/insert")
	public ModelAndView banana() {
		//ModelAndView�� request�� �����ϱ� ���� Model��
		//forward�ϱ����� View�� ���ĳ��� Ŭ�����Դϴ�
		ModelAndView mview = new ModelAndView();
		
		//request�� ����
		mview.addObject("java", 88);
		mview.addObject("info", 60);
		
		//forward�� jsp���� ����
		mview.setViewName("result2");
		
		return mview;
	}
	
	@GetMapping("/orange/delete")
	public ModelAndView orange() {
		ModelAndView mview = new ModelAndView();
		
		mview.addObject("sangName", "������s10+");
		mview.addObject("price", 1000000);
		mview.addObject("color", "pink");
		
		mview.setViewName("result3");
		
		return mview;
	}
	
	@GetMapping("/shop/detail")
	public String resImage() {
		return "result4";
	}
	
	@GetMapping("/board/insert/data")
	public String shopImage() {
		return "result5";
	}
}
