package answer.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDao implements AnswerDaoInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public void insertAnswer(AnswerDto dto) {
		// TODO Auto-generated method stub
		session.insert("InsertOfReanswer", dto);
	}

	@Override
	public List<AnswerDto> getAnswerList(int num) {
		// TODO Auto-generated method stub
		return session.selectList("SelectNumOfReanswer", num);
	}
	
	@Override
	public int comparePass(int idx, int pass) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("idx", idx);
		map.put("pass", pass);
		// TODO Auto-generated method stub
		return session.selectOne("comparePass", map);
	}

	@Override
	public void deleteAnswer(int idx) {
		// TODO Auto-generated method stub
		session.delete("DeleteOfReanswer", idx);
		
	}

	

}
