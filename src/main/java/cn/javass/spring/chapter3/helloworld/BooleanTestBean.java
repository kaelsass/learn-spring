package cn.javass.spring.chapter3.helloworld;

public class BooleanTestBean {
	private boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void printSuccess()
	{
		System.out.println("success: " + success);
	}
	
}
