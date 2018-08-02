/**
 * created on 2017年11月30日 下午2:42:01
 */
package com.utstart;

import redis.clients.jedis.Jedis;

/**
 * @author BenQ
 * @date 2017年11月30日
 *
 */
public class RedisJava {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("connection to server successfully");
		jedis.set("tutorialname", "redis tutorial");
		System.out.println("stored string in redis::" + jedis.get("tutorialname"));
	}

}
