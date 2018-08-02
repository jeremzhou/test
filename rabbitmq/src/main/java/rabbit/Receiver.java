/**
 * created on 2018年3月1日 下午2:49:42
 */
package rabbit;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

/**
 * @author BenQ
 * @date 2018年3月1日
 *
 */
public class Receiver {
	
	private final static String Queue_name = "MyQueue";
	
	public static void main(String[] args) {
		receive();
	}
	public static void receive() {
		ConnectionFactory factory = null; 
		Connection connection = null;
		Channel channel = null;
		
		try {
			factory = new ConnectionFactory();
			factory.setHost("localhost");
			connection =  factory.newConnection();
			channel = connection.createChannel();
			channel.queueDeclare(Queue_name, false, false ,false , null);
			Consumer consumer = new DefaultConsumer(channel) {
				@Override
				public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
						byte[] body)throws IOException {
					System.out.println("111111111");
					String message = new String(body, "UTF-8");
					System.out.println("收到消息....."+ message);
				}};
				channel.basicConsume(Queue_name, true, consumer);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}finally {
			try {
				//关闭资源
				channel.close();
				connection.close();
			}catch(IOException e) {
				e.printStackTrace();
			}catch(TimeoutException e) {
				e.printStackTrace();
			}
		}
	}

}
