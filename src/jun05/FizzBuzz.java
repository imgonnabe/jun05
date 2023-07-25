package jun05;

//3의 배수: Fizz, 5의 배수: Buzz, 15의 배수: Fizz Buzz
//25까지
public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.print("Fizz Buzz, ");
				} else {
					System.out.print("Fizz, ");
				}
			} else if (i % 5 == 0) {
				if (i == 25) {
					System.out.println("Buzz");
				} else {
					System.out.print("Buzz, ");
				}
			} else {
				System.out.print(i + ", ");
			}
		}
	}

}
