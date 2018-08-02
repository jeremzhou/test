package redis.redis;

import java.text.SimpleDateFormat;
import java.util.Date;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class RedisDemo {
	
    public static void main( String[] args ){
//    	Jedis jedis = new Jedis("172.19.132.156",6379);
    	Jedis jedis = new Jedis("10.48.114.34",6379);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String dateString = sdf.format(new Date());
    	long epoch = System.currentTimeMillis()/1000;
    	String date=String.valueOf(epoch);
		System.out.println("connection to server successfully");
		jedis.set("tutorialname", "redis tutorial");
		jedis.set("sandy", "7845");
		jedis.set("jeremy", "9874");
		jedis.set("sandy", "7845");
		jedis.set("jermy", dateString);
		jedis.set("ut", date);
		System.out.println("stored string in redis:" + jedis.get("jermy"));
		System.out.println("时间戳为:" +jedis.get("ut"));
    }
}
