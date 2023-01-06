package j11_접근지정자.default1;

public class J11_StudentDefault { // public이 없다면 import 즉 다른 페키지에서 자료형으로 사용 X

	 private String name;
	 private int age;
	 
	 public J11_StudentDefault() {
		 
	 }
	 
	 public J11_StudentDefault(String name, int age) {
		this.name = name;
		this.age = age;
	 }
	 
	 public void printInfo() {
		 System.out.println("이름: " + name);
		 System.out.println("나이: " + age);
	 }
	 
	 //Getter
	 public String getName() {
		 return name;
	 }
	
	 //Setter
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 
	 
	 // ${name} // getter 호출
	 
	 
}
