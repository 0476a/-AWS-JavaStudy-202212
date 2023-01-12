package j17_스태틱;

// 내가한거
public class CarMain {
	
	public static void main(String[] args) {
		
		Car[] cars= new Car[11];
		
		cars[0] = new Car("K3");
		cars[1] = new Car("K3 GT");
		cars[2] = new Car("K5");
		cars[3] = new Car("K8");
		cars[4] = new Car("K9");
		cars[5] = new Car("모닝");
		cars[6] = new Car("레이");
		cars[7] = new Car("카니발");
		cars[8] = new Car("스팅어");
		cars[9] = new Car("쏘렌토");
		cars[10] = new Car("스포티지");
		
		for(Car car : cars) {
			System.out.println(car);
			System.out.println();
		}
		
		
	}

}
