package spring.mvc.json;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //json처리 전용 컨트롤러
public class JsonTest2Controller {
	
	@GetMapping("/list2")
	public Map<String, String> list2(){
		Map<String, String> map = new HashMap<String, String>();
	
		map.put("sang", "요가매트");
		map.put("price", "23000");
		map.put("color", "화이트");
		
		return map;
	}
}
