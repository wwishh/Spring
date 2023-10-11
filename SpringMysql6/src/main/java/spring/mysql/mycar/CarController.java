package spring.mysql.mycar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

	@Autowired
	MyCarDao dao;

	@GetMapping("/kakao/list")
	public String list(Model model) {

		// dao�� ���� �� ���� ��������
		int totalCount = dao.getTotalCount();
		
		//��� ��������
		List<MyCarDto> list = dao.getAllCars();

		// request�� ����
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
		
		return "car/carlist";
	}

	@GetMapping("/kakao/writeform")
	public String carform() {
		return "car/writeform";
	}

	// insert
	@PostMapping("/kakao/write")
	public String insert(@ModelAttribute MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list";
	}
	
	//delete
	@GetMapping("/kakao/delete")
	public String delete(String num) {
		
		dao.deleteCar(num);
		
		return "redirect:list";
	}
	
	//getdata
	@GetMapping("/kakao/updateform")
	public ModelAndView getData(String num) {
		
		ModelAndView model = new ModelAndView();
		
		MyCarDto dto = dao.getDataOfMyCar(num); 
		
		model.addObject("dto", dto);
		
		model.setViewName("car/updateform");
		
		return model;
	}
	
	@PostMapping("/kakao/update")
	public String update(@ModelAttribute MyCarDto dto) {
		
		dao.updateCar(dto);
		
		return "redirect:list";
	}
}
