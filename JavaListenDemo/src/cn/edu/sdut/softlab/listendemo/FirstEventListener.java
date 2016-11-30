package cn.edu.sdut.softlab.listendemo;

/**
 * 第一个具体的事件监听器实现类
 *实现监听器接口
 */
public class FirstEventListener implements IDemoEventListener {

	@Override
	public void process(DemoEvent event) {
		System.out.println("First event listener process event...");
	}

}
