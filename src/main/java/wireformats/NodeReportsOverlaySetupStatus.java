package wireformats;

public class NodeReportsOverlaySetupStatus extends Event {
    public byte eventType = Protocol.NodeReportsOverlaySetupStatus;

    @Override
    public byte getEventType(){
        byte b = 0;
        return b;
    }

    @Override
    public byte[] marshal() {  //convert from String into byte array
        byte[] marmsg = null;
        return marmsg;
    }

    @Override
    public void unMarsha(){

    }
}
