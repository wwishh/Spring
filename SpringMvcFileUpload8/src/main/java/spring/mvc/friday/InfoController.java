package spring.mvc.friday;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class InfoController {
	
	@Autowired
	InfoInter inter;
	
	@GetMapping("/info/list")
	public String getToalCount(Model model, @RequestParam(defaultValue = "name") String title,
			@RequestParam(required = false) String search) {
		
		//List<InfoDto> list = inter.getAllInfos();
		
		System.out.println(title+","+search);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", search);
		map.put("title", title);
		
		List<InfoDto> list = inter.getAllInfos(map);
		
		model.addAttribute("count", inter.getTotalCount());
		model.addAttribute("list", list);
		//model.addAttribute("search", search);
		//model.addAttribute("title", title);
		//굳이 add 안해줘도 됨
		
		return "info/infolist";
	}
	
	@GetMapping("/info/addform")
	public String form() {
		
		return "info/addform";
	}
	
	@PostMapping("/info/insert")
	public String insert(InfoDto dto, MultipartFile upload, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/resources/image/");
		System.out.println(path);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String photo="";
		
		//사진 선택을 안했을경우 no..
		if(upload.getOriginalFilename().equals(""))
			photo="no";
		else {
			String fName = upload.getOriginalFilename();
			fName = sdf.format(new Date()) + "_" + fName;
			photo = fName;
			
			//업로드
			try {
				upload.transferTo(new File(path+"/"+photo));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		//dto의 photo에 넣기
		
		dto.setPhoto(photo);
		
		//insert
		
		inter.insertMyInfo(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/info/uform")
	public String uform(String num, Model model) {
		
		InfoDto dto= inter.getData(num);
		model.addAttribute("dto", dto);
		
		return "info/updateform";
	}
	
	@PostMapping("/info/update")
	public String update(InfoDto dto, MultipartFile upload, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/resources/image/");
		System.out.println(path);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String oldname = inter.getData(dto.getNum()).getPhoto();
		
		String photoname; //dto에 담을 변수
		
		//사진 선택안할 경우 null
		if(upload.getOriginalFilename().equals(""))
			photoname = null;
		else {
			photoname = upload.getOriginalFilename();
			photoname = sdf.format(new Date()) + "_" + photoname;
			File file = new File(path + "/" + oldname);
			file.delete();
			
			//업로드
			try {
				upload.transferTo(new File(path + "/" + photoname));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//dto의 photo에 업로드한 photoname넣어주기
		dto.setPhoto(photoname);
		
		//update
		inter.updateMyInfo(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/info/delete")
	public String delete(String num, HttpSession session) {
		
		String photo = inter.getData(num).getPhoto();
		
		if(!photo.equals("no")) {
			String path = session.getServletContext().getRealPath("/resources/image/");
			
			//realpath에 있는 파일 삭제
			File file = new File(path + "/" + photo);
			file.delete();
		}
		
		//db삭제
		inter.deleteMyInfo(num);
		
		return "redirect:list";
	}
	
}
