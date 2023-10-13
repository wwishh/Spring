package spring.mvc.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // jsonó�� ���� ��Ʈ�ѷ�
public class JsonTest2Controller {

	@GetMapping("/list2")
	public Map<String, String> list2() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("sang", "�䰡��Ʈ");
		map.put("price", "23000");
		map.put("color", "ȭ��Ʈ");

		return map;
	}

	@GetMapping("/list4")
	public Map<String, Object> list4(String name) {
		
		List<PhotoDto> list = new ArrayList<PhotoDto>();

		list.add(new PhotoDto("���̸�", "1.png"));
		list.add(new PhotoDto("���α�", "2.png"));
		list.add(new PhotoDto("�Ḹ��", "3.png"));
		list.add(new PhotoDto("��Ÿ��", "4.png"));
		list.add(new PhotoDto("���ڸ�", "5.png"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "���� ���ϸ�");
		map.put("photo", "6.png");
		
		for(PhotoDto dto:list) {
			if(name.equals(dto.getName())) {
				map.put("name", dto.getName());
				map.put("photo", dto.getPhoto());
			}
		}
		
		return map;
	}
}
