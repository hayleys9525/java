package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		System.out.println("Start.....");
		if(grade.equals("VIP")) {
			
			System.out.println("실행.....");	
		    //return;
		}
		
		
		if(gender.equals("M")) {
			System.out.println("Male.....");
		}else {
			System.out.println("Female.....");
		}

		// 100 ~ 90 VIP
		// 89 ~ 80 GOLD
		// 79 ~ 70 SILVER
		// 69 ~ 60 BRONZE
		// 59 이하 NORMAL
		
		if(sum >= 90.0) {
			grade = "VIP";
		}else if(sum >= 80.0) {
			grade = "GOLD";
		}else if(sum >= 70.0) {
			grade = "SILVER";
		}else if(sum >= 60.0) {
			grade = "BRONZE";
		}else {
			grade = "NORMAL";
		}
		
		
		if(grade.equals("VIP")) {
			System.out.println("VIP혜택....");
			//return;
		}
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End.....");

	}

}
