package hsGlennLee.map;

import java.util.Iterator;

public abstract class AbstractMap<K, V> implements Map<K, V>{
	public boolean isEmpty() {
		return size() == 0;
	}
	protected static class MapEntry<K, V> implements Entry<K, V> {
		private K k;
		private V v;
		public MapEntry(K key, V value) {
			setKey(key);
			setValue(value);
		}
		public K getKey() {
			return k;
		}
		public void setKey(K key) {
			this.k = key;
		}
		public V getValue() {
			return v;
		}
		public V setValue(V value) {
			V old = v;
			v = value;
			return old;
		}
	}
	
	//Support for public keySet method...
	private class KeyIterator implements Iterator<K> {
		private Iterator<Entry<K,V>> entries = entrySet().iterator();
		public boolean hasNext() {
			return entries.hasNext();
		}
		public K next() {
			return entries.next().getKey();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	private class KeyIterable implements Iterable<K> {
		public Iterator<K> iterator() {
			return new KeyIterator();
		}
	}
	
	public Iterable<K> keySet() {
		return new KeyIterable();
	}
	
	//Support for public valueSet method...
	private class ValueIterator implements Iterator<V> {
		private Iterator<Entry<K,V>> entries = entrySet().iterator();
		@Override
		public boolean hasNext() {
			return entries.hasNext();
		}
		@Override
		public V next() {
			return entries.next().getValue();
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	private class ValueIterable implements Iterable<V> {
		public Iterator<V> iterator() {
			return new ValueIterator();
		}
	}
	public Iterable<V> values() {
		return new ValueIterable();
	}
}
