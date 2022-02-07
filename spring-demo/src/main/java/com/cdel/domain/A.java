package com.cdel.domain;

/**
 * @author pengxt
 * @version 1.0
 * @date 2021/12/23 0:02
 */
public class A {

	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A{" +
				"b=" + b +
				'}';
	}
}
