package hsGlennLee.stack;

public interface Stack<E> {
	int size(); //������ ũ�⸦ ��ȯ�Ѵ�.
	boolean isEmpty();
	void push(E e);
	E top(); // pop�� �ٸ��� ������Ʈ�� �������� �ʴ´�. ���� ��ȯ�Ѵ�. util.Stack.peek() ���� �޼ҵ�
	E pop();
}
