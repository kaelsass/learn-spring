package cn.javass.spring.chapter3.helloworld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourceBean {
	private FileOutputStream fos;
	private File file;
	
	public void init()
	{
		System.out.println("ResourceBean:============初始化");
		System.out.println("ReSourceBean:============加载资源,执行一些预操作");
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void destroy()
	{
		System.out.println("ResourceBean:============销毁");
		System.out.println("ResourceBean:============释放资源,执行一些清理操作");
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
}
