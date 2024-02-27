package ChatApplication;

public class Message {
    User sender;
    User receiver;
    String messageContent;

    Message(User sender, User receiver, String messageContent) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageContent = messageContent;
    }
    public String toString() {
        return messageContent;
    }
}
