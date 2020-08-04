package com.mop.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

import com.mop.thread.AddQueueThread;
import com.mop.thread.ImgDownloadThread;
import com.mop.thread.Status;

/**
 * 
 * 包名：com.mop.main <br/>
 * 类名：Main.java <br/>
 * 版本：version 1.0 <br/>
 * 作者：HeWei <br/>
 * 描述：主线程，控制两个线程池，待任务处理完成后关闭线程池
 */
public class Main {

	public static void main(String[] args) {
		LinkedBlockingDeque<String> imgUrlQueue = new LinkedBlockingDeque<String>(300);
		
		long start = System.currentTimeMillis();
		//newFixedThreadPool创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        ExecutorService addExecutor = Executors.newFixedThreadPool(3);//线程池大小为3
        
        int total = 200;//一共下载N张图片
        
        for(int index = 0; index < total; index++) {
        	addExecutor.execute(new AddQueueThread(imgUrlQueue, index));//将第index张图片地址放入队列
        }
        
        ExecutorService imgExecutor = Executors.newFixedThreadPool(5);//线程池大小为5
        Status status = new Status();
        
        for (int i = 0; i < 5; i++) {
        	imgExecutor.execute(new ImgDownloadThread(imgUrlQueue,status));
        }
        
        addExecutor.shutdown();
        while (!addExecutor.isTerminated()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        status.doStop();
        imgExecutor.shutdown();
        
        if(imgExecutor.isShutdown()) {
        	long end = System.currentTimeMillis();
    		System.out.println("一共下载[" + total + "]张图片，一共耗时：" + (float)(end - start) / 1000 + " s");
        }
	}

}
