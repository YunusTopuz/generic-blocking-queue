package org.kodluyoruz;

public class Dugum<T> {
	
	private T value;
	private Dugum<T> next;
	
	public Dugum(T value) {
		super();
		this.value = value;
	}
	public Dugum(T value, Dugum<T> next) {
		super();
		this.value = value;
		this.next = next;
	}
	public T getValue() {
		return this.value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Dugum<T> getNext() {
		return this.next;
	}
	public void setNext(Dugum<T> next) {
		this.next = next;
	}
	
	
	

}
