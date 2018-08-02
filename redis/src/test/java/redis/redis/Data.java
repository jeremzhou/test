/**
 * created on 2018年3月2日 下午5:26:29
 */
package redis.redis;

import java.util.Arrays;
import java.util.List;

/**
 * @author BenQ
 * @date 2018年3月2日
 *
 */
public class Data {
	
	private static List<PersonModel> list = null;
	
	static {
		PersonModel zhou = new PersonModel("周",23,"男");
		PersonModel zhang = new PersonModel("张",22,"男");
		PersonModel liu = new PersonModel("刘",26,"男");
		PersonModel li = new PersonModel("李",21,"男");
		list = Arrays.asList(zhou,zhang,liu,li);
	}
	
	public static List<PersonModel> getData(){
		return list;
	}
}
