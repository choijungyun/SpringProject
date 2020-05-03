package testPjt01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TranspotationWalk transpotationWalk = new TranspotationWalk();
//		transpotationWalk.move();
		
		//springcontainer에 접근하는 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TranspotationWalk transportationWalk = ctx.getBean("tWalk", TranspotationWalk.class);
		transportationWalk.move();
		
		ctx.close();
	}
}
