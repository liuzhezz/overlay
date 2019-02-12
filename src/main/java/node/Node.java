package node;

import transport.TCPConnection;
import wireformats.Event;

public interface Node {  //keep the functions of send and receive information
     void onEvent(TCPConnection conn, Event e) throws Exception;
}
