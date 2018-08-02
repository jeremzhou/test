/**
 * created on 2018年3月2日 下午5:24:14
 */
package redis.redis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

/**
 * @author BenQ
 * @date 2018年3月2日
 *
 */
public class Test {
	public static void getUserNameList() {
		List<PersonModel> data = Data.getData();
		
		//new1
		List<String> list = new ArrayList<String>();
		for(PersonModel person: data) {
			list.add(person.getName());
		}
		System.out.println(list);
		List<String> collect = data.stream().map(person -> person.getName()).collect(toList());
		System.out.println(collect);
		
		//new2
		List<String> colllect1 = data.stream().map(PersonModel ::getName).collect(toList());
		System.out.println(colllect1);
		
		//new3
		List<String>  collect2 = data.stream().map(person ->{
			System.out.println(person.getName());
			return person.getName();
		}).collect(toList());
	}

	
}