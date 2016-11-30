package cn.edu.sdut.softlab.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();// 结合泛型来理解Java集合类

		set.add(new Student("gaoziqiang", 21));
		set.add(new Student("gaohan", 2222));

		System.out.println(set.size());
		//使用迭代器Iterator输出set中的元素
		Iterator<Student> it = set.iterator();
		 while(it.hasNext()){
			    System.out.println((Student)it.next());
			   }
		

		/*for (Iterator<Integer> it = ((Object) set).keySet().iterator(); it.hasNext();) {

		}
*/
	}
}
