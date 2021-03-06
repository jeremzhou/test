/**
 * created on 2018年3月1日 下午4:02:41
 */
package RabbitMq.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author BenQ
 * @date 2018年3月1日
 *
 */
public class Test1 {
	public static void main(String[] args)throws IOException,TimeoutException {
		
		//创建连接工厂
		ConnectionFactory connFac = new ConnectionFactory();
		//默认连接的主机名，RabbitMQ-Server安装在本机，所以可以直接用127.0.0.1
		connFac.setHost("127.0.0.1");
		//创建连接
		Connection conn=connFac.newConnection();
		//创建信息管道
		Channel channel = conn.createChannel();
		//创建一个名为queue01的队列，防止队列不存在
		String queueName = "queue01";
		String queueName1 = "queue02";
		//进行信息声明 1.队列名 2.是否持久化，3.是否局限与链接，4. 不再使用是否删除, 5其他的属性
		channel.queueDeclare(queueName, false, false, false,null);
		channel.queueDeclare(queueName1, false, false, false, null);
		String msg = "Hello World!";
		//发送信息
		//在RabbitMQ中,消息是不能直接发送到队列，它需要发送到交换器exchange中。
		//第一参数空表示使用默认exchange，第二参数表示发送到queue，第三参数是发送的消息是（字节数组）
		channel.basicPublish("", queueName, null, msg.getBytes());
		channel.basicPublish("", queueName1, null, msg.getBytes());
		System.out.println("发送  message["+ msg +"] to "+ queueName + " success!");
		System.out.println("发送  message["+ msg +"] to "+ queueName1 + " success!");
		//关闭管道
		channel.close();
		//关闭连接
		conn.close();
	}
}
