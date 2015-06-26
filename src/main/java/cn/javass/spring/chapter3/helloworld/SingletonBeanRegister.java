package cn.javass.spring.chapter3.helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

public class SingletonBeanRegister implements SingletonBeanRegistry {

	private static Map<String, Object> BEANS = new HashMap<String, Object>();
	public void registerSingleton(String beanName, Object singletonObject) {
		if(BEANS.containsKey(beanName))
			throw new RuntimeException("[" + beanName + "] exists!");
		BEANS.put(beanName, singletonObject);

	}

	public Object getSingleton(String beanName) {
		return BEANS.get(beanName);
	}

	public boolean containsSingleton(String beanName) {
		return BEANS.containsKey(beanName);
	}

	public String[] getSingletonNames() {
		return BEANS.keySet().toArray(new String[BEANS.size()]);
	}

	public int getSingletonCount() {
		return BEANS.size();
	}

}
