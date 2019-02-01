package node;

import java.net.ServerSocket;

public class Registry {// 1.register msg node 2.deregister msg node 3.create overlay 4.attribute weight to link
    public static final int PORT = 12345;  //port number, should get from

    public static void main(String[] args){
        System.out.println("Registry start working!\n");
        Registry registry = new Registry();
        registry.init();
    }

    public void init(){
        try{
            ServerSocket serverSocket = new ServerSocket(PORT);
        }
        catch (Exception e){
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
