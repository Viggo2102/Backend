package ChatApplication;

public class User {
    String userName;
    int ID;

    User(int ID, String userName) {
        this.ID = ID;
        this.userName = userName;
    }

    public String toString() {
        return ID + " " + userName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }
}
