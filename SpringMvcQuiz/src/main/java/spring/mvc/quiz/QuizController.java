package spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuizController {

	@GetMapping("/ilike/movie")
	public ModelAndView quiz1(@RequestParam(value = "msg", defaultValue = "Hello") String msg) {
		ModelAndView mview = new ModelAndView();

		mview.addObject("msg", msg);

		// forward
		mview.setViewName("quiz1");

		return mview;
	}

	@GetMapping("/school/myinfo")
	public ModelAndView quiz2(String name, String sname, String grade, String addr) {
		ModelAndView mview = new ModelAndView();

		mview.addObject("name", name);
		mview.addObject("sname", sname);
		mview.addObject("grade", grade);
		mview.addObject("addr", addr);

		// forward
		mview.setViewName("quiz2");

		return mview;
	}
}
