package com.qr;

public class TestLogo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String text = "https://www.baidu.com";  
			QRCodeUtil.encode(text, "e:/001.jpg", "e:/image/", true);
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
