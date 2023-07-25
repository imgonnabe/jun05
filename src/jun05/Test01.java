package jun05;

//컴파일 <-> 스크립트
//소스코드.java > 컴파일 > .class
//클래스: 클래스 변수, 메소드, 생성자 집합
//메소드: 함수 function
//명령어:

//이름 만들기(apple, korea) = 영어대소문자, 숫자, _, $
//클래스: AppleKorea = 파스칼(카멜) 표기법
//메소드, 변수: appleKorea = 파스칼 표기법
//상수: APPLE_KOREA = 스네이크 표기법
public class Test01 {
	public static void main(String[] args) {

		// 우리반 인원수를 저장하고 싶다.
		// 어떤 데이터타입을 쓰면 좋은지
		// 변수명은 member
		// 자바에는 P/R
		byte member = 25;// (-128 ~ 127) 선언 + 초기화
		// 변수 활용
		member = 100;
		System.out.println(member);
		// int member = 1000;// 같은 이름으로 중복 선언 불가
		int num = 1000;// 데이터 스코프
		// 예약어
		num = member;// 대입 <-----
		num = num + 1;
		num++;
		num += 1;//num = num +1; num = ++num; num = num++;
		num -= 1;
		num %= 5;//모듈러: 나머지 값 0,1,2,3,4
		System.out.println(num);
		
		//캐스트, 프로모션
		num = member;//ctrl 변수명 클릭: 해당 변수명 선언한 곳 보여줌
		//int byte
		member = (byte) num;
		
		String str="10";
		byte value = Byte.parseByte(str);
		System.out.println(value);

	}

}
