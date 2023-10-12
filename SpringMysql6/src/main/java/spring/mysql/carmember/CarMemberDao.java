package spring.mysql.carmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarMemberDao implements CarMemberInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("getTotalCountOfCarMember");
	}

	@Override
	public void insert(CarMemberDto dto) {
		session.insert("insertOfCarMember", dto);
	}

	@Override
	public List<CarMemberDto> selectCarMember() {
		// TODO Auto-generated method stub
		return session.selectList("selectOfCarMemeber");
	}

	@Override
	public CarMemberDto getdata(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("getDataOfCarMember",num);
	}

	@Override
	public void updateCarMember(CarMemberDto dto) {
		// TODO Auto-generated method stub
		session.update("updateOfCarMember", dto);
	}

	@Override
	public void deleteCarMember(int num) {
		// TODO Auto-generated method stub
		session.delete("deleteOfCarMember", num);
	}

	
	
	



}
