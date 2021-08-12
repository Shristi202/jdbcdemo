package annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation/config.xml");
		
		context.registerShutdownHook();
		
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
//		
//		System.out.println("**************************************");
//		
//		Pizza p1 = (Pizza) context.getBean("p1");
//		System.out.println(p1);
		
		//Example example = (Example) context.getBean("example");
		//System.out.println(example);
		
	}

}
