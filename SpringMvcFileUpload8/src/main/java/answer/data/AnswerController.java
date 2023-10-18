package answer.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnswerController {
	
	@Autowired
	AnswerDao dao;
	
	@PostMapping("/board/ainsert")
	public String insertAnswer(AnswerDto dto, int currentPage) {
		
		dao.insertAnswer(dto);
		
		return "redirect:content?num=" + dto.getNum() + "&currentPage=" + currentPage;
	}
	
	@GetMapping("/board/adelete")
	@ResponseBody
	public String deleteAnswer(int idx, int pass) {
		
		int check = dao.comparePass(idx, pass);
		
		if(check==1) {
			dao.deleteAnswer(idx);
			return "1";
		}else {
			return "0";
		}
		
	}

}
