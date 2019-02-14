package wireformats;

public abstract class Event{

    public byte eventType;
    public abstract byte getEventType();
    public abstract byte[] marshal();  //convert from String into byte array
    public abstract void unMarsha();  //convert from byte array into String

}
