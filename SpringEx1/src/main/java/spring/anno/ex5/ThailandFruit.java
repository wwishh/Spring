package spring.anno.ex5;

import org.springframework.stereotype.Component;

@Component("tfruit")
public class ThailandFruit implements Fruit {

	@Override
	public void writeFruitName() {
		// TODO Auto-generated method stub
		System.out.println("태국과일은 맛있다");
	}

}
