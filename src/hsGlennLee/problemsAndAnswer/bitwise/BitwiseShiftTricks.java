package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseShiftTricks {
	public static void main(String[] args) {

		/*
		 * 1. n번째 비트 확인
		 * 대상 정수 k
		 * k & (1<<shift)
		 */
		int k = -9999999;
		printIntAsBinary(k); //1100010001100101001101 1 000000001
		boolean nthBitIs1; //n번째 bit는 이 값이 true 이면 1, false 이면 0
		nthBitIs1 = (k & (1<<7)) !=2;
		System.out.println(nthBitIs1);
		
		/*
		 * 2. n번째 비트 1로 채우기
		 * k | (1 << n)
		 */
		k=0;
		printIntAsBinary(k); // 0s
		int nthFilled;
		nthFilled = k | (1<<7);
		printIntAsBinary(nthFilled); // 00000000000000000000000010000000
		
		/*
		 * 3. n번쨰 비트 빼고 0으로 만들기  
		 * k & ~(1<<n)
		 * */
		k = -1;
		printIntAsBinary(k); // 1s
		int clearExceptNth;
		clearExceptNth = k & (1<<7);
		printIntAsBinary(clearExceptNth); // 00000000000000000000000010000000
		
	}

}
