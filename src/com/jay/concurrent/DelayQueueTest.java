package com.jay.concurrent;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {

	public static void main(String[] args) {
		DelayQueue<DelayElement> delayElements = new DelayQueue<DelayElement>();
		
		delayElements.add(new DelayElement());
		delayElements.add(new DelayElement());
		
		delayElements.add(new DelayElement());
		delayElements.add(new DelayElement());
		
		
		try {
			System.out.println(""+ delayElements.take().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class DelayElement implements Delayed {

	@Override
	public int compareTo(Delayed arg0) {
		return 0;
	}

	@Override
	public long getDelay(TimeUnit time) {
		return time.toSeconds(2);
	}
	
}