package com.mop.test;

public class Test1 {

	public static void main(String[] args) {
		String url = "http://33.185.128.29:8080//25/DHKK4Q19/2017/11/28/23/310227_DHKK172201579902320171128231810011_10.jpg";
		String[] ss = url.split("/");
		System.out.println(ss[ss.length-1]);
	}

}
