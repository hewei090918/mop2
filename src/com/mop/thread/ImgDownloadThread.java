package com.mop.thread;

import java.io.File;
import java.util.concurrent.LinkedBlockingDeque;

import com.mop.util.Spider;

/**
 * 
 * 包名：com.mop.thread <br/>
 * 类名：ImgDownloadThread.java <br/>
 * 版本：version 1.0 <br/>
 * 作者：HeWei <br/>
 * 描述：下载图片的线程，从队列中获得url，下载并保存到本地磁盘
 */
public class ImgDownloadThread implements Runnable {
	
	static final String savePath = "D:/imgDownload";
	
	LinkedBlockingDeque<String> imgUrlQueue;
	private Status status;
	
	public ImgDownloadThread(LinkedBlockingDeque<String> imgUrlQueue, Status status) {
		this.imgUrlQueue = imgUrlQueue;
		this.status = status;
	}
	
	@Override
	public void run() {
		File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
		while(true) {
			try {
				if(imgUrlQueue.isEmpty() && status.isStoped()) {
					break;
				}
				String imgUrl = imgUrlQueue.take();
				String fileName = imgUrl.split("/")[3];
				//下载本地图片
				String source = savePath + "/" + fileName;
				Spider.localImgDownload(imgUrl, source);
				//下载网络图片
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}
	
}
