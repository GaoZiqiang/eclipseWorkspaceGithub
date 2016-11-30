package cn.edu.sdut.softlab.listendemo;

import java.util.EventObject;

/**事件对象
  *
  */
public class DemoEvent extends EventObject {
    //实现序列化
	private static final long serialVersionUID = -2440129584829446909L;

	public DemoEvent(Object source) {
		super(source);
	}
}