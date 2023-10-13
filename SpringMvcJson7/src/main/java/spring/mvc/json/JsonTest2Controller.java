package spring.mvc.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // json처리 전용 컨트롤러
public class JsonTest2Controller {

	@GetMapping("/list2")
	public Map<String, String> list2() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("sang", "요가매트");
		map.put("price", "23000");
		map.put("color", "화이트");

		return map;
	}

	@GetMapping("/list4")
	public Map<String, Object> list4(String name) {
		
		List<PhotoDto> list = new ArrayList<PhotoDto>();

		list.add(new PhotoDto("파이리", "1.png"));
		list.add(new PhotoDto("꼬부기", "2.png"));
		list.add(new PhotoDto("잠만보", "3.png"));
		list.add(new PhotoDto("메타몽", "4.png"));
		list.add(new PhotoDto("리자몽", "5.png"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "없는 포켓몬");
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
