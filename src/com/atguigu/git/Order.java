package com.atguigu.git;

public class Order {
	public static void main(String[] args) {

		Object object = A.getAInfo();
		Object object1 = A.getAInfo();
		Object object2 = A.getAInfo();
		A.aInfo();
		System.err.println(object == object1);
		System.err.println(object.equals(object1));
	}
}

class A {
	// 私有化构造器

	// 创建类对象,同时设置privat 通过公共来调用 体现封装性
	private static A a = new A();

	public static A getAInfo() {
		return a;
	}

	public static void aInfo() {
		System.err.println("只有一只");
	}
}

//懒汉式单列模式
class B {
	private B() {
	}

	private static B b = null;

	private static B getInfo() {
		if (b == null) {
			b = new B();
		}
		return b;
	}
}