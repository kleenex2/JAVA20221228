package Ch05;

import java.util.Scanner;

public class C01연산자 {

	public static void main(String[] args) {
		
		// 산술연산자( + - * / % )
//		int a = 10, b = 20, c;
//		System.out.println("a+b="+ (a + b));
//		System.out.println("a-b="+ (a - b));
//		System.out.println("a*b="+ (a * b));
//		System.out.println("b/a="+ (b / a));    // 나누기 - 몫
//		System.out.println("a%b="+ (a % b));    // 나누기 - 나머지(1.짝홀수구분,2.배수구분,3.자리수제한,4.끝자리구하기)
//		System.out.println("-a="+ -a);
		
		// 대입연산자
		// 공간=값(우선처리)
		
		// 문제
		// 두 정수를 입력받아 두 수의 합 / 곱 / 차를 출력하는 프로그램을 만듭니다.
		// Scanner 를 사용합니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수를 입력하세요? ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요? ");
//		int num2 = sc.nextInt();
//		System.out.println("두 수의 합은 " + (num1+num2));
//		System.out.println("두 수의 곱은 " + (num1*num2));
//		System.out.println("두 수의 차는 " + (num1-num2));
		
		// 복합대입연산자(선택)
//		int a = 10;
//		a += 10;    // a = a + 10;
//		a -= 5;    // a = a - 5;
//		a *= 3;    // a = a * 3;
//		System.out.println("a="+a);
		
		// 비교연산자(중요!) > >= < <= == != ? true / false
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : "+ ( a == b ));    // a=b 와 혼동하지 말 것
//		System.out.println("A > B : "+ ( a > b ));
//		System.out.println("A < B : "+ ( a < b ));
//		System.out.println("A >= B : "+ ( a >= b ));
//		System.out.println("A <= B : "+ ( a <= b ));
//		System.out.println("A != B : "+ ( a != b ));
		
		// 논리연산자(중요!)
		// And연산 && : 모든 조건식이 true이어야지만 true을 반환
		// Or연산 || : 조건식 중 하나라도 true이면 true를 반환
		// ! : true라면 false반환, false라면 true를 반환
		
//		System.out.println("true And true = " + (true && true));
//		System.out.println("false And true = " + (false && true));
//		System.out.println("true And false = " + (true && false));
//		System.out.println("false And false = " + (false && false));

//		System.out.println("true And true = " + ( (10>5) && (6>4) ) );
//		System.out.println("false And true = " + (false && true));
//		System.out.println("true And false = " + (true && false));
//		System.out.println("false And false = " + (false && false));
		
//		System.out.println("true || true = " + (true || true));
//		System.out.println("false || true = " + (false || true));
//		System.out.println("true || false = " + (true || false));
//		System.out.println("false || false = " + (false || false));
		
//		boolean flag = true;
//		System.out.println("flag : " + flag);
//		System.out.println("!flag : " + !flag);
		
		// 증감연산자
		// ++a(--a) : 전치연산자 : 먼저 값 1증가(1감소) 이후 다른 연산자 처리
		// a++(a--) : 후치연산자 : 다른 연산자 처리 먼저 한 후 1증가(1감소)
//		int a = 10, b = 10, c, d;
//		
//		c = --a;
//		d = a--;
//		System.out.printf("a=%d, b=%d, c=%d, d=%d", a, b, c, d);
		
		// 삼항연산자
		// (조건식?) 참인경우 실행코드 : 거짓인경우 실행코드;
		
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

}
