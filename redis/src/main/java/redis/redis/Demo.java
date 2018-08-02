/**
 * created on 2017年11月30日 下午2:51:32
 */
package redis.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author BenQ
 * @date 2017年11月30日
 *
 */
public class Demo {
	public static void main(String[] args) {
		init();
	}
	public static void init() {
		 Jedis jedis = new Jedis("10.48.114.34");
		 /*if (jedis != null) {
	            jedis.auth("jeremy");
	            System.out.println("connect to redis server sucessfully");
	        }*/
	        jedis.set("myredis","ok");
	        System.out.println(jedis.get("myredis"));
	    }
	}
