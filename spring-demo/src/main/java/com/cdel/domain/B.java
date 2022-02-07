package com.cdel.domain;

/**
 * @author pengxt
 * @version 1.0
 * @date 2021/12/23 0:03
 */
public class B {

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B{" +
				"a=" + a +
				'}';
	}
}
