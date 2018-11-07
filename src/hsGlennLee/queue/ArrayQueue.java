package hsGlennLee.queue;

public class ArrayQueue<E> implements Queue<E> {

	private E[] data;
	private int f = 0;
	private int sz = 0;
	private static int DEFAULT_CAPACITY = 100;
	

	public ArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayQueue(int capacity) { 
		data = (E[]) new Object[capacity]; 
	}

	// methods
	public int size() {
		return sz;
	}

	public boolean isEmpty() {
		return (sz == 0);
	}

	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length)
			throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length; // use modular arithmetic
		data[avail] = e;
		sz++;
	}

	public E first() {
		if (isEmpty())
			return null;
		return data[f];
	}

	public E dequeue() {
		if (isEmpty())
			return null;
		E answer = data[f];
		data[f] = null; // dereference to help garbage collection
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
}
