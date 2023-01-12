package j17_스태틱;

import java.time.LocalDateTime;

// 풀이
public class Car2 {

	private static final int NOW_YEAR = LocalDateTime.now().getYear(); 
	// 현재 날짜 시간 중 년도만 가져 오겠다. (클래스의 활용)
	private static final String CODE = "KIA-" + NOW_YEAR + "-"; 
	private static int ai = 1;

	private String serialCode; // KIA-2023-0000
	private String modelName;

	public Car2(String modelName) {
		serialCode = CODE + String.format("%04d", ai);
		this.modelName = modelName;
		ai++;
	}

	@Override
	public String toString() {
		return "Car2 [serialCode=" + serialCode + ", modelName=" + modelName + "]";
	}
	
	
}
