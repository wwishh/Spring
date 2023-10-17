package board.data.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.reboard.BoardDao;
import spring.mvc.reboard.BoardDto;

@Controller
public class BoardDeleteController {

	@Autowired
	BoardDao dao;

	@GetMapping("board/deletepassform")
	public ModelAndView dpassform(String num, String currentPage) {

		ModelAndView model = new ModelAndView();

		model.addObject("num", num);
		model.addObject("currentPage", currentPage);

		model.setViewName("reboard/delpassform");
		return model;
	}

	@PostMapping("board/deletepass")
	public String deletedetail(int num, int pass, int currentPage, HttpSession session) {

		String path = session.getServletContext().getRealPath("/WEB-INF/photo");
		System.out.println(path);

		if (dao.getCheckPass(num, pass) == 1) {
			String pre_photo = dao.getDataReboard(num).getPhoto();

			String[] pre_fName = pre_photo.split(",");
			for (String f : pre_fName) {
				File file = new File(path + "/" + f);
				file.delete();

			
			}

			dao.deleteDetail(num);
			
			return "redirect:list?currentPage=" +currentPage;
		}else {
			return "reboard/passfail";
		}

		

	}

}
