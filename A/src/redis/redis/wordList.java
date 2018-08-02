/**
 * created on 2017年12月5日 下午6:59:48
 */
package redis.redis;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author BenQ
 * @date 2017年12月5日
 *
 */
public class wordList {
		public static void main(String[] args) {
			Set<String> s=new TreeSet<String>();
			Collections.addAll(s, args);
			System.out.println(s);
			}
}
