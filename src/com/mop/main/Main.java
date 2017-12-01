package com.mop.main;

import com.mop.thread.ImgDownloadThread;

public class Main {

	public static void main(String[] args) {
		ImgDownloadThread r = new ImgDownloadThread();
		Thread t1 = new Thread(r);
		t1.start();
		
	}

}
