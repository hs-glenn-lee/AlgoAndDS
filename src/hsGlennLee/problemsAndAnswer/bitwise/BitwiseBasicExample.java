package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseBasicExample {
	public static void main(String[] args) {
		
		/*
		 * 비트연산자
		 * 비트연산의 결과는 int다.
		 * 
		 * ~ 보수
		 * << 왼쪽 쉬프트, 빈 공간은 0으로 채운다.
		 * >> 오른쪽 쉬프트, 빈공간은 1로 채운다.
		 * >>> Unsigned right shift, 오른쪽 쉬프트 이지만 0으로 채운다.
		 * & AND 연산
		 * ^ XOR 연산 : 같으면 거짓0, 다르면 참1
		 * | OR 연산
		 * 
		 * */
		int a = 15;
		printIntAsBinary(a); 	// 00000000000000000000000000001111
		printIntAsBinary(~a); 	// 11111111111111111111111111110000
		printIntAsBinary(a<<2); // 00000000000000000000000000111100
		printIntAsBinary(a>>2);
		
		int b = 4095;
		printIntAsBinary(b); 	// 00000000000000000000111111111111
		printIntAsBinary(a&b);  // 00000000000000000000000000001111
		printIntAsBinary(a^b);  // 00000000000000000000111111110000
		printIntAsBinary(a|b);  // 00000000000000000000111111111111
	}
	
	
}
