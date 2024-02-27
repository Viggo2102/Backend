package ChatApplication;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    List<User> userList = new ArrayList<>();
    List<Message> messageList = new ArrayList<>();

    public void addUser(User u) {
        userList.add(u);
    }

    public void sendMessage(User a, User b, String message) {
        Message newMessage = new Message(a,b,message);
        messageList.add(newMessage);
        System.out.println("Besked fra: " + newMessage.sender + " til: " + newMessage.receiver + " :" + message);
    }

    public void displayMessages() {
        for (Message m: messageList) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();
        User u = new User(1,"Viggo Beck");
        User u1 = new User(2,"Viktor Rasmussen");
        chatroom.addUser(u);
        chatroom.addUser(u1);
        System.out.println(chatroom.userList);
        chatroom.sendMessage(u,u1,"Hej med dig");
        chatroom.sendMessage(u,u1,"Hvad så");
        chatroom.sendMessage(u,u1,"Skal vi ryge en raket??");
        chatroom.displayMessages();

    }
}
