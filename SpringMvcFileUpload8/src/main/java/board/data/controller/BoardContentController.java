package board.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDao;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardContentController {
	
	@Autowired
	BoardDao dao;
	
	@GetMapping("/board/content")
	public ModelAndView getdataReboard(int num, int currentPage) {
		
		ModelAndView model = new ModelAndView();
		
		BoardDto dto = dao.getDataReboard(num);
		
		model.addObject("dto", dto);
		model.addObject("currentPage", currentPage);
		
		model.setViewName("reboard/content");
		
		return model;
		
	}
}
