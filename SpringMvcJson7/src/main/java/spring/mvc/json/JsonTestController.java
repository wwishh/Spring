package spring.mvc.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTestController {
	
	@GetMapping("/list1")
	@ResponseBody //json���� ó�� �� �������� ���
	public Map<String, String> list1(){
		Map<String, String> map = new HashMap<String, String>();
	
		map.put("name", "�����");
		map.put("hp", "010-222-3333");
		map.put("addr", "������ ��ȱ�");
		
		return map;
	}
	
	@GetMapping("/list3")
	public @ResponseBody List<PhotoDto> list3(){
		
		List<PhotoDto> list = new ArrayList<PhotoDto>();
		
		list.add(new PhotoDto("���̸�", "1.png"));
		list.add(new PhotoDto("���α�", "2.png"));
		list.add(new PhotoDto("�Ḹ��", "3.png"));
		list.add(new PhotoDto("��Ÿ��", "4.png"));
		list.add(new PhotoDto("���ڸ�", "5.png"));
		
		return list;
	}
}
