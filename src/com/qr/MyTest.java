package com.qr;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 try {
			String content = "https://www.baidu.com";
			 String path = "E:/";
			 
			 MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			 Map hints = new HashMap();
			 hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			 BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400,hints);
			 File file1 = new File(path,"01.jpg");
			 MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}  

}
