package choo.sec04;

public class CharArt {

	public static void main(String[] args) {
		String number="9506241230123";
		char sex=number.charAt(6);
		switch (sex) {
		case '1':
		case '3':
		System.out.println("남자입니다.");
		break;
		case '2':
		case '4':
		System.out.println("여자입니다.");
		break;
		
		}
		
	}

}
