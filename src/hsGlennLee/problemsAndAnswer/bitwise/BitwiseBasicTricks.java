package hsGlennLee.problemsAndAnswer.bitwise;
import static hsGlennLee.problemsAndAnswer.bitwise.BitwiseUtil.printIntAsBinary;

public class BitwiseBasicTricks {
	public static void main(String[] args) {
		/*
		 * XOR ����Ʈ��
		 * 
		 * 1. �뷫���� ���ϱ�/������ 2
		 * x�� �����̰�, ����Ʈ�� ���� ���밪�� �ðų� ���� ���� ��
		 * >>>1�� ������ 2 >>>2 �� ������ 4(2�� 2��)
		 * <<1�� ���ϱ� 2 <<2 �� ���ϱ� 4(2�� 2��) 
		 * ���� x�� �����̰ų�, ū ���̸� ���ϱ�/������ 2�� ����Ʈ�� ó���ϴ� ���� �� �� �����ϴ�.
		 */
		
		int a = 1;
		System.out.println(a<<1); // 2
		System.out.println(a<<2); // 4
		
		int b = 16;
		System.out.println(b>>>1); // 8
		System.out.println(b>>>2); // 4
		
		
		
		/*
		 * 2. cyclic shift ��ȯ ����Ʈ
		 * ���� ��ȯ ����Ʈ�� �������� ����Ʈ �ϰ� �з��� ���� �����ʿ� ä��
		 * ������ ��ȯ ����Ʈ�� ���������� ����Ʈ �ϰ� �з��� ���� ���ʿ� ä��
		 * */
		int n = -999999999;
		int cShiftedN = (n<<5)|(n>>>27);
		printIntAsBinary(n); 		// 11000 100011001010011011000000001
		printIntAsBinary(cShiftedN);// 100011001010011011000000001 11000
	}

}
