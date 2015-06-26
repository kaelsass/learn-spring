package cn.javass.spring.chapter3.helloworld;

import java.io.IOException;

public class DependentBean {
	private ResourceBean resourceBean;
	public void write(String str) throws IOException
	{
		System.out.println("DependentBean:============写资源");
		resourceBean.getFos().write(str.getBytes());
	}
	public void init() throws IOException
	{
		System.out.println("DependentBean:=============初始化");
		resourceBean.getFos().write("DependentBean:===============初始化".getBytes());
	}
	public void destroy() throws IOException
	{
		System.out.println("DependentBean:==============销毁");
		resourceBean.getFos().write("DependentBean:=================销毁".getBytes());
	}

	public void setResourceBean(ResourceBean resourceBean) {
		this.resourceBean = resourceBean;
	}
}
