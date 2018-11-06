package hsGlennLee.stack;

public interface Stack<E> {
	int size(); //스택의 크기를 반환한다.
	boolean isEmpty();
	void push(E e);
	E top(); // pop과 다르게 엘리먼트를 제거하지 않는다. 값만 반환한다. util.Stack.peek() 같은 메소드
	E pop();
}
