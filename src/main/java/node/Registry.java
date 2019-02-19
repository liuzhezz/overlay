package node;

import transport.TCPConnection;
import wireformats.Event;
import wireformats.Protocol;



public class Registry extends Node{// 1.register msg node 2.deregister msg node 3.create overlay 4.attribute weight to link

    public static void main(String[] args) throws Exception{
        if(args.length != 1){

        }

        Registry registry = new Registry(Integer.parseInt(args[0]));
        registry.init();
    }

    public Registry(int port) throws Exception{

    }



    public void init() throws Exception{
        try{

        }
        catch (Exception e){
            System.out.println("Registry initialize error: " + e.getMessage());
            throw e;
        }
    }

    public void responseEvent(TCPConnection connection, Event event){
        switch (event.getEventType()){
            case Protocol.NodeReportsOverlaySetupStatus:

                break;

            case Protocol.OverlayNodeReportsTaskFinished:

                break;

            case Protocol.OverlayNodeReportsTrafficSummary:

                break;

            case Protocol.OverlayNodeSendsData:

                break;

            case Protocol.OverlayNodeSendsDeregistration:

                break;

            case Protocol.OverlayNodeSendsRegistration:

                break;

        }
    }

}
