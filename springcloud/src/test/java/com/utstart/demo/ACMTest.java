/**
 * created on 2017年11月30日 上午9:50:29
 */
package com.utstart.demo;

import java.util.Properties;

import com.alibaba.edas.acm.ConfigService;
import com.alibaba.edas.acm.listener.ConfigChangeListener;

/**
 * @author BenQ
 * @date 2017年11月30日
 *
 */
public class ACMTest {
	
	//属性/开关
	private static String config= "DefaultValue";
	
	private static Properties acmProperties =new Properties();

	public static void main(String[] args) {
		try {
			//本地调试模式，本机测试无法连接ACM服务集群，因此设置debug模式（取值为null，不会进入回调函数）
			ConfigService.setDebug(true);
			//初始化配置服务，控制台通过示例代码自动获取下面参数
			ConfigService.init("${endpoint}", "${namespace}", "${accessKey}","${secretKey}");
			//主动获取配置
			String content=ConfigService.getConfig("${dataId}", "${group}", 6000);
			System.out.println(content);
			//初始化的时候，给配置添加监听，配置变更会回调通知
			ConfigService.addListener("${dataId}", "${group}", new ConfigChangeListener() {
				
				@Override
				public void receiveConfigInfo(String configInfo) {
					//当配置更新后，通过该回调函数返回给最新用户
					//注意回调函数中不要做阻塞操作，不然柱塞操作会通知线程
					config = configInfo;
					System.out.println(configInfo);
				}
			});
			 /**
             * 如果配置值的內容为properties格式（key=value），可使用下面监听器。以便一个配置管理多个配置项
             */
            /**
            ConfigService.addListener("${dataId}", "${group}", new PropertiesListener() {
                @Override
                public void innerReceive(Properties properties) {
                    // TODO Auto-generated method stub
                    acmProperties = properties;
                    System.out.println(properties);
                }
            });
            **/
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//测试让主线程不退出，因为订阅配置线程是守线程，主线程退出守护线程就会退出，正式代码中无需下面代码
		while(true) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}
	}
	
	//通过get借口把配置值暴露出去使用
	public static String getConfig() {
		return config;
	}
	
	//通过get借口把配置值暴露出去使用
	public static Object getPorpertiesValue(String key) {
		 if (acmProperties != null) {
             return acmProperties.get(key);
         }
         return null;
	}
	
}
