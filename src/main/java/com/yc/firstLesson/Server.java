package com.yc.firstLesson;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author: yunCrush
 * Date: 2023/2/15 15:51
 * Description:
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(1234);
		// 阻塞
		Socket socket = serverSocket.accept();
		OutputStream out = socket.getOutputStream();
		System.out.println(out.toString());
		// 只可接收一次
		out.close();

	}
}
