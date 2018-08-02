/**
 * created on 2017年12月1日 下午3:40:15
 */
package redis.redis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BenQ
 * @date 2017年12月1日
 *
 */
public class Listaa {
	public static void main(String[] args) {
		List<Student> li=new ArrayList<Student>();
		System.out.println("111");
		li.add(new Student(1,"z"));
		li.add(new Student(2,"h"));
		li.add(new Student(3,"o"));
		li.add(new Student(4,"u"));
		Student stu= li.get(0);
//		System.out.println("111");
		System.out.println(stu.toString());
	}

}
