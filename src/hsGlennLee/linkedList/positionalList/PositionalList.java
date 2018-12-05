package hsGlennLee.linkedList.positionalList;

/** An interface for positional lists.
 *  Double Linked List에 Position이란 포인터 역할을 하는 인터페이스를 이용하는 자료구조.
 *  단 입력과 리턴을 Position으로 함으로써 개선되는 점 .
 *  
 *  */
public interface PositionalList<E> {

	/** Returns the number of elements in the list. */
	int size();

	/** Tests whether the list is empty. */
	boolean isEmpty();

	/** Returns the first Position in the list (or null, if empty). */
	Position<E> first();

	/** Returns the last Position in the list (or null, if empty). */
	Position<E> last();

	/**
	 * Returns the Position immediately before Position p (or null, if p is
	 * first).
	 */
	Position<E> before(Position<E> p) throws IllegalArgumentException;

	/**
	 * Returns the Position immediately after Position p (or null, if p is
	 * last).
	 */
	Position<E> after(Position<E> p) throws IllegalArgumentException;

	/**
	 * Inserts element e at the front of the list and returns its new Position.
	 */
	Position<E> addFirst(E e);

	/**
	 * Inserts element e at the back of the list and returns its new Position.
	 */
	Position<E> addLast(E e);

	/**
	 * Inserts element e immediately before Position p and returns its new
	 * Position.
	 */
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;

	/**
	 * Inserts element e immediately after Position p and returns its new
	 * Position.
	 */
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;

	/**
	 * Replaces the element stored at Position p and returns the replaced
	 * element.
	 */
	E set(Position<E> p, E e) throws IllegalArgumentException;

	/**
	 * Removes the element stored at Position p and returns it (invalidating p).
	 */
	E remove(Position<E> p) throws IllegalArgumentException;
}