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
        ExecutorService executor = Executors.newFixedThreadPool(3);
        int count = 200;//一共下载200张图片
        executor.execute(new AddQueueThread(imgUrlQueue, count));
        
        ExecutorService imgExecutor = Executors.newFixedThreadPool(5);
        Status status = new Status();
        
        for (int i = 0; i < 5; i++) {
        	imgExecutor.execute(new ImgDownloadThread(imgUrlQueue,status));
        }
        
        executor.shutdown();
        while (!executor.isTerminated()) {
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
    		System.out.println("下载[" + count + "]张图片，共耗时：" + (float)(end - start) / 1000 + " s");
        }
	}

}
