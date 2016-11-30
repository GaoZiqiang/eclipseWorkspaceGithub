package cn.edu.sdut.softlab.listendemo;

import java.util.EventListener;

/**
 * DemoEvent事件监听器的接口
 *
 */
public interface IDemoEventListener extends EventListener {
	public void process(DemoEvent event);//process()方法的参数是一个对象
}
