package exam;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출 
		//Scanner in = new Scanner(System.in);
		Body body = new Body();
		Arm arm = new Arm();
		Finger finger = new Finger();
		Head head = new Head();
		Leg leg= new Leg();
		Tose tose = new Tose();
		/*
		//시각적인 출력 부분
		System.out.println("====움직이고 싶은 부위를 선택하세요!====");
		System.out.println("1.몸");
		System.out.println("2.팔");
		System.out.println("3.손가락");
		System.out.println("4.머리");
		System.out.println("5.다리");
		System.out.println("6.발가락");
		System.out.println("===============================");
		System.out.print("선택:");
	   
		
		
		// 입력을 받아 해당 번호에 해당하는 부위를 움직이게 하기 위해 switch사용
		
		int num=in.nextInt();
	    switch(num) {
	    case 1:
	    	System.out.println("===============================");
	    	System.out.println(body.getmove());
	    	break;
	    case 2:
	    	System.out.println("===============================");
	    	System.out.println(arm.getmove());
	    	break;
	    case 3:
	    	System.out.println("===============================");
	    	System.out.println(finger.getmove());
	    	break;
	    case 4:
	    	System.out.println("===============================");
	    	System.out.println(head.getmove());
	    	break;
	    case 5:
	    	System.out.println("===============================");
	    	System.out.println(leg.getmove());
	    	break;
	    case 6:
	    	System.out.println("===============================");
	    	System.out.println(tose.getmove());
	    	break;
	    	default:
	    		System.out.println("입력된 번호가 없습니다.");
		    	
	    }
		
	}
*/
System.out.println(body.getmove()+"<br>");
System.out.println(arm.getmove()+"<br>");
System.out.println(head.getmove()+"<br>");
System.out.println(leg.getmove()+"<br>");
System.out.println(tose.getmove()+"<br>");
	}
}

