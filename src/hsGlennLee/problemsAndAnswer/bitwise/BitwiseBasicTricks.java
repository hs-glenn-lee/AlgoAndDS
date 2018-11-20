package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseBasicTricks {
	public static void main(String[] args) {
		/*
		 * XOR 연산트릭
		 * 
		 * 1. 대략적인 곱하기/나누기 2
		 * x가 정수이고, 쉬프트로 인해 절대값이 늘거나 줄지 않을 때
		 * >>>1은 나누기 2 >>>2 는 나누기 4(2의 2승)
		 * <<1은 곱하기 2 <<2 는 곱하기 4(2의 2승) 
		 * 만약 x가 음수이거나, 큰 수이면 곱하기/나누기 2를 쉬프트로 처리하는 것은 좀 더 복잡하다.
		 */
		
		int a = 1;
		System.out.println(a<<1); // 2
		System.out.println(a<<2); // 4
		
		int b = 16;
		System.out.println(b>>>1); // 8
		System.out.println(b>>>2); // 4
		
		
		
		/*
		 * 2. cyclic shift 순환 시프트
		 * 왼쪽 순환 시프트는 왼쪽으로 시프트 하고 밀려난 값을 오른쪽에 채움
		 * 오른쪽 순환 시프트는 오른쪽으로 시프트 하고 밀려난 갑을 왼쪽에 채움
		 * */
		int n = -999999999;
		int cShiftedN = (n<<5)|(n>>>27);
		printIntAsBinary(n); 		// 11000 100011001010011011000000001
		printIntAsBinary(cShiftedN);// 100011001010011011000000001 11000
	}

}
