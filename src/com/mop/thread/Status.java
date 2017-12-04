package com.mop.thread;

/**
 * 
 * 包名：com.mop.util <br/>
 * 类名：Status.java <br/>
 * 版本：version 1.0 <br/>
 * 作者：HeWei <br/>
 * 描述：状态控制类
 */
public class Status {
	private volatile boolean stop;

    public void doStop() {
        stop = true;
    }

    public boolean isStoped() {
        return stop;
    }
}
