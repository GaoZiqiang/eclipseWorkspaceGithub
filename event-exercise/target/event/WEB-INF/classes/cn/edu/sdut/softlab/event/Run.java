package cn.edu.sdut.softlab.exercise;

public class Run implements Exercise {
	private String moveWay;
	private String moveSpeed;

	
	public void moveWay() {
		System.out.println("the moveWay is" + moveWay);
	}

	public void moveSpeed() {
		System.out.println("running's moveSpeed is" + moveSpeed);
	}

}
