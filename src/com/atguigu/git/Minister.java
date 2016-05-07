package com.atguigu.git;

public class Minister{
	public static void main(String[] args) {
		Emperor emperor=Emperor.getInstance();
		emperor.emperor();
		Emperor emperor2=Emperor.getInstance();
		emperor2.emperor();
		Emperor emperor3=Emperor.getInstance();
		emperor3.emperor();
		
		System.err.println(emperor.equals(emperor2));
	}
}
class Emperor {
	// 私有化构造器
	private Emperor() {	}
	// 2创建类的对象，同时设置private 通过公共的来调用，体现封装性
	// 4要求此对象页stati
	private static Emperor instance=new Emperor();
	// 公共方法必须为static

	public	static Emperor getInstance(){
		if (instance==null) {
			instance=new Emperor();
		}
		return instance;
	}
	public static void emperor(){
		System.err.println("我是皇帝");
	}
}