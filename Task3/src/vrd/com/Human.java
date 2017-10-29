package vrd.com;

public class Human {

	private String name;
	private String fio;
	private int age;
	private String sex;

	

	public Human(String name, String fio, int age, String sex) {
		super();
		this.name = name;
		this.fio = fio;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", fio=" + fio + ", age=" + age + ", sex=" + sex + "]";
	}

	
	
}
