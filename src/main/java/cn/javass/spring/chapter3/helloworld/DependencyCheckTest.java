package cn.javass.spring.chapter3.helloworld;

import java.io.IOException;
import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckTest {
	@Test(expected = UnsatisfiedDependencyException.class)
	public void testDependencyCheckByObject() throws IOException {
		// 将抛出异常
		new ClassPathXmlApplicationContext(
				"chapter3/dependency-check-object.xml");
	}
	
}