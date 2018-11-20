package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseXorTricks {
	public static void main(String[] args) {
		/*
		 * XOR ����Ʈ��
		 * 
		 * 1. ��Ʈ ����
		 * 0s�� ��� ��Ʈ�� 0�� ��, 1s�� ��� ��Ʈ�� 1�� ��
		 * x ^ 0s = x
		 * x ^ 1s = ~x
		 * 
		 * */
		int a = 15;
		printIntAsBinary(a);	// 00000000000000000000000000001111
		printIntAsBinary(-1);	// 11111111111111111111111111111111
		
		printIntAsBinary(0);	// 00000000000000000000000000000000
		printIntAsBinary(a^0);	// 00000000000000000000000000001111
		printIntAsBinary(a^-1); // 11111111111111111111111111110000
		

	}
	
	
}
