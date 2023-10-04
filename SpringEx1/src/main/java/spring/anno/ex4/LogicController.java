package spring.anno.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logic") //id�� logic�� �ȴ�
//@Component
public class LogicController {
	
	@Autowired
	//��Ȯ�� ���� ���̵�� ����_��ȣ���� �ִ� ��쿡�� @Resource(name="myDao(��Ȯ���̸�)")
	DaoInter daoInter;
	
	public LogicController(MyDao dao) {
		// TODO Auto-generated constructor stub
		this.daoInter = dao;
	}
	
	//insert
	public void insert(String str) {
		daoInter.insertData(str);
	}
	
	//delete
	public void delete(String num) {
		daoInter.deleteData(num);
	}
}
