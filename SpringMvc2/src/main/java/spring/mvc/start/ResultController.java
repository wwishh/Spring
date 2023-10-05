package spring.mvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	@GetMapping("/apple/list") //list뒤에 .do나 다른 확장자를 붙히던 다 호출됨
	public String result1(Model model) {
		
		model.addAttribute("name", "위시온");
		model.addAttribute("age", "26");
		return "result1";
	}
	
	
	@GetMapping("/banana/insert")
	public ModelAndView banana() {
		//ModelAndView는 request에 저장하기 위한 Model과
		//forward하기위한 View를 합쳐놓은 클래스입니다
		ModelAndView mview = new ModelAndView();
		
		//request에 저장
		mview.addObject("java", 88);
		mview.addObject("info", 60);
		
		//forward할 jsp파일 지정
		mview.setViewName("result2");
		
		return mview;
	}
	
	@GetMapping("/orange/delete")
	public ModelAndView orange() {
		ModelAndView mview = new ModelAndView();
		
		mview.addObject("sangName", "갤럭시s10+");
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
