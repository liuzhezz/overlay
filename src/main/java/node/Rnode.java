package node;

public class Rnode {  //create an Rnode object for registered node.

    private int port;
    private byte[] ip;
    private int id;  //give a id for registered node so find quickly

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public byte[] getIp() {
        return ip;
    }

    public void setIp(byte[] ip) {
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object other){  //used to check whether the node is registered
        Rnode rnode = (Rnode) other;
        for(int i0 = 0; i0 < rnode.ip.length; i0++){
            if(this.ip[i0] != rnode.ip[i0])
                return false;
        }
        if (this.port != rnode.port)
            return false;
        return true;
    }
}
