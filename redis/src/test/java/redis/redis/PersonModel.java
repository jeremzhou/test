/**
 * created on 2018年3月2日 下午5:25:14
 */
package redis.redis;

/**
 * @author BenQ
 * @date 2018年3月2日
 *
 */
public class PersonModel {
	
	private String name;
	private long age;
	private String sex;
	
	public PersonModel() {}
	public PersonModel(String name, long age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}