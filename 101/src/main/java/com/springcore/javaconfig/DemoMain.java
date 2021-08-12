package com.springcore.javaconfig;
// without the xml files we have created beans
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //used to close the class ClassPathXmlApplicationContext
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
	    // JavaConfig class acts as the master and runs all the methods
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stud = context.getBean("firststudent",Student.class);
	    System.out.println(stud);
	    stud.study();
	    
	    //context.close();
	}

}
