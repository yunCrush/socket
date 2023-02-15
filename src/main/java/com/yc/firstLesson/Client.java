package com.yc.firstLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Author: yunCrush
 * Date: 2023/2/15 16:00
 * Description:
 */
public class Client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1",1234);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	}
}
