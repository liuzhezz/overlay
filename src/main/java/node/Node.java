package node;


import transport.TCPConnection;
import wireformats.Event;

public abstract class Node {  //keep the functions of send and receive information
     public abstract void responseEvent(TCPConnection connection, Event event);
}
