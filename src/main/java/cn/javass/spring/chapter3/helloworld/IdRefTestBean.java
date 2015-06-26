package cn.javass.spring.chapter3.helloworld;

public class IdRefTestBean {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void print()
	{
		System.out.println("id: " + id);
	}
	
}
