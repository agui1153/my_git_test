package cn.kdgc.test.ben;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	
	 public ClassPathXmlApplicationContext cxt;
	 @Before
	 public void init (){
	 	cxt=new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
	 }

}
