package j17_스태틱;

public class CarMain2 {
	
	public static void main(String[] args) {
		
		Car2[] car2s = new Car2[3];
		
		car2s[0] = new Car2("K3");
		car2s[1] = new Car2("K5");
		car2s[2] = new Car2("K7");
		
		for (Car2 car2 : car2s) {
			System.out.println(car2);
		}
		
	}

}
