package spring.mysql.carmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarMemberController {
	
	@Autowired
	CarMemberInter inter;
	
	@GetMapping("/member/list")
	public String memberStart(Model model) {
		
		//갯수가져오기
		int count = inter.getTotalCount();
		
		//전체출력
		List<CarMemberDto> list = inter.selectCarMember();
		
		//request에 저장
		model.addAttribute("count", count);
		model.addAttribute("list", list);
		
		
		return "carmember/memberlist";
	}
	
	@GetMapping("/member/add")
	public String carMemberForm() {
		return "carmember/addform";
	}
	
	@PostMapping("/member/write")
	public String memberInsert(CarMemberDto dto) {
		

		inter.insert(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/member/modify")
	public String memberGetData(Model model, int num) {
		CarMemberDto dto =  inter.getdata(num);
		
		model.addAttribute("dto", dto);
		
		return "carmember/updateform";
		
	}
	
	@PostMapping("/member/update")
	public String memberUpdate(CarMemberDto dto) {
		
		inter.updateCarMember(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/member/delete")
	public String memberDelete(int num) {
		
		inter.deleteCarMember(num);
		
		return "redirect:list";
	}
}
