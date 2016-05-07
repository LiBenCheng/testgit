package com.atguigu.git;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadMain {
	public static void main(String[] args) {
		FutureTask futureTask = new FutureTask(new TestThread2());

		Thread thread = new Thread(futureTask);
		thread.start();
		TestThread testThread = new TestThread();
		new Thread(testThread).start();

	}
}

class TestThread implements Runnable {

	@Override
	public void run() {
		System.err.println("hello thread by Runnable...");

	}

}

class TestThread2 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		System.err.println("hello thread...");
		return 200;
	}

}