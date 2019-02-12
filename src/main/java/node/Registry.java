package node;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Registry {// 1.register msg node 2.deregister msg node 3.create overlay 4.attribute weight to link
    public static final int PORT = 12345;  //port number, should get from randomly

    public static void main(String[] args){
        System.out.println("Registry start working!\n");
        Registry registry = new Registry();
        registry.init();
    }

    public void init(){
        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
            while (true){
                //从请求队列中取出一个连接
                Socket client = serverSocket.accept();
                // 处理这次连接   
                new HandlerThread(client);
            }
        }
        catch (Exception e){
            System.out.println("Server error: " + e.getMessage());
        }
    }

    private class HandlerThread implements Runnable {
        private Socket socket;
        public HandlerThread(Socket client) {
            socket = client;
            new Thread(this).start();
        }

        public void run() {
            try {
                // 读取客户端数据
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientInputStr = input.readLine();//这里要注意和客户端输出流的写方法对应,否则会抛 EOFException
                // 处理客户端数据
                System.out.println("客户端发过来的内容:" + clientInputStr);

                // 向客户端回复信息
                PrintStream out = new PrintStream(socket.getOutputStream());
                System.out.print("请输入:\t");
                // 发送键盘输入的一行
                String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
                out.println(s);

                out.close();
                input.close();
            } catch (Exception e) {
                System.out.println("服务器 run 异常: " + e.getMessage());
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        socket = null;
                        System.out.println("服务端 finally 异常:" + e.getMessage());
                    }
                }
            }
        }
    }
}
