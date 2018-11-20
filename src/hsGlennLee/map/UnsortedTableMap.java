package hsGlennLee.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnsortedTableMap<K, V> extends AbstractMap<K, V>{
	
	/* 
	 * 엔트리를 저장소. Unsorted <-> Sorted : Sorted는 key 값에 따라 순서를 정렬한다.
	 * 예를 들어 TreeMap이나 SortedTableMap
	 */
	private ArrayList<MapEntry<K,V>> table = new ArrayList<>();
	
	public UnsortedTableMap() {}
	
	// private utility
	// 키와 일치하는 엔트리가 있는 인덱스를 테이블에서 찾는다.
	private int findIndex(K key) {
		int n = table.size();
		for(int j=0; j < n; j++) {
			if(table.get(j).getKey().equals(key))
				return j;
		}
		return -1;
	}
	
	@Override
	public int size() {
		return table.size();
	}

	@Override
	public V get(K key) {
		int j = findIndex(key);
		if(j == -1)
			return null;
		return table.get(j).getValue();
	}

	@Override
	public V put(K key, V value) {
		int j = findIndex(key);
		if(j == -1) {
			table.add(new MapEntry<>(key, value));
			return null;
		} else
			return table.get(j).setValue(value);
	}

	@Override
	public V remove(K key) {
		int j = findIndex(key);
		int n = size();
		if(j == -1)
			return null;
		V answer = table.get(j).getValue();
		if(j != n-1)
			table.set(j,  table.get(n-1)); // 마지막 엔트리를 제거되어 생긴 구멍에 채워 넣는다.
		table.remove(n-1);
		return answer;
	}
	
	private class EntryIterator implements Iterator<Entry<K,V>> {
		private int j = 0;
		public boolean hasNext() {
			return j < table.size();
		}
		public Entry<K,V> next() {
			if(j == table.size())
				throw new NoSuchElementException();
			return table.get(j++);
		}
		public void remove() { throw new UnsupportedOperationException(); }
	}
	
	private class EntryIterable implements Iterable<Entry<K,V>> {
		@Override
		public Iterator<Entry<K, V>> iterator() {
			return new EntryIterator();
		}
	}

	@Override
	public Iterable<Entry<K, V>> entrySet() {
		return new EntryIterable();
	}
	
}
