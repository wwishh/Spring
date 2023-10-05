package spring.anno.last;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JumunController {

	@Autowired
	ShopInter shopInter;
	
	int cnt = 10;
	String name = "ȫ����";
	
	public void insertJumun(String sang, int price, String color) {
		shopInter.insertSangpum(sang, price, color);
		System.out.println(name+"����"+cnt+"���� �ֹ���!!!");
	}
	
	public void deleteJumun(String num) {
		shopInter.deleteSangpum(num);
	}
	
	public void selectJumun(String sang, int price, String color) {
		System.out.println("�ֹ���: " + name);
		shopInter.selectShop(sang, price, color);
		System.out.println("�ֹ�����: " + cnt);
	}
}
