package com.mop.thread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mop.jdbc.JdbcBaseDao;

public class ImgDownloadThread implements Runnable {
	
	@Override
	public void run() {
		Connection conn = (Connection) JdbcBaseDao.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = (Statement) conn.createStatement();
//			String sql = "select * from T_WAIT_MATCH";
			String sql = "select * from source";
			rs = stmt.executeQuery(sql);
			//图片下载到本地
			String savePath = "D:/imgDownload";
	        File saveDir = new File(savePath);
	        if(!saveDir.exists()){
	            saveDir.mkdirs();
	        }
	        int count = 0;
	        long startMili=System.currentTimeMillis();
			while(rs.next()) {
				count++;
				if(count < 50) {
					//下载本地图片
					String imgURL = rs.getString(2);
					System.out.println(imgURL);
					File file = new File(imgURL);
					String fileName = file.getName();
					String source = savePath + "/" + fileName;
					downloadLocalImg(imgURL, source);
					//下载网络图片
//					String imgURL = rs.getString(9);
//					String source = savePath + "/" + System.currentTimeMillis() + ".jpg";
//					downloadHttpImg(imgURL, source);
				}else {
					break;
				}
				
			}
			long endMili=System.currentTimeMillis();
			System.out.println("一共下载[" + count + "]张图片，"+"共耗时：" + (float)(endMili-startMili)/1000 + " 秒");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * 描述：	下载网络图片同步方法 <br/>
	 * 作者：	HeWei
	 * @param imgURL：以http:开头的图片地址
	 * @param source: 保存到本地的图片路径
	 * void 
	 * <br/>
	 */
	public synchronized void downloadHttpImg(String httpImgURL, String source){
        try {
			URL url = new URL(httpImgURL);
			if(url != null) {
				URLConnection conn = url.openConnection();
				InputStream input = conn.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(input);
				OutputStream output = new FileOutputStream(new File(source));
				BufferedOutputStream bos = new BufferedOutputStream(output);
				byte[] bt = new byte[1024];
				int len = 0;
				while((len = bis.read(bt)) != -1) {
					bos.write(bt, 0, len);
				}
				bos.close();
				output.close();
				bis.close();
				input.close();
			}
			
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	/**
	 * 
	 * 描述：	下载本地图片同步方法（类似于文件拷贝功能） <br/>
	 * 作者：	HeWei
	 * @param localImgURL：本地图片地址
	 * @param source : 保存到本地的图片路径
	 * void 
	 * <br/>
	 */
	public synchronized void downloadLocalImg(String localImgURL, String source) {
		File file = new File(localImgURL);
		
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(new File(source));
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[] bt = new byte[1024];
			int len = 0;
			while((len = bis.read(bt)) != -1) {
				bos.write(bt, 0, len);
			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
