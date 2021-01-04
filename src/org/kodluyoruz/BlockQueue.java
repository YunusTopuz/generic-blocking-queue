package org.kodluyoruz;

public class BlockQueue<T> {

	Dugum<T> first;
	Dugum<T> last;

	public void add(T value) {
		Dugum<T> node = new Dugum<T>(value);
		if (first == null) {
			first = node;
			last = node;
		}else {
			last.setNext(node);
			last = node;
		}
	}

	public T peek() {
		return first != null ? first.getValue() : null;
	}

	public T poll() {
		if (first != null) {
			Dugum<T> node = first;
			first = first.getNext();
			return node.getValue();
		}
		return null;
	}

}
