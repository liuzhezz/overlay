package wireformats;

public class EventFactory {
    private static EventFactory eventFactory;
    private static Node node;

    public EventFactory(Node node){
        this.node = node;
        this.eventFactory = this;
    }
}
