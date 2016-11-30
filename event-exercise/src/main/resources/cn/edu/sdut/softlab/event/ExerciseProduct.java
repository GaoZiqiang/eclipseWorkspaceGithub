package cn.edu.sdut.softlab.exercise;

/**

* 事件生产者
* 

* @author GaoZiqiang

* @Time 2016-11-18

*

*/
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@Named("producer")
public class ExerciseProduct {

	@Inject
	@QuWalk
	Event<Walk> iWalk;

	public void produceWalk() {
		// 事件生产者通过调用fire()方法,并传递"事件对象"从而激活事件处理.
		int i = 0;
		while (i < 100) {
			i++;
			iWalk.fire(new Walk());// fire()方法的参数是个对象
		}
	}

}