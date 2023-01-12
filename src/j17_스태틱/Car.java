package j17_스태틱;

// 내가한거
public class Car {

	private static String Code = "KIA-2023-"; // KIA-2023-0000
	private static int ai = 1;

	private String serialCode;
	private String modelName;

	public Car(String modelName) {

		String zero = null;
		
		if (ai < 0 || ai > 9999) {
			zero = "";
		}

		if (ai > 0 && ai < 10) {
			zero = "000";
		} else if (ai > 9) {
			zero = "00";
		} else if (ai > 99) {
			zero = "0";
		} else {
			zero = "";
		}
		
		serialCode = Code + zero + ai;
		ai++;

		this.modelName = modelName;
	}

	@Override
	public String toString() {

		return "Car [serialCode=" + serialCode + ", modelName=" + modelName + "]";
	}

}
