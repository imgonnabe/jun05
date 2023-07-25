package jun05;

//연산자: 계산에 사용되는 기호
/*
 * 1. 최우선: . [] ()
 * 2. 단항: !(반전) ~(비트반전) +/- ++/--(선행증감)
 * 3. 산술: + - / * %
 * 4. 쉬프트: << >> <<< >>>
 * 5. 관계: > < >= <= == !=
 * 6. 비트: &(and) |(or) ^(xor)
 * 7. 논리: &&(and) ||(or)
 * 8. 삼항: 조건식 ? 참일때 : 거짓일때;
 * 9. 대입: = += -= /= %= 등등...
 * 10. 후행증감: ++/--
 */
public class Operator {
	public static void main(String[] args) {
		// number에 1이라고 저장
		int number = 1;
		// int num2 += --number;
		// int num2 = num2 + --number;//선언만 하고 초기화를 안시켜서
		int num2 = --number + 10;// 10
		//             0
		int num3 = ++number + --num2;// 10
		//            1          9
		System.out.println(++number);// 2
		System.out.println(number++);// 2
		System.out.println(number);// 3
		System.out.println(num2);//9
		System.out.println(num3);//10

		number = num2 = num3 = 0;
		number = num2-- + num3++;
		//         0>-1     0>1
		System.out.println(number);// 0
		System.out.println(num2);// -1
		System.out.println(num3);// 1
		System.out.println(number += 2);
		System.out.println("증감식");
		
		boolean check = true;
		check = 1 + 2 != 4;
		System.out.println(check);
		
		check = number == num2;
		System.out.println(check);
		
		number = 40;// 101000
		number = number >> 2;// 1010
		System.out.println(number);

		// 2, 8, 16진법 입력하기
		// 10: 0 1  2  3  4   5  6 7 8 9 10 11 12 15 16 17     32
		// 2:  0 1 10 11 100 101
		// 8:  0 1  2  3  4   5  6 7 10 11 12
		// 16: 0                          A  B  C    10 11     20
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toOctalString(16));
		System.out.println(Integer.toHexString(10));
		//                  클래스  메소드

		// 입력
		num2 = 10;// 10진법
		System.out.println(num2);
		num2 = 0B10;// 2진법(0B바이너리 입력)
		System.out.println(num2);
		num2 = 020;// 8진법(0을 입력한 후 8진법 입력)
		System.out.println(num2);
		num2 = 0x20;// 16진법(ox)
		System.out.println(num2);
		
		//비트반전
		System.out.println(Integer.toBinaryString(1));  //00000000000000000000000000000001
		System.out.println(Integer.toBinaryString(-1)); //11111111111111111111111111111111
		System.out.println(Integer.toBinaryString(~1)); //11111111111111111111111111111110
		System.out.println(Integer.toBinaryString(~-1));//00000000000000000000000000000000
		System.out.println(Integer.toBinaryString(2)); //00000000000000000000000000000 010
		System.out.println(Integer.toBinaryString(~2));//11111111111111111111111111111(101) = -3
		System.out.println(Integer.toBinaryString(-5));//11111111111111111111111111111011
		System.out.println(Integer.toBinaryString(~-5));//0000000000000000000000000000100 = 4
		
		//비트 연산자
		number = num2 = num3 = 0;
		number =2;//010
		num2 = 7; //111
		num3 = number & num2;//둘다 1일 때 1
		System.out.println(num3);
		
		num3 = number | num2;//하나라도 1이 있으면 1
		System.out.println(num3);
		
		num3 = number ^ num2;//서로 값이 다를 때 1, 같으면 0
		System.out.println(num3);
		
		//논리 연산자
		//왼쪽 && 오른쪽 = 둘 다 참일 때 참
		System.out.println(1 + 2 == 4 && 1 + 3 == 4);
		System.out.println(false && true);
		System.out.println(!true && false);
		System.out.println(!false && true);
		
		//|| 둘 중 하나면 참이면 참
		System.out.println(true || false);
		System.out.println(false || !false);
		System.out.println(false || false);
		System.out.println(true || true);
		
		/*if(조건식) {
			참일때 실행할 명령어;
		} else {
			조건이 거짓일때 실행할 명령어;
		}
		
		조건식? 참일때 : 거짓;
		*/
		
		number=1;
		System.out.println(number ==1 ? "1입니다": "2입니다");
		
		if(number == 1) {
			System.out.println("1입니다");
		} else {
			System.out.println("2입니다");
		}
		
		check = false;
		number = 1;
		check = number > 1 || number == 1 ? true : false;
		System.out.println(check);
		
	}

}
