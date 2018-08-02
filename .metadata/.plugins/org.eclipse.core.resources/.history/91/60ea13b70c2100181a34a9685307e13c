/**
 * created on 2018年3月6日 下午2:58:52
 */
package RabbitMq.rabbitmq;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author BenQ
 * @date 2018年3月6日
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("请输入数字:");
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split("");
		int [] num = new int [str.length];
		for(int i=0;i<str.length;i++) {
			num[i] = Integer.parseInt(String.valueOf(str[i]));
		}
		Arrays.sort(num);
		System.out.println("从小到大输出:");
		for(int j=0; j<num.length;j++) {
			System.out.println(num[j]);
		}
		System.out.println("从大到小输出:");
		for(int m = num.length-1;m>=0;m--) {
			System.out.println(num[m]);
		}
	}
}
