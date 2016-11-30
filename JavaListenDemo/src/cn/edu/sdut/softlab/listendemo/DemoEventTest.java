package cn.edu.sdut.softlab.listendemo;

/**
 * 测试事件监听器的整个处理过程
 *
 */
public class DemoEventTest {

	public static void main(String args[]) {

		int i = 0;
		long startTime = System.currentTimeMillis();

		// 定义事件源
		EventSource eventSource = new EventSource();

		// 定义并向事件源中注册事件监听器
		/*
		 * FirstEventListener firstEventListener = new FirstEventListener();
		 * eventSource.addDemoListener(firstEventListener);
		 */

		// 定义并向事件源中注册事件监听器
		SecondEventListener secondEventListener = new SecondEventListener();
		/* eventSource.addDemoListener(secondEventListener); */

		// 事件通知
		while (i < 100) {
			i++;
			eventSource.notifyDemoEvent(0, secondEventListener);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(i + "次的时间为:" + (endTime - startTime) + "MillSeconds");
	}
}
