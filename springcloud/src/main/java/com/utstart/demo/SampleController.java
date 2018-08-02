/**
 * created on 2017年11月30日 上午10:27:44
 */
package com.utstart.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BenQ
 * @date 2017年11月30日
 *
 */
@RestController
@RequestMapping("/sample")
@RefreshScope
public class SampleController {
	
	@Value("${user.name}")
	String userName;
	
	@RequestMapping("/acm")
	public String simple() {
		return "Hello Spring cloud Acm !" + "hello" + userName + "!";
	}
}
