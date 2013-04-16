package it.uniroma2.siwa.beans;

public class FirstBean {

	private SecondBean secondBean;
	private ThirdBean thirdBean;
	
	private String message;
	
	public FirstBean(ThirdBean thirdBean) {
		this.thirdBean = thirdBean;
	}

	public SecondBean getSecondBean() {
		return secondBean;
	}

	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}

	public ThirdBean getThirdBean() {
		return thirdBean;
	}

	public void setThirdBean(ThirdBean thirdBean) {
		this.thirdBean = thirdBean;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
