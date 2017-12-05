package com.mop.thread;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import com.mop.util.Spider;

/**
 * 
 * 包名：com.mop.thread <br/>
 * 类名：AddQueueThread.java <br/>
 * 版本：version 1.0 <br/>
 * 作者：HeWei <br/>
 * 描述：分析图片url，存放到队列中，以供另外一个线程使用
 */
public class AddQueueThread implements Runnable {

	LinkedBlockingDeque<String> imgUrlQueue;
	int index;
	
	public AddQueueThread(LinkedBlockingDeque<String> imgUrlQueue, int index) {
		this.imgUrlQueue = imgUrlQueue;
		this.index = index;
	}
	
	@Override
	public void run() {
		List<String> uList = Spider.packContent(index);
		for(String url: uList) {
			imgUrlQueue.push(url);
		}
	}

}
