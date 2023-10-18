package board.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import answer.data.AnswerDao;
import answer.data.AnswerDto;
import spring.mvc.reboard.BoardDao;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardContentController {
	
	@Autowired
	BoardDao dao;
	
	@Autowired
	AnswerDao adao;
	
	@GetMapping("/board/content")
	public ModelAndView getdataReboard(int num, int currentPage) {
		
		ModelAndView model = new ModelAndView();
		
		//��ȸ�� ����
		dao.updateReadcount(num);
		
		BoardDto dto = dao.getDataReboard(num);
		
		//num�� �ش��ϴ� ����� db���� �����ͼ� ������
		List<AnswerDto> alist = adao.getAnswerList(num);
		
		//���� �������� �Ѱܾ� �ϹǷ�
		model.addObject("acount", alist.size());
		model.addObject("alist", alist);
		model.addObject("dto", dto);
		model.addObject("currentPage", currentPage);
		
		model.setViewName("reboard/content");
		
		return model;
		
	}
}
