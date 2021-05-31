package encapsulation;

public class Details {
	private String name;
	private int standard;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public int getStandard() {
		return standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newvalue) {
		age=newvalue;
	}
	public void setName(String newvalue) {
		name=newvalue;
	}
	public void setStandard(int newvalue) {
		standard=newvalue;
	}
	
}
