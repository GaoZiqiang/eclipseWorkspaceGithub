package cn.edu.sdut.softlab.exercise;

/**

* 事件观察者
* 一个观察者的处理方式是在方法中,加入一个参数注解@Observes

* @author GaoZiqiang

* @Time 2016-11-18

*

*/
import javax.enterprise.event.Observes;

public class ExerciseListen {
	// 带注解的参数称为事件参数。事件的参数类型是观察到的事件类型

	public void onWalk(@Observes Walk iWalk) {// 不能同时有多个@Observes return
		System.out.println("监听器已经相应......");
	}
    
	/*public void timeTotal() {
		
	}*/
}