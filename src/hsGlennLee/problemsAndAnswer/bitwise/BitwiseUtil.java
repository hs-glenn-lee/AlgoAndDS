package hsGlennLee.problemsAndAnswer.bitwise;

public class BitwiseUtil {
	static void printIntAsBinary(int b) {
		System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
	}
}
