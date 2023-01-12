package j17_스태틱;

public class Teacher {
	
	private String name;
	
	// 올 아규먼트 생성자
	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}

}
