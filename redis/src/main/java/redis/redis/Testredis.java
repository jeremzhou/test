/**
 * created on 2017年12月7日 下午1:58:55
 */
package redis.redis;

import redis.clients.jedis.Jedis;

/**
 * @author BenQ
 * @date 2017年12月7日
 *
 */
public class Testredis {
public static void main(String[] args) {
	// Connecting to Redis server on localhost
	//实例化一个客户端
	Jedis jedis = new Jedis("172.19.132.156",6379);
	//=================================================
	// check whether server is running or not
	//ping下，看看是否通的
	System.out.println("Server is running: " + jedis.ping());
	//保存一个
//	jedis.set("leiTest", "localhost Connection  sucessfully");
	//获取一个
//	System.out.println("通过key获取value：    " + jedis.get("leiTest"));
}
}
