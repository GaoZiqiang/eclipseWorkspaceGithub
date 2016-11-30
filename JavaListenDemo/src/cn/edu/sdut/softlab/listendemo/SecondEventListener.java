package cn.edu.sdut.softlab.listendemo;

/**
 * 第一个具体的事件监听器实现类
 *
 */
public class SecondEventListener implements IDemoEventListener {

	@Override
	public void process(DemoEvent event) {
		//System.out.println("Second event listener process event...");
		//println();//调用其他的方法
	}
	
	public void println() {
		System.out.println("Hello second listener!");
	}

}
