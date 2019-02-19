package node;

import transport.TCPConnection;
import wireformats.Event;
import wireformats.Protocol;


public class MessagingNode extends Node{ //1.initiate communication 2.accept message 3.register on registry (use hashmap to store)


    public static void main(String[] args) {

    }

    public void responseEvent(TCPConnection connection, Event event){
        switch (event.getEventType()){
            case Protocol.RegistryReportsDeregistrationStatus:

                break;

            case Protocol.RegistryReportsRegistrationStatus:

                break;

            case Protocol.RegistryRequestsTaskInitiate:

                break;

            case Protocol.RegistryRequestsTrafficSummary:

                break;

            case Protocol.RegistrySendsNodeManifest:

                break;

        }
    }
}