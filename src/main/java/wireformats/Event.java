package wireformats;

public abstract class Event{

    private byte eventType;
    public byte getEventType(){
        return eventType;
    }
    public abstract byte[] marshal();  //convert from String into byte array
    public abstract void unMarsha();  //convert from byte array into String

}
