package ifcontrol;

public class P89 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "";
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

		// 남자 이고 90점 이상이면 MVIP
		// 여자 이고 90점 이상이면 FVIP
		// 남자 이고 80점 이상이면 MGOLD
		// 여자 이고 80점 이상이면 FGOLD
		// 남자 이고 80점 미만이면 MNORMAL
		// 여자 이고 80점 미만이면 FNORMAL
	   /* if(gender.equals("M")) {
	    	if(sum >= 90) {
	    		grade = "MVIP";
	    	}else if(sum >= 80) {
	    	    grade = "MGOLD";
		    	}else {
		    		grade = "MNORMAL";
	    	}
	    }
	    	if(gender.equals("F")) {
		    	if(sum >= 90) {
		    		grade = "FVIP";
		    	}else if(sum >= 80) {
		    	    grade = "FGOLD";
			    	}else {
			    		grade = "FNORMAL";
	    }
	    	}
	    */	

          grade=(gender.equals("M"))? 
	     ((sum>=90)? "MVIP":(sum>=80)?"MGOLD":"MNORMAL"):((sum>=90)? "FVIP":(sum>=80)?"FGOLD":"FNORMAL");

	    	switch(grade) {
	    	case "FVIP":
	    	case "MVIP":
	    		sum += 100;
	    	case "FGOLD":
	    	case "MGOLD":
	    		sum += 90;
	    	default:
	    		sum += 10;
	    	}
	    	
		if(grade.equals("VIP")) {
			System.out.println("VIP혜택....");
			//return;
		}
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End.....");

	}

}
