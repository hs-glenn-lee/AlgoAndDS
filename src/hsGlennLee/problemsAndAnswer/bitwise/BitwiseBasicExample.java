package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseBasicExample {
	public static void main(String[] args) {
		
		/*
		 * ��Ʈ������
		 * ��Ʈ������ ����� int��.
		 * 
		 * ~ ����
		 * << ���� ����Ʈ, �� ������ 0���� ä���.
		 * >> ������ ����Ʈ, ������� 1�� ä���.
		 * >>> Unsigned right shift, ������ ����Ʈ ������ 0���� ä���.
		 * & AND ����
		 * ^ XOR ���� : ������ ����0, �ٸ��� ��1
		 * | OR ����
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
