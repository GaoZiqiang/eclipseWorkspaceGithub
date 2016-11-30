package cn.edu.sdut.softlab.listendemo;

import java.util.ArrayList;
import java.util.List;

/**
 *事件源
 *触发事件监听器
 *
 */
public class EventSource {

	/*private List<IDemoEventListener> listeners = new ArrayList<IDemoEventListener>();*/
/*
	public EventSource() {
	}

	public void addDemoListener(IDemoEventListener demoListener) {
		listeners.add(demoListener);
	}*/
    //事件源触发监听器的“行为”，调用监听器的process()方法
	public void notifyDemoEvent(int flag,IDemoEventListener eventListener) {

		/*for (IDemoEventListener eventListener : listeners) {*/
		if(flag == 0) {
			DemoEvent demoEvent = new DemoEvent(this);
			eventListener.process(demoEvent);//process()方法是监听器的方法
		}
		
			
		/*}*/
	}

}
